package seleniumReview.day10_webtable_properties_practices;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import seleniumReview.utilites.ConfigurationReader;
import seleniumReview.utilites.TableUtils;
import seleniumReview.utilites.WebDriverFactory;

import java.util.concurrent.TimeUnit;

public class Table_Tasks {

    WebDriver driver;
    @BeforeClass
    public void setUp(){

        String browser= ConfigurationReader.getProperty("browser");
        driver= WebDriverFactory.getDriver(browser);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
        String url= ConfigurationReader.getProperty("dataTableUrl");
        driver.get(url);
    }
    @Test
    public void task3_return_tims_due_amount(){

        WebElement timDueAmount= driver.findElement(By.xpath("//table[@id='table1']//td[.='Tim']/following-sibling ::td[2]"));
                                                      //            //table[@id='table1']//td[.='Tim']/../td[4]
        System.out.println("timDueAmount.getText() = " + timDueAmount.getText());


    }

    @Test
    public void task4_verify_order_method(){

        TableUtils.verifyOrder(driver,"Tim");

    }
}
