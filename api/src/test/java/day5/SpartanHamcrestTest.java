package day5;

import io.restassured.http.ContentType;
import org.junit.jupiter.api.DisplayName;
import org.testng.annotations.Test;
import utilities.SpartanTestBase;

import java.util.List;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.is;

public class SpartanHamcrestTest extends SpartanTestBase {
    @DisplayName("GET Spartan/search and chaining together")
    @Test
    public void test1(){


        //I am not sure why I am getting connection refused in here====????
   List<String>names= given().accept(ContentType.JSON)
                .and()
                .queryParams("nameContains","j" ,"gender","Male")
                .when()
                .get("/api/spartans/search")
                .then()
                .statusCode(200)
                .and()
                .body("totalElements",is(6)).extract().response().jsonPath().getList("content.name");

    }
}
