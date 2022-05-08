package day10;

import io.restassured.path.xml.XmlPath;
import io.restassured.response.Response;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.*;

public class FormulaOneXmlTest {

    @BeforeAll
    public static void setup(){

        baseURI="http://ergast.com";
        basePath="/api/f1";

    }

    @Test
    public void test1(){

        Response response = given().pathParam("driver", "alonso")
                .when()
                .get("/drivers/{driver}")
                .then().statusCode(200)
                .log().all().extract().response();

        XmlPath xmlPath = response.xmlPath();
        String givenName = xmlPath.getString("MRData.DriverTable.Driver.GivenName");
        System.out.println("givenName = " + givenName);
        String nationality = xmlPath.getString("MRData.DriverTable.Driver.Nationality");
        System.out.println("nationality = " + nationality);

        //get driver id    @ sign we can access the attribute value
        String getDriverId = xmlPath.getString("MRData.DriverTable.Driver.@driverId");
        System.out.println("getDriverId = " + getDriverId);

        String getDriverCode = xmlPath.getString("MRData.DriverTable.Driver.@code");
        System.out.println("getDriverCode = " + getDriverCode);

        String getDriverUrl = xmlPath.getString("MRData.DriverTable.Driver.@url");
        System.out.println("getDriverUrl = " + getDriverUrl);


    }

}
