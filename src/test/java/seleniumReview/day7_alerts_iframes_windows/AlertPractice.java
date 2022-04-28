package seleniumReview.day7_alerts_iframes_windows;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import seleniumReview.utilites.WebDriverFactory;

import java.util.concurrent.TimeUnit;

public class AlertPractice {

    WebDriver driver;
    @BeforeClass
    public void setUpClass(){
        driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
        driver.get("http://practice.cybertekschool.com/javascript_alerts");
    }
    @Test
    public void js_alert_test(){
        WebElement jsAlert= driver.findElement(By.xpath("//button[.='Click for JS Alert']"));
        jsAlert.click();


        Alert alert= driver.switchTo().alert();
        alert.accept();
        WebElement successfulTextMessage= driver.findElement(By.xpath("//p[.='You successfully clicked an alert']"));
       // System.out.println(successfulTextMessage.getText());

        Assert.assertTrue(successfulTextMessage.getText().equals("You successfully clicked an alert"),"Result is not displayed on the page");//we can verify both ways!!
        Assert.assertTrue(successfulTextMessage.isDisplayed(),"Actual text is not as expected ");


    }






    @AfterClass
    public void tearDown() throws InterruptedException {
        Thread.sleep(1000);
        driver.close();
    }
}
