package seleniumReview.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P5_EtsySearch_TitleVerfication {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver =new ChromeDriver();

        driver.get("https://www.etsy.com");
        driver.manage().window().maximize();
        driver.findElement(By.id("global-enhancements-search-query")).sendKeys("wooden spoon" + Keys.ENTER);
        String actualTitle = driver.getTitle();
        String expectedTitle ="Wooden spoon | Etsy";

        if(actualTitle.equals(expectedTitle)){
            System.out.println("Title is correct");
        }else{
            System.out.println("Title is not correct");
        }

    }
}
