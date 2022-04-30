package day6;

import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import pojo.Search;
import pojo.Spartan;
import utilities.SpartanTestBase;

import java.util.List;

import static io.restassured.RestAssured.given;


public class SpartanPojoGetRequestTest extends SpartanTestBase {

    @DisplayName("Get one spartan and convert it to Spartan Object")
    @Test
    public void oneSpartanPojo(){
        Response response = given().accept(ContentType.JSON).
                             and().pathParam("id", 19)
                            .when().get("/api/spartans/{id}")
                            .then().statusCode(200)
                            .log().all()
                            .extract().response();


        //de serialize--> Json to POJO (Java custom class)

        Spartan spartan19 = response.as(Spartan.class);
        System.out.println(spartan19);
        System.out.println("spartan19.getId() = " + spartan19.getId());
        System.out.println("spartan19.getGender() = " + spartan19.getGender());

         //second way of deserialization json to java
        //using JsonPath to deserialize to custom class
        JsonPath jsonPath = response.jsonPath();

         Spartan s19 =jsonPath.getObject("",Spartan.class);
        System.out.println(s19);
        System.out.println("s19.getName() = " + s19.getName());
        System.out.println("s19.getPhone() = " + s19.getPhone());

    }

    @Test
    public void spartanSearchWithPojo(){
        //spartan/search?nameContains=a &gender=Male
        //send get request to above endpoint and save first object with type spartan POJO

        JsonPath jsonPath = given().accept(ContentType.JSON)
                .and().queryParams("nameContains", "a",
                        "gender", "Male")
                .when().get("/api/spartans/search").then()
                .statusCode(200)
                .extract().jsonPath();


        //get the first spartan from content list and put inside spartan object

        Spartan sp1= jsonPath.getObject("content[0]",Spartan.class);


        System.out.println("sp1 = " + sp1);
        System.out.println("sp1 = " + sp1);
        System.out.println("sp1.getName() = " + sp1.getName());
        System.out.println("sp1.getGender() = " + sp1.getGender());
    }

    @Test
    public void test3(){


        Response response = given().accept(ContentType.JSON)
                .and().queryParams("nameContains", "a",
                        "gender", "Male")
                .when().get("/api/spartans/search").then()
                .statusCode(200)
                .extract().response();


        Search searchResult = response.as(Search.class);

        System.out.println("searchResult.getTotalElement() = " + searchResult.getTotalElement());
       // System.out.println("searchResult.getContent() = " + searchResult.getContent());
        System.out.println("searchResult.getContent().get(7).getName() = " + searchResult.getContent().get(7).getName());

    }

    @DisplayName("Get /spartans/search and save as List<Spartan>")
    @Test
    public void test4(){

        List<Spartan> spartanList = given().accept(ContentType.JSON)
                .and().queryParams("nameContains", "a",
                        "gender", "Male")
                .when().get("/api/spartans/search").then()
                .statusCode(200)
                .extract().jsonPath().getList("content", Spartan.class);


       // System.out.println("spartanList = " + spartanList);
        System.out.println("spartanList.get(2) = " + spartanList.get(2));
        System.out.println("spartanList.get(8).getName() = " + spartanList.get(8).getName());
        System.out.println("spartanList.get(45).getGender() = " + spartanList.get(45).getGender());


    }
}
