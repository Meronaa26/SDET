package seleniumReview.base;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import seleniumReview.utilites.ConfigurationReader;
import seleniumReview.utilites.WebDriverFactory;

import java.util.concurrent.TimeUnit;

public abstract class TestBase {

  public WebDriver driver;
    @BeforeClass
    public void setUp(){

        String browser= ConfigurationReader.getProperty("browser");
        driver= WebDriverFactory.getDriver(browser);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);


    }

    @AfterMethod
    public void tearDownMethod(){
        driver.close();
    }
}
