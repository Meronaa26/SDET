package seleniumReview.day10_webtable_properties_practices;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import seleniumReview.base.TestBase;
import seleniumReview.utilites.ConfigurationReader;
import seleniumReview.utilites.TableUtils;

public class Table_Tasks  extends TestBase {


    @Test
    public void task3_return_tims_due_amount(){
        String url= ConfigurationReader.getProperty("dataTableUrl");
        driver.get(url);
        WebElement timDueAmount= driver.findElement(By.xpath("//table[@id='table1']//td[.='Tim']/following-sibling ::td[2]"));
                                                      //            //table[@id='table1']//td[.='Tim']/../td[4]
        System.out.println("timDueAmount.getText() = " + timDueAmount.getText());


    }

    @Test
    public void task4_verify_order_method(){
        String url= ConfigurationReader.getProperty("dataTableUrl");
        driver.get(url);
        TableUtils.verifyOrder(driver,"Tim");

    }
}
