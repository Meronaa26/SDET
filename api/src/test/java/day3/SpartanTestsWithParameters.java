package day3;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;
import static org.junit.jupiter.api.Assertions.*;



public class SpartanTestsWithParameters {

    @BeforeAll
    public  static void init(){

        RestAssured.baseURI ="http://52.207.61.129:8000";
    }

    @DisplayName("GET request to /api/spartans/{id} with ID 50")
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
        Response response = given().log().all().accept(ContentType.JSON).
                and().pathParam("id", 5)
                .when().get("/api/spartans/{id}");

       assertEquals(response.statusCode(),404, "Not Found");
       assertEquals(response.contentType(),"application/json");
       assertTrue(response.body().asString().contains("Not Found"));
    }

    @Test
    @DisplayName("GET request to api/spartans/search with query Params")
    public void test3(){
        Response response = given().log().all().accept(ContentType.JSON)
                .and().queryParam("nameContains", "e")
                .and().queryParam("gender", "female")
                .when().get("/api/spartans/search");

        assertEquals(response.contentType(),"application/json");
        assertEquals(response.statusCode(),200);
        assertTrue(response.body().asString().contains("Female"));
        assertTrue(response.body().asString().contains("Lorenza"));

    }
    @Test
    @DisplayName("GET request to api/spartans/search with query Params (MAP)" )
    public void tst4(){
        //create a map and add query params
        Map<String ,Object> queryMap= new HashMap<>();
        queryMap.put("nameContains","e");
        queryMap.put("gender","Female");

        Response  response = given().log().all()
                .accept(ContentType.JSON).and().queryParams(queryMap)
                .when().get("/api/spartans/search");


        assertEquals(response.contentType(),"application/json");
        assertEquals(response.statusCode(),200);
        assertTrue(response.body().asString().contains("Female"));
        assertTrue(response.body().asString().contains("Lorenza"));




    }
}
