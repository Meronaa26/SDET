package day7;

import io.restassured.http.ContentType;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import utilities.SpartanTestBase;

import java.util.LinkedHashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;

public class PutAndPatchRequestDemo extends SpartanTestBase {

    @DisplayName("Put ")
    @Test
    public void test1(){
        //just like post request we have different options to send body,we will go with map

        Map<String, Object> putRequestMap= new LinkedHashMap<>();
        putRequestMap.put("name","Meron");
        putRequestMap.put("gender","Male");
        putRequestMap.put("phone",2069999997);

        given().contentType(ContentType.JSON)
                .body(putRequestMap)
                .log().all()
                .and().pathParam("id",1697)
                .when().put("/api/spartans/{id}")
                .then().statusCode(204);

    }

    @Test
    public void patchRequest(){
        Map<String, Object> putRequestMap= new LinkedHashMap<>();
        putRequestMap.put("name","Meron");

        given().contentType(ContentType.JSON)
                .body(putRequestMap)
                .log().all()
                .and().pathParam("id",1697)
                .when().patch("/api/spartans/{id}")
                .then().statusCode(204);
    }

    @Test
    public void deleteRequest(){

        int  idTodelete= 22;
        given().pathParam("id",idTodelete).when().delete("/api/spartans/{id}").then().statusCode(204);
    }
}
