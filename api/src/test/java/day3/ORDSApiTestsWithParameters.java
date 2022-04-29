package day3;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ORDSApiTestsWithParameters {

    @BeforeAll
    public  static void init(){

        RestAssured.baseURI ="http://52.207.61.129:1000/ords/hr";
    }

    @Test
    @DisplayName("\"GET are quest to employees and get only region id=2")
    public void test1(){


     // "region_id":2
        Response response = given()
                                .accept(ContentType.JSON).and()
                                      .queryParam("q","{\"region_id\":2}")
                                        .log().all()
                                            .when().get("/countries");

        assertEquals(200,response.statusCode());
        assertEquals(response.contentType(),"application/json");
        assertTrue(response.body().asString().contains("United States of America"));


        response.prettyPrint();
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

    }
}
