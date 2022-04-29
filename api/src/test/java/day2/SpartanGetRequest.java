package day2;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SpartanGetRequest {

    String baseUrl="http://52.207.61.129:8000";



    @Test
    public void test1() {
        //Given accept type application/json
        Response response = RestAssured.given().accept(ContentType.JSON)
                .when()
                .get(baseUrl + "/api/spartans");

        //When user send Get request to api/spartans end point
        System.out.println(response.statusCode());

        //printing response content type from response object
        System.out.println("Printing Content Type   :"+ response.contentType());


        //print whole result body
        response.prettyPrint();

        //then  status code must be 200
        Assertions.assertEquals(response.statusCode(),200);

        // response content type must be application/json
        Assertions.assertEquals(response.contentType(),"application/json");



    }

    @Test
    public void test2(){

       // /api/spartans/95?Accept =application/json
        //Given accept is application/json
        Response response = RestAssured.given().accept(ContentType.JSON)
                .when()
                .get(baseUrl + "/api/spartans/95");

        System.out.println(response.statusCode());
        System.out.println(response.contentType());
        response.prettyPrint();

        Assertions.assertTrue(response.body().asString().contains("Lilias"));

    }


    @Test
    public void test3(){

        //Given no header provided
        //When users send Get request to /api/hello
        Response response = RestAssured.given().get(baseUrl + "/api/hello");
        response.prettyPrint();

      //Then response status code should be 200
        System.out.println(response.statusCode());

        //And content type header should be text/plain;charset=UTF-8
        Assertions.assertEquals(response.contentType(),"text/plain;charset=UTF-8");


        //how to get any header from response using header key?
        //we use response.header(String headerName) method to get any header value
        System.out.println(response.header("Content-Length"));  //print out the length of the string

        //verify content length is 17
       Assertions.assertEquals("17",response.header("Content-Length")); //header is retuning everything as string that is why we use "17" as strung

        //and body should be "Hello from Sparta"
        Assertions.assertEquals(response.body().asString(),"Hello from Sparta");

        //And header should contain date
        Assertions.assertTrue(response.headers().hasHeaderWithName("Date"));



    }









}
