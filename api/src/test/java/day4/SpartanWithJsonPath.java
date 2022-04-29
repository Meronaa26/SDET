package day4;

import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import utilities.SpartanTestBase;

import static io.restassured.RestAssured.given;
import static org.testng.Assert.assertEquals;

public class SpartanWithJsonPath extends SpartanTestBase {


    @Test
    @DisplayName("Get all the names of ")
    public void test1(){

        Response response = given().accept(ContentType.JSON).and().
                pathParam("id",19)
                .when().get("/api/spartans/{id}");

        assertEquals(response.statusCode(),200);
        assertEquals("application/json",response.contentType());

        System.out.println("response.path(\"name\") = " + response.path("name"));

        //assigning response to jsonPath
        JsonPath jsonPath =response.jsonPath();
        int id= jsonPath.getInt("id");
        String name= jsonPath.getString("name");
        String gender =jsonPath.getString("gender");
        long phone= jsonPath.getLong("phone");

        System.out.println(id + " ," + name +  " ,"  + gender + " ,"  + phone );
    }
}
