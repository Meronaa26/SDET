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


public class SpartanTestsWithParameters {

    @BeforeAll
    public  static void init(){

        RestAssured.baseURI ="http://52.207.61.129:8000";
    }

    @DisplayName("GET request to /api/spartans/{id} with ID 5")
    @Test
    public void test1(){

        Response response = given().accept(ContentType.JSON)
                .and().pathParam("id", 50)
                .when()
                .get("/api/spartans/{id}");

          assertEquals(200,response.statusCode());
          assertEquals(response.contentType(),"application/json");
         assertTrue(response.body().asString().contains("DrunkMike"));
    }

    @Test
    @DisplayName("GET request to /api/spartans/{id} response 404")
    public void test(){
        Response response = given().accept(ContentType.JSON).
                and().pathParam("id", 5)
                .when().get("/api/spartans/{id}");

       assertEquals(response.statusCode(),404, "Not Found");
       assertEquals(response.contentType(),"application/json");
       assertTrue(response.body().asString().contains("Not Found"));
    }
}
