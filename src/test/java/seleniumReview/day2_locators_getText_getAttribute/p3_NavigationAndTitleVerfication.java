package seleniumReview.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class p3_NavigationAndTitleVerfication {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.get("https://google.com");
        driver.manage().window().maximize();
        Thread.sleep(3000);
        driver.findElement(By.linkText("Gmail")).click();

        String currentTitle= driver.getTitle();
        String expectedTitle="Gmail";

        if(currentTitle.contains(expectedTitle)){
            System.out.println("Passed");
        }else{
            System.out.println("Failed");
        }


    }
}
