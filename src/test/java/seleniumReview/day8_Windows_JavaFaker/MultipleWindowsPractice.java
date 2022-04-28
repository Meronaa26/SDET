package seleniumReview.day8_Windows_JavaFaker;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import seleniumReview.utilites.WebDriverFactory;

import java.util.concurrent.TimeUnit;

public class MultipleWindowsPractice {

    WebDriver driver;
    @BeforeClass
    public void setUpClass(){
        driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
        driver.get("https://www.amazon.com");
    }

    @Test
    public void multiple_windows_test(){
        ((JavascriptExecutor)driver).executeScript("window.open('http://google.com','_blank');");
        ((JavascriptExecutor)driver).executeScript("window.open('http://etsy.com','_blank');");
        ((JavascriptExecutor)driver).executeScript("window.open('http://facebook.com','_blank');");

        for (String each : driver.getWindowHandles()) {
            driver.switchTo().window(each);
            System.out.println("Title in current page  : " +  driver.getTitle());
            //THOSE BELOW ARE JUST EXTRA STEPS TO END THE LOOP WHERE EVER YOU WANT AND VERFIY THE TITEL
//            if(driver.getTitle().contains("Etsy")){
//                System.out.println(driver.getTitle());
//                Assert.assertTrue(driver.getTitle().contains("Etsy"));
//                break;
//            }
        }
    }

    @AfterClass
    public void tearDown() throws InterruptedException {
        Thread.sleep(1000);
        driver.close();
    }
}
