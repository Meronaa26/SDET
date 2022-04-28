package seleniumReview.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Exercse2 {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://practice.cybertekschool.com");
        String currentUrl = driver.getCurrentUrl();
        String expectedUrl= "cybertekschool";
        if(currentUrl.contains(expectedUrl)){
            System.out.println("Verfication passed");
        }else{
            System.out.println("verfication failed");
        }


        String title= driver.getTitle();
        String expectedtitle="Practice";

        if(title.contains(expectedtitle)){
            System.out.println("Title is correct");
        }else{
            System.out.println("Title is not correct");
        }
    }
}
