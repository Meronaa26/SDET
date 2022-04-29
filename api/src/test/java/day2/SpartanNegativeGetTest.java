package day2;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SpartanNegativeGetTest {

    @BeforeAll
    public static void init(){

        baseURI ="http://52.207.61.129:8000";
    }

    @Test
    public void test1(){
        //given accept type application/xml
         Response response = given().accept(ContentType.XML).get("/api/spartans/10");
         assertEquals(406,response.statusCode());

         //verify content type
          assertEquals(response.contentType(),"application/xml;charset=UTF-8");

    }
}
