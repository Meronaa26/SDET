package day7;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import pojo.Spartan;
import utilities.SpartanTestBase;

import java.util.LinkedHashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class SpartanPostRequestDemo  extends SpartanTestBase {

    @Test
    public void postMethod1(){
        String requestJsonBody ="{\"name\": \"Meron\",\n" +
                "        \"gender\": \"Male\",\n" +
                "        \"phone\": 2069999997}";

        Response response = given().accept(ContentType.JSON).and().contentType(ContentType.JSON)
                .body(requestJsonBody)
                .when()
                .post("/api/spartans");

        assertThat(response.statusCode(),is(201));
        assertThat(response.contentType(),is("application/json"));

        String expectedResponseMessage="A Spartan is Born!";
      assertThat(response.path("success"), Matchers.<Object>is(expectedResponseMessage));
        assertThat(response.<String>path("data.name"),is("Meron"));
        assertThat(response.<String>path("data.gender"),is("Male"));
        assertThat(response.<Integer>path("data.phone"),is(2069999997));
    }

    @DisplayName(" Post with Map to JSON")
    @Test
    public void postMethod2(){

        //create a map to keep request json body information
        Map<String, Object> requestJsonMap= new LinkedHashMap<>();
        requestJsonMap.put("name","Meron");
        requestJsonMap.put("gender","Male");
        requestJsonMap.put("phone",2069999997);


        Response response = given().accept(ContentType.JSON).and().contentType(ContentType.JSON)
                .body(requestJsonMap).log().all()
                .when()
                .post("/api/spartans");

        assertThat(response.statusCode(),is(201));
        assertThat(response.contentType(),is("application/json"));

        String expectedResponseMessage="A Spartan is Born!";
        assertThat(response.path("success"), Matchers.<Object>is(expectedResponseMessage));
        assertThat(response.<String>path("data.name"),is("Meron"));
        assertThat(response.<String>path("data.gender"),is("Male"));
        assertThat(response.<Integer>path("data.phone"),is(2069999997));

        response.prettyPrint();
    }

    @DisplayName(" Post with Map to JSON")
    @Test
    public void postMethod3(){
        Spartan spartan =new Spartan();
        spartan.setName("Meron");
        spartan.setGender("Male");
        spartan.setPhone(2069999997);

        System.out.println("spartan = " + spartan);

        Response response = given().accept(ContentType.JSON).and().contentType(ContentType.JSON)
                .body(spartan).log().all()
                .when()
                .post("/api/spartans");

        assertThat(response.statusCode(),is(201));
        assertThat(response.contentType(),is("application/json"));

        String expectedResponseMessage="A Spartan is Born!";
        assertThat(response.path("success"), Matchers.<Object>is(expectedResponseMessage));
        assertThat(response.<String>path("data.name"),is("Meron"));
        assertThat(response.<String>path("data.gender"),is("Male"));
        assertThat(response.<Integer>path("data.phone"),is(2069999997));

        response.prettyPrint();
    }

    @DisplayName(" Post with Map to JSON")
    @Test
    public void postMethod4(){

        //this example we implement serialization  certain spartan object as a request body
        //also implemented deserialization getting the id, sending get request and saving that body as a response



        //create one object from your pojo and send it as a json
        Spartan spartan =new Spartan();
        spartan.setName("Meron");
        spartan.setGender("Male");
        spartan.setPhone(2069999997);

        System.out.println("spartan = " + spartan);
        String expectedResponseMessage="A Spartan is Born!";

        int anInt = given().accept(ContentType.JSON).and().//what we are asking from api which is json response
                 contentType(ContentType.JSON)// what we are sending to api which is JSON also
                .body(spartan).log().all()
                .when()
                .post("/api/spartans").
                then().statusCode(201).
                contentType("application/json").
                body("success", is(expectedResponseMessage))
                .extract().jsonPath().getInt("data.id");
        System.out.println("anInt = " + anInt);


        //send a get request to id
        Spartan spartanPosted = given().accept(ContentType.JSON).and().
                                pathParam("id", anInt).
                                when().get("/api/spartans/{id}").
                                then()
                                .statusCode(200)
                                .log().all().extract().as(Spartan.class);

             assertThat(spartanPosted.getName(),is(spartan.getName()));
            assertThat(spartanPosted.getGender(),is(spartan.getGender()));
            assertThat(spartanPosted.getPhone(),is(spartan.getPhone()));
            assertThat(spartanPosted.getId(),is(anInt));
    }

}
