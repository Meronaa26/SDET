package day6;

import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import pojo.Employee;
import pojo.Region;
import utilities.HrTestBase;

import static io.restassured.RestAssured.given;

public class HrPojoTest extends HrTestBase {

    @Test
    public void test1(){


        JsonPath jsonPath = given().accept(ContentType.JSON)
                .and()
                .when().get("/regions").then()
                .statusCode(200)
                .extract().jsonPath();

        Region region1= jsonPath.getObject("items[0]", Region.class);
        System.out.println("region1 = " + region1);
        System.out.println("region1.getRegion_id() = " + region1.getRegion_id());
        System.out.println("region1.getRegion_name() = " + region1.getRegion_name());
        System.out.println("region1.getLinks().get(1) = " + region1.getLinks().get(0).getHref());
    }
    @DisplayName("GET request ")
    @Test
    public void test2(){
        //crate only 4 values as pojo class and ignore the other fields on the list

        Employee employee = given().accept(ContentType.JSON)
                .and()
                .when().get("/employees").then()
                .statusCode(200)
                .extract().jsonPath().getObject("items[0]", Employee.class);

        System.out.println(employee);
    }

}
