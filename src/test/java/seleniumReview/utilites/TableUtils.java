package seleniumReview.utilites;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

public class TableUtils {


    public static void verifyOrder(WebDriver driver, String name) {
        //create a method name verifyOrder in TableUtils
        //Method takes WebDriver object and String(name)
        //Method should verify if given name exists in orders

        List<WebElement> listOfNames = driver.findElements(By.xpath("//table[@id='table1']//td[2]"));
        for (WebElement listOfName : listOfNames) {
           // System.out.println(listOfName.getText());
            if(listOfName.getText().equals(name)){
                Assert.assertTrue(true);
                return;
            }

        }

        Assert.assertTrue(false,"Name doesn't not exist in Table");
        }
    }
