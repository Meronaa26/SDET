package seleniumReview.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P6_CyberteckVerfication {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver =new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://practice.cybertekschool.com/inputs");
        Thread.sleep(2000);
        driver.findElement(By.partialLinkText("Home")).click();
        //className("nav-link")   locating using classname

        String actualTitle= driver.getTitle();
        String expectedTitle ="Practice";


        if(actualTitle.equals(expectedTitle)){
            System.out.println("Title is correct");
        }else{
            System.out.println("Title is not correct");
        }

    }
}
