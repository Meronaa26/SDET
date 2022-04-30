package utilities;

import io.restassured.RestAssured;
import org.junit.jupiter.api.BeforeAll;

public  abstract class SpartanTestBase {
    @BeforeAll
    public  static void init(){

        RestAssured.baseURI ="http://52.207.61.129:8000";

//        String dbUrl="jdbc:oracle:thin:@54.205.239.177:1521:xe";
//        String dbUsername="SP";
//        String  dbPassword="SP";
//
//       DBUtils.createConnection(dbUrl,dbUsername,dbPassword);
    }

//    @AfterAll
//    public static void tearDown(){
//        DBUtils.destroy();
//    }
}
