package utilities;

import io.restassured.RestAssured;
import org.junit.jupiter.api.BeforeAll;

public class SpartanAuthTestBase {


    @BeforeAll
    public static void init(){
        RestAssured.baseURI =  "https://52.207.61.129:7000";
    }
}
