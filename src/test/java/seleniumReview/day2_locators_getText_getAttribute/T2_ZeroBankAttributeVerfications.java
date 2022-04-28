package seleniumReview.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T2_ZeroBankAttributeVerfications {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://zero.webappsecurity.com/login.html");

        WebElement zeroBankLink=driver.findElement(By.className("brand"));

        String expectedLinkText= "Zero Bank";
        String actualLinkText=zeroBankLink.getText();


        if(actualLinkText.equals(expectedLinkText)){
            System.out.println("Correct");
        }else{
            System.out.println("Not Correct");
        }



        //verify link
        String expectedInAttributeValue="index.html";
        String actualHrfValue =  zeroBankLink.getAttribute("href");


        if(actualHrfValue.contains(expectedInAttributeValue)){
            System.out.println("Correct");
        }else{
            System.out.println("Not Correct");
        }

    }
}
