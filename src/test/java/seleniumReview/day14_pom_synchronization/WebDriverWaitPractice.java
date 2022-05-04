package seleniumReview.day14_pom_synchronization;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import seleniumReview.pages.DynamicLoad7Page;
import seleniumReview.utilites.Driver;

public class WebDriverWaitPractice {


    @Test
    public void dynamic_loading_7_practice(){

        DynamicLoad7Page dynamicLoad7Page =new DynamicLoad7Page();
        Driver.getDriver().get("http://practice.cybertekschool.com/dynamic_loading/7");

        //wait until title is "Dynamic title"
        WebDriverWait wait= new WebDriverWait(Driver.getDriver(),10);

        //use the object to wait
        wait.until(ExpectedConditions.titleIs("Dynamic title"));

       // wait.until(ExpectedConditions.visibilityOf(dynamicLoad7Page.spongEBobImage));

        //Assert  :Message "Done" is diplayed
        Assert.assertTrue( dynamicLoad7Page.doneMessage.isDisplayed());

        //Assert Image is displayed
        Assert.assertTrue(dynamicLoad7Page.spongEBobImage.isDisplayed());
    }

    @Test
    public void dynamic_loading_1_test(){
        Driver.getDriver().get("http://practice.cybertekschool.com/dynamic_loading/1");
        DynamicLoad7Page dynamicLoad7Page =new DynamicLoad7Page();

        dynamicLoad7Page.startButton.click();

        WebDriverWait wait=new WebDriverWait(Driver.getDriver(),10);
        wait.until(ExpectedConditions.visibilityOf(dynamicLoad7Page.helloWorld));

        //teachers way and I like it !!!!!
       //  wait.until(ExpectedConditions.invisibilityOf(dynamicLoad7Page.loadingBar));

        //Assert
        Assert.assertTrue(dynamicLoad7Page.userName.isDisplayed());

        //Enter username = tosmith
        dynamicLoad7Page.userName.sendKeys("tosmith");

        //enter password = incorrectpassword
        dynamicLoad7Page.passWord.sendKeys("incorrectpassword");

        //click submit button
        dynamicLoad7Page.submitButton.click();

        wait.until(ExpectedConditions.visibilityOf(dynamicLoad7Page.errorMessage));
        Assert.assertTrue(dynamicLoad7Page.errorMessage.isDisplayed());

    }

    @AfterMethod
    public void tearDown(){
     Driver.closeDriver();
    }
}

