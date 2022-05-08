package day10;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.basePath;
import static io.restassured.RestAssured.baseURI;

public class govXmlTest {

    @BeforeAll
    public static void setup(){

        baseURI="https://data.ct.gov";
        basePath="/api/views/qm34-pq7e/rows.xml";

    }

    @Test
    public void test1(){

      //  given().accept(ContentType.XML)

    }
}
