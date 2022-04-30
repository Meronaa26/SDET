package day5;

import io.restassured.http.ContentType;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import utilities.DBUtils;
import utilities.SpartanTestBase;

import java.util.Map;

import static io.restassured.RestAssured.*;
import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;

public class SpartanAPIvsDB extends SpartanTestBase {


    @DisplayName("Get one spartan from api database")
    @Test
    public void testDB1(){
        //get id , name, gender, phone from database
        //get some information from api
        //compare

        String query= "select spartan_id,name,gender,phone  from spartans\n" +
                "where spartan_id =19";

        //save data inside map
        Map<String, Object> rowMap = DBUtils.getRowMap(query);   // couldn't get the connection
       System.out.println(rowMap);


       //Deserialization here json to java with jackson objectMapper
        Map<String,Object> apimap = given().accept(ContentType.JSON).pathParam("id", 19)
                .when().get("/api/spartans/{id}").then().statusCode(200)
                .and().contentType("application/json").extract().response().as(Map.class);

        System.out.println(apimap);

        //compare
        assertThat(apimap.get("id").toString(),is(rowMap.get("SPARTAN_ID").toString()));
        assertThat(apimap.get("gender"),is(rowMap.get("GENDER")));
        assertThat(apimap.get("name"),is(rowMap.get("NAME")));
        assertThat(apimap.get("phone").toString(),is(rowMap.get("PHONE").toString()));



    }
}
