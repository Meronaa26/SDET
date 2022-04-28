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

public class WindowPractice {

    WebDriver driver;

    @BeforeMethod
    public void setUpMethod(){
        driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.get("http://practice.cybertekschool.com/windows");
    }

    @Test
    public void window_test(){
        String mainHandel=driver.getWindowHandle();
        System.out.println(mainHandel);   //will print UNIQUE GENERATED ID

        //Assert title is practice
        String actualTitle= driver.getTitle();
        System.out.println(actualTitle);
        String expectedTitle="Windows";
        Assert.assertTrue(actualTitle.equals(expectedTitle));

           //click to "click here" text
        WebElement linkText= driver.findElement(By.xpath("//a")); //   another way to locate ==> linkText("Click Here")
        linkText.click();

        driver.getTitle();  //to check if the window changes and it doesn't because we didn't switch windows


        for ( String eachWindow : driver.getWindowHandles()) {
            driver.switchTo().window(eachWindow);
            System.out.println("CURRENT TITLE WHILE SWITCHING :" + driver.getTitle());
           // if(driver.getTitle().contains("somthing")){ break;}      //To prevent from switching into all the windows and break in what you want you can add this line
        }

        String actualTitleAfterClick =driver.getTitle();
        System.out.println("Actual title after click : "  + actualTitleAfterClick);
    }

    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(1000);
        driver.close();
    }
}
