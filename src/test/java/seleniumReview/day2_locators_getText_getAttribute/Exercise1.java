package seleniumReview.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Exercise1 {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver =new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.yahoo.com");
        String actualtitel= driver.getTitle();
        String expectedTitle= "Yahoo";
        System.out.println(actualtitel);
        //verify title
        if(actualtitel.contains(expectedTitle)){
            System.out.println("Title is as expected. Verification is Passed ");
        }else{
            System.out.println("Title is not as expected . Verification Failed");
        }


        driver.close();






        //selenium is a set of jar files that help us automate browsers
       // we use this jar files to automate test cases on web applications /pages ui
        // jar file==> is basically a bunch of classes and methods
        // jar== Java archive

        //what is maven
        // build automation tool
        //helps us automate project creation and management


    }
}
