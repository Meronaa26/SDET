package day4;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import utilities.HrTestBase;

import java.util.List;

import static io.restassured.RestAssured.given;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ORDSApiTestWithPath extends HrTestBase {

    @Test
    @DisplayName("Get request to countries with Path Method ")
    public void test1(){
        Response response = given().accept(ContentType.JSON)
                            .queryParam("q","{\"region_id\": 2}").
                            get("/countries");

        System.out.println("response.path(\"limit\") = " + response.path("limit"));
        System.out.println("response.path(\"hasMore\") = " + response.path("hasMore"));
        System.out.println("response.path(\"item[0].country_id\") = " + response.path("items[0].country_id"));
        System.out.println("response.path(\"items[0].country_name\") = " + response.path("items[2].country_name"));
        System.out.println("response.path(\"items[0].links[0]\") = " + response.path("items[2].links[0].href"));


        //assert that all region id equal to 2
       // response.path("items")

        List<Integer>regionId=response.path("items.region_id");
       System.out.println(regionId);

        for (Integer regionIds : regionId) {
            System.out.println(regionIds);
            //assertEquals(2,regionIds);
        }

    }

    @Test
    @DisplayName("GET are quest to employees and get only employees who works as a IT_PROG")
    public void test2(){
        Response response= given().accept(ContentType.JSON)
                .and().queryParam("q", "{\"job_id\": \"IT_PROG\"}").log().all()
                .when().get("/employees");

        assertEquals(response.statusCode(),200);
        assertEquals(response.contentType(),"application/json");
        assertTrue(response.body().asString().contains("AHUNOLD"));// we don't use contains method because it is wide open


        // make sure we only have it program as job id

        List<String>allJobIds= response.path("items.job_id");
        for (String jobId : allJobIds) {
            System.out.println(jobId);
            assertEquals(jobId,"IT_PROG");

        }
        //print name of it programmers

    }


}
