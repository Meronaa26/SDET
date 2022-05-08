package day10;

import io.restassured.http.ContentType;
import io.restassured.path.xml.XmlPath;
import io.restassured.response.Response;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import utilities.SpartanAuthTestBase;

import java.util.List;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.is;

public class SpartanWithXml extends SpartanAuthTestBase {

   @DisplayName("Get")
    @Test
    public void getSpartanXml(){

       given().accept(ContentType.XML).and()
               .auth().basic("admin","admin")
               .when().get("/api/spartans")
               .then().statusCode(200)
               . contentType("application/xml;charset=UTF-8")
               .body("List.item[0].name" , is("MarkoBiniBrock"))
               .body("List.item[0].gender" , is("Male"))
                       .log().all();
   }

   @DisplayName("Get request /api/spartans with xmplPath")
    @Test
    public void testXmlPath(){

       Response response = given().accept(ContentType.XML)
               .and().auth().basic("admin", "admin")
               .when().get("/api/spartans");

       XmlPath xmlpath = response.xmlPath();
       String name= xmlpath.getString("List[3].name");
       System.out.println("name = " + name);
       int id= xmlpath.getInt("List.item[2].id");
       System.out.println("id = " + id);

       //how to get all names and save into list of string
       List<Object> xmlpathList = xmlpath.getList("List.item.name");
       System.out.println("xmlpathList = " + xmlpathList);


   }

}
