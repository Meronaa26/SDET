package day10;

import io.restassured.path.xml.XmlPath;
import io.restassured.response.Response;
import org.junit.jupiter.api.Test;

import java.util.List;

import static io.restassured.RestAssured.get;


public class govXmlTest {

//    @BeforeAll
//    public static void setup(){
//
//        baseURI="https://data.ct.gov";
//        basePath="/api/views/qm34-pq7e/rows.xml";
//
//    }

    @Test
    public void test1(){

        Response response = get("https://data.ct.gov/api/views/qm34-pq7e/rows.xml").then()
                .statusCode(200).extract().response();

        XmlPath xmlPath= response.xmlPath();
        List<Object> list = xmlPath.getList("response.row.row.year");
        System.out.println("list = " + list);

        String xmlPathString = xmlPath.getString("response.row.row[4].@address");
        System.out.println("xmlPathString = " + xmlPathString);


    }
}
