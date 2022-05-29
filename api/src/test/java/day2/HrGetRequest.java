package day2;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class HrGetRequest {

    //before all is a annotation equals to @BeforeClass in testNg , we use with static method name
    @BeforeAll
    public  static void init(){

        baseURI ="http://52.207.61.129:1000/ords/hr";
    }

    @DisplayName("GET request to /regions")
    @Test
    public void test1(){
        Response response = get("/regions");
        System.out.println(response.getStatusCode());
    }

    @Test
    public void test2(){
        Response response = given().accept(ContentType.JSON)
                .when()
                .get("/regions/2");



        response.prettyPrint();

       assertEquals(response.statusCode(),200);
       assertEquals(response.contentType(),"application/json");
       assertEquals(response.body().asString().contains("Americas"),true);



    }
}
