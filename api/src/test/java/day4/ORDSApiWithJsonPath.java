package day4;

import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import utilities.HrTestBase;

import java.util.List;

import static io.restassured.RestAssured.get;
import static io.restassured.RestAssured.given;

public class ORDSApiWithJsonPath extends HrTestBase {

    @Test
    @DisplayName("Get request to countries")
    public void test1(){
        Response response=get("/countries");
        JsonPath jsonPath= response.jsonPath();
       String name= jsonPath.getString("items[1].country_name");
       List<String>allcountryName=jsonPath.getList("items.country_name");
        System.out.println(allcountryName);
        System.out.println(name);

        //get all country ids
        List<String>allcountryIds= jsonPath.getList("items.country_id");
        System.out.println(allcountryIds);

        //get all country name where their region id is equal to 2
        List<String> allCountryIds = jsonPath.getList("items.findAll{it.region_id==3}.country_name");
        System.out.println(allCountryIds);


    }
    @Test
    @DisplayName(("Get request to / employees with query param"))
    public void test3(){
        //we added limit query param to get 107 employees
        Response response=given().queryParam("limit" ,107).get("/employees");

        // get all email of employees works as IT_PROG
        JsonPath jsonPath = response.jsonPath();

        List<String> emailofAllEmployees = jsonPath.getList("items.findAll{it.job_id==\"IT_PROG\"}.email");
        System.out.println(emailofAllEmployees);

        List<String> employeesSalary = jsonPath.getList("items.findAll{it.salary>=10000}.first_name");
        System.out.println("employee salary >10000  : " + employeesSalary);

        //get the max salary firstname
        String maxSalaryFirstName = jsonPath.getString("items.max{it.salary}.first_name");
        System.out.println(maxSalaryFirstName);
        String maxSalary = response.path("items.max{it.salary}.first_name");
        System.out.println("maxSalary = " + maxSalary);


        //THIS ARE GROOVY SYNATXES WE CAN GOOGLE FOR MORE SYNTAX
    }
}
