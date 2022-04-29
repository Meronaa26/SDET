package day3;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static io.restassured.RestAssured.given;
import static org.testng.Assert.assertEquals;

public class SpartanTestsWithPath {


    @BeforeAll
    public  static void init(){

        RestAssured.baseURI ="http://52.207.61.129:8000";
    }

    @Test
    @DisplayName("Get one spartan with path Method")
    public void test1(){
        Response response = given().accept(ContentType.JSON).and().
                              pathParam("id",19)
                                  .when().get("/api/spartans/{id}");

        assertEquals(response.statusCode(),200);
        assertEquals("application/json",response.contentType());

        //verify each json key has specific value
        System.out.println("response.path(\"id\").toString() = " + response.path("id").toString());
        System.out.println("response.path(\"name\").toString() = " + response.path("name").toString());
        System.out.println("response.path(\"gender\").toString() = " + response.path("gender").toString());
        System.out.println("response.path(\"phone\").toString() = " + response.path("phone").toString());


        int id=response.path("id");
        String name= response.path("name");
        String gender = response.path("gender");
        int phone= response.path("phone");


        System.out.println("id" + id   + "  , name : " + name + " , gender : " + gender + "  ,phone  : " + phone);

        assertEquals(19,id);
        assertEquals("Peri" ,name);
        assertEquals(gender, "Female");
       // assertEquals("1234567890",phone);
    }

    @Test
    @DisplayName("Get all spartan and navigate with Path()")
    public void test2(){
         Response response = given().accept(ContentType.JSON).when().get("/api/spartans");

        // response.prettyPrint();

        int firstId= response.path("id[0]");
        System.out.println(firstId);

        int secondId= response.path("id[1]");
        System.out.println(secondId);


        String lastFirstname= response.path("name[-1]");
        System.out.println(lastFirstname);

        List<String>names=response.path("name");

        for (String listOfnames : names) {
            System.out.println(listOfnames);

        }
    }
}
