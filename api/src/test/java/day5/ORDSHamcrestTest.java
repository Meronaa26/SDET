package day5;

import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import utilities.HrTestBase;

import java.util.Arrays;
import java.util.List;

import static io.restassured.RestAssured.given;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class ORDSHamcrestTest extends HrTestBase {

    @DisplayName("FET request to Employees IT_PROG endpoint and chaining")
    @Test
    public void test1(){
        //send a get request to employees endpoint with query parameter job_id IT_PROG
        //verify each job_id is IT_PROG
// verify first names are.....(find proper
        //verify first names are ......

        List<String> listOfName= Arrays.asList("Alexander","Bruce","David","Valli","Diana");
          given().accept(ContentType.JSON)
                  .when()
                  .queryParam("q","{\"job_id\": \"IT_PROG\"}")
                  .when().get("/employees")
                  .then()
                  .statusCode(200)
                  .body("items.job_id", everyItem(equalTo("IT_PROG")))
                  .body("items.first_name",containsInRelativeOrder("Alexander","Bruce","David","Diana"))//
                  .body("items.first_name",equalToObject(listOfName))  // equality of assertion

          ;

          //containsInRelativeOrder    is verifying order is same
        //Bruce, Alexander ,David,Valli ,Diana
    }

    @Test
    public void employeeTest1(){
      //we want to chain and get response object

        JsonPath jsonPath = given().accept(ContentType.JSON)
                .queryParam("q", "{\"job_id\": \"IT_PROG\"}")
                .when()
                .get("/employees")
                .then()
                .statusCode(200).body("items.job_id", everyItem(equalTo("IT_PROG")))
                .extract().jsonPath();

        //response.prettyPrint();
        //assert that we only have 5 firstnames
        assertThat(jsonPath.getList("items.first_name"),hasSize(5));

       //assertThat(jsonPath.getList("items.first_name"),containsInRelativeOrder("Alexander","Bruce","David","Diana"))
    }
}
