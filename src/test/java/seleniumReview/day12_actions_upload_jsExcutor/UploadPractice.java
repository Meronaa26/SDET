package seleniumReview.day12_actions_upload_jsExcutor;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import seleniumReview.utilites.BrowserUtils;
import seleniumReview.utilites.Driver;

public class UploadPractice {

    @Test
    public void upload_test(){
        Driver.getDriver().get("http://practice.cybertekschool.com/upload");
        String path="/Users/meron1/Desktop/Screen Shot 2022-05-02 at 2.23.25 PM.png";
        WebElement upload= Driver.getDriver().findElement(By.xpath("//input[@class='button']"));
        WebElement selectFile=Driver.getDriver().findElement(By.id("file-upload"));
        BrowserUtils.sleep(3);
        selectFile.sendKeys(path);

        upload.click();

        //assert file upload file is displayed
        WebElement successMessage= Driver.getDriver().findElement(By.xpath("//h3[.='File Uploaded!']")); //(By.tagname("h3")
        String actualMessage="File Uploaded!";
        Assert.assertTrue(successMessage.getText().equals(actualMessage));
        //or
        Assert.assertTrue(successMessage.isDisplayed()); //better one


    }
}
