package seleniumReview.day12_actions_upload_jsExcutor;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import seleniumReview.utilites.BrowserUtils;
import seleniumReview.utilites.Driver;

public class ActionsPractice {

    @Test
    public void tc15_actions_hover(){
        Driver.getDriver().get("http://practice.cybertekschool.com/hovers");

        WebElement firstImg1=Driver.getDriver().findElement(By.xpath("(//img[1])"));
        WebElement firstImg2=Driver.getDriver().findElement(By.xpath("(//img[@src='/img/avatar-blank.jpg'])[2]"));
        WebElement firstImg3=Driver.getDriver().findElement(By.xpath("(//img[@src='/img/avatar-blank.jpg'])[3]"));

        WebElement use1=Driver.getDriver().findElement(By.xpath("//h5[.='name: user1']"));
        WebElement use2=Driver.getDriver().findElement(By.xpath("//h5[.='name: user2']"));
        WebElement use3=Driver.getDriver().findElement(By.xpath("//h5[.='name: user3']"));

        BrowserUtils.sleep(2);

        //we must create object of actions class to be able to use methods coming from there
        Actions actions=new Actions(Driver.getDriver());

        //hover over the first image
        actions.moveToElement(firstImg1).perform();
        //asser first "name: user1" is displayed
        Assert.assertTrue(use1.isDisplayed());
        //

        actions.moveToElement(firstImg2).perform();
        Assert.assertTrue(use2.isDisplayed());

        actions.moveToElement(firstImg3).perform();
        Assert.assertTrue(use3.isDisplayed());

    }

    @Test
    public void scrolling_test(){
        Driver.getDriver().get( "http://practice.cybertekschool.com");
        Actions actions=new Actions(Driver.getDriver());

        //locate "Powered by CYDEO "
        WebElement cydeoLink=Driver.getDriver().findElement(By.linkText("CYDEO"));

        //scrolling using actions object
        BrowserUtils.sleep(3);
        actions.moveToElement(cydeoLink).perform();

        //scrolling up using Keys.Page_up button
        BrowserUtils.sleep(3);
        actions.sendKeys(Keys.PAGE_UP,Keys.PAGE_UP,Keys.PAGE_UP).perform();

        actions.sendKeys(Keys.PAGE_DOWN).perform();




    }


}