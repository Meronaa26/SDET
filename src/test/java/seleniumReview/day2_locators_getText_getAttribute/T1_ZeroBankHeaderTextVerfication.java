package seleniumReview.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class T1_ZeroBankHeaderTextVerfication {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://zero.webappsecurity.com/login.html");

       String actualHeader= driver.findElement(By.tagName("h3")).getText();
       String expectedHeader="Log in to ZeroBank";

       if(actualHeader.equals(expectedHeader)){
           System.out.println("Correct!!");
       }else{
           System.out.println("Not Correct");
       }
    }
}
