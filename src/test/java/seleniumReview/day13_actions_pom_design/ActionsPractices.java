package seleniumReview.day13_actions_pom_design;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import seleniumReview.utilites.BrowserUtils;
import seleniumReview.utilites.Driver;

public class ActionsPractices {

    @Test
    public void p2_double_click(){
        Driver.getDriver().get("http://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick2");


//        WebElement iframe= Driver.getDriver().findElement(By.id("iframeResult"));
//        Driver.getDriver().switchTo().frame(iframe);
        //OR
        Driver.getDriver().switchTo().frame("iframeResult");

        //double click on the text "Double click..."
        WebElement text=Driver.getDriver().findElement(By.id("demo"));
        Actions actions=new Actions(Driver.getDriver());
        BrowserUtils.sleep(2);
        actions.doubleClick(text).perform();

        //assert test's "style"attribute value contains "red"
    //    WebElement styleValue= Driver.getDriver().findElement(By.xpath("//p[@style='color: red;']"));

        String expectedColour="red";
        String actualColour= text.getAttribute("style");

        Assert.assertTrue(actualColour.contains(expectedColour));



    }
}
