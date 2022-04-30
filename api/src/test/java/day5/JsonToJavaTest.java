package day5;

import io.restassured.response.Response;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import utilities.SpartanTestBase;

import java.util.List;
import java.util.Map;

import static io.restassured.RestAssured.get;
import static io.restassured.RestAssured.given;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class JsonToJavaTest extends SpartanTestBase {

    @DisplayName("Get one Spartan and deserialize to map")
    @Test
    public void oneSpartanToMap(){
        Response response = given().pathParam("id", 19)
                .when()
                .get("/api/spartans/{id}")
                .then()
                .statusCode(200)
                .extract()
                .response();

        //get the json and convert to map

        Map<String, Object> jsonMap= response.as(Map.class);
        System.out.println(jsonMap.toString());

        String actualName= (String) jsonMap.get("name");
        assertThat(actualName, is("Peri"));


    }
    @DisplayName("Get all spartans to JAVA data structure")
    @Test
    public void getAllSpartan(){

        Response response = get("/api/spartans").then().statusCode(200).extract().response();
        //we need to convert json to java which is deserialization
        List<Map<String,Object>>jsonList=response.as(List.class);
        System.out.println("jsonList.get(1).get(\"name\") = " + jsonList.get(1).get("name"));

        Map<String,Object>spartan3= jsonList.get(3);
        System.out.println(spartan3);
    }

}
