package day4;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.*;

public class CBTrainingApiWithJsonPath {
    @BeforeAll
    public  static void init(){

        RestAssured.baseURI ="http://api.cybertektraining.com";
    }

    @Test
    @DisplayName("")
    public void test1(){
        //send a get request to student id 23401 as a path param
        //verify status  code/content type/ content-encoding =gzip
        //verify date header exist
        //assert that
              /*
              * firstname vera
              * batch 14
              * section 12
              * email adrress
              * */

        Response response = given().pathParam("id", 23401).when().get("/student");
        JsonPath jsonPath = response.jsonPath();
        response.statusCode();
        response.contentType();
    }
}
