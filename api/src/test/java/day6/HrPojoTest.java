package day6;

import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import pojo.Employee;
import pojo.Region;
import pojo.Regions;
import utilities.HrTestBase;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static io.restassured.RestAssured.given;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

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


    @DisplayName("Get")
    @Test
    public void test5(){

        Regions regions= given().accept(ContentType.JSON)
                .and()
                .when().get("/regions").then()
                .statusCode(200)
                .extract().response().as( Regions.class);
        //send everything inside the region object
        //since we prepare pojo also for the all properties we don't need to use any path as() method is enough


      assertThat(regions.getCount(),is(19));



      //create empty list to store values
        List<String> regionName= new ArrayList<>();
        List<Integer> regionIds=new ArrayList<>();



        //get list of regions out of regions object
        List<Region>items=regions.getItems();

        //loop through each of the region , save their ids and names to empty list that we prepare

        for (Region region : items) {
            regionIds.add(region.getRegion_id());
            regionName.add(region.getRegion_name());
        }


       List<Integer>expectedRegionIds= Arrays.asList(1, 2, 3, 4, 10, 15, 19, 21, 28, 98, 99, 309, 312, 374, 486, 503, 922, 999, 5801);
        List<String>expectedRegionNames= Arrays.asList("Europe","Americas","Asia" ,"Middle East and Africa");


        assertThat(regionIds,is(expectedRegionIds));
        assertThat(regionName, is(equalTo(expectedRegionNames)));


    }
}
