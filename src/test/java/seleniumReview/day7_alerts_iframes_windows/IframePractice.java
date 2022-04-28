package seleniumReview.day7_alerts_iframes_windows;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import seleniumReview.utilites.WebDriverFactory;

import java.util.concurrent.TimeUnit;

public class IframePractice {

    WebDriver driver;

    @BeforeMethod
    public void setUpMethod(){
        driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.get("http://practice.cybertekschool.com/iframe");
    }

    @Test
    public void iframe_test(){
        //1 ==> Changing to iframe by index : we pass index number
        driver.switchTo().frame(0);


        //2==> Locate as a Web element to switch
        //we find and locate <iframe> web element from the page
       // WebElement iframe =driver.findElement(By.xpath("//iframe[@class='tox-edit-area__iframe']")); another way to switch iframe
      //  driver.switchTo().frame("mce_0_ifr");       another way

        //3==>Locating web element text
        WebElement yourContentGoesHereText=driver.findElement(By.xpath("//p"));

        //Asserting text is displayed
        Assert.assertTrue(yourContentGoesHereText.getText().equals("Your content goes here."));

        driver.switchTo().parentFrame();
       // driver.switchTo().defaultContent(); same as above

        //Locating  header as web element
        WebElement headerText= driver.findElement(By.xpath("//h3"));

        Assert.assertTrue(headerText.getText().equals("An iFrame containing the TinyMCE WYSIWYG Editor"));

    }

    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(1000);
        driver.close();
    }
}
