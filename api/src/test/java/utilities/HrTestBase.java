package utilities;

import io.restassured.RestAssured;
import org.junit.jupiter.api.BeforeAll;

public  abstract class HrTestBase {

    @BeforeAll
    public  static void init(){

        RestAssured.baseURI ="http://52.207.61.129:1000/ords/hr";
    }
}
