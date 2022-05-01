package day8;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

public class BookITTest {


    @BeforeAll
    public  static void init(){

        RestAssured.baseURI ="https://cybertek-reservation-api.herokuapp.com";
    }
    String token="Bearer eyJhbGciOiJIUzI1NiJ9.eyJqdGkiOiI4MiIsImF1ZCI6InN0dWRlbnQtdGVhbS1tZW1iZXIifQ.zIcFXhVng5REMvXmUGrJRSPMp87ImMqxVoM6ofeDpZA";
    @DisplayName("Get all campuses")
    @Test
    public void testAuth1(){

        given().header("Authorization",token)
                .and()
                .accept(ContentType.JSON)
                .when()
                .get("/api/campuses")
                .then()
                .statusCode(200)
                .log().all();

    }
}
