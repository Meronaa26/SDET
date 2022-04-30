package day5;

import io.restassured.http.ContentType;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;

public class HamcrestMatcherApiTest {


//    @BeforeAll
//    public  static void init(){
//
//        RestAssured.baseURI ="http://52.207.61.129:8000";
//    }
//


    @DisplayName("One sparatan with hamcrest and chaining ")
    @Test
    public void test1(){

                given()
                       .accept(ContentType.JSON)
                       .and().pathParam("id",19)
               .when()
                        .get("http://52.207.61.129:8000/api/spartans/{id}")
                        .then()
                        .statusCode(200)
                             .and().assertThat()
                              .contentType("application/json")
                             .and()
                             .body("id",equalTo(19),
                                     "name",is("Peri"),
                                     "gender",is("Female"),
                                     "phone",is(1234567890)).log().all();

    }
    @DisplayName("CBTraining Teacher request with chaining and Matchers")
    @Test
    public void teacherDate(){

                      given()
                         .accept(ContentType.JSON)
                         .and()
                         .pathParam("id" ,"10423")
                     .when()
                         .get("http://api.cybertektraining.com/teacher/{id}")
                              .then()
                              .statusCode(200)
                              .and()
                              .contentType("application/json")
                             .and()
                             .header("Date",notNullValue())
                              .and()
                              .header("Connection",is("Keep-Alive"))
                              .and().assertThat()
                              .body("teachers[0].firstName",is("Alexander"))
                              .body("teachers[0].lastName",is("Syrup"))
                              .body("teachers[0].gender", is("male"));

    }
@DisplayName("GET request  to teachers/")
    @Test
    public void teachersTest(){


                    given()
                         .accept(ContentType.JSON)
                     .when()
                         .get("http://api.cybertektraining.com/teacher/all")
                            .then()
                            .statusCode(200)
                            .and()
                            .body("teachers.firstName",hasItems("Alexander","Darleen","Sean"));
}
}
