package utilities;

import io.restassured.RestAssured;
import org.junit.jupiter.api.BeforeAll;

public class SpartanAuthTestBase {


    @BeforeAll
    public static void init(){

       // RestAssured.baseURI =  "https://52.207.61.129:7000";
        RestAssured.baseURI =  "http://44.195.19.167:7000"; //used it after day 10
    }
}
