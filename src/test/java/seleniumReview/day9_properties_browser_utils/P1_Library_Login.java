package seleniumReview.day9_properties_browser_utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import seleniumReview.utilites.BrowserUtils;
import seleniumReview.utilites.ConfigurationReader;
import seleniumReview.utilites.LibraryUtils;
import seleniumReview.utilites.WebDriverFactory;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class P1_Library_Login {

    WebDriver driver;
    @BeforeClass
    public void setUpClass(){
        driver= WebDriverFactory.getDriver(ConfigurationReader.getProperty("browser"));
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
        driver.get("http://library2.cybertekschool.com/login.html");
    }



    @Test
    public void login_link_count_test(){
       //calling to login library app
       LibraryUtils.loginToLibrary(driver);

        BrowserUtils.sleep(3);
        //Print out count of all the links on landing page
        List<WebElement>allinks= driver.findElements(By.xpath("//body//a"));
               allinks.size();

        //Print out wach link text on this page
        for (WebElement each : allinks) {
            System.out.println(each.isSelected());

        }
    }

}
