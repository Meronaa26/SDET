package day8;

import io.restassured.http.ContentType;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import utilities.SpartanAuthTestBase;

import static io.restassured.RestAssured.get;
import static io.restassured.RestAssured.given;


public class SpartanWithAuthTests  extends SpartanAuthTestBase {

    @DisplayName("Get /api/spartans as a public user(guest) expect 401")
    @Test
    public void test1(){


        get("/api/spartans").then().statusCode(401).log().all();   // 401 I don't know who you are ==> verification /Authentication
    }

    @DisplayName("GET /api/spartans as admin user expect 200")
    @Test
    public void testAdmin(){

              given().auth().
                      basic("admin","admin")
                      .and().accept(ContentType.JSON)
                      .when()
                      .get("/api/spartans")
                      .then()
                      .statusCode(200)
                      .log().all();
    }

    @DisplayName("DELETE /spartans/{id} as editor user expect 403")   // only Admin can delete a ==> Authorization   no right to delete
    @Test
    public void testEditorDelete(){

        given().auth().basic("editor","editor")
                .and().accept(ContentType.JSON)
                .and().pathParam("id",19)
                .when()
                .delete("/api/spartans/{id}").then()
                .statusCode(403)
                .log().body();
    }
}
