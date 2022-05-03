package seleniumReview.day12_actions_upload_jsExcutor;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import seleniumReview.utilites.ConfigurationReader;
import seleniumReview.utilites.Driver;

public class DriverUtilPractice {
    @Test
    public void simple_google_search_test(){

        // go to google.com
       // Driver.getDriver().get("https://www.google.com");
        Driver.getDriver().get(ConfigurationReader.getProperty("googleUrl"));

        //search values
        WebElement searchBox=Driver.getDriver().findElement(By.xpath("//input[@name='q']"));
        String searchValue=ConfigurationReader.getProperty("searchValue");
        searchBox.sendKeys(searchValue + Keys.ENTER);


        //verify values is contained in the title
        String expectedIntTitle=searchValue;
        String actualTitle=Driver.getDriver().getTitle();
        Assert.assertTrue(actualTitle.contains(expectedIntTitle));
        System.out.println("Driver.getDriver().getTitle() = " + Driver.getDriver().getTitle());

        Driver.closeDriver();

        Driver.getDriver().get("https://etsy.com");

    }
}
