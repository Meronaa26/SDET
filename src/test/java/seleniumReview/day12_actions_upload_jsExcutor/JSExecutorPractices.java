package seleniumReview.day12_actions_upload_jsExcutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import seleniumReview.utilites.BrowserUtils;
import seleniumReview.utilites.Driver;

public class JSExecutorPractices {


    @Test
    public void scroll_using_jsExecutor_test1(){


        Driver.getDriver().get("http://practice.cybertekschool.com/infinite_scroll");

        //down casting our driver to JavascriptExecutor we can reach methods in this interface
        BrowserUtils.sleep(3);
        //((JavascriptExecutor) Driver.getDriver()).executeScript("")
        JavascriptExecutor js= (JavascriptExecutor) Driver.getDriver();

        for (int i = 0; i < 10; i++) {
            js.executeScript("window.scroll(0,750)");
        }


        js.executeScript("window.scroll(0,-750)");

    }


    @Test
    public void scroll_using_jsExecutor_test2(){
        Driver.getDriver().get("http://practice.cybertekschool.com/large");

        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();


        //locating the cydeo LINK to use in js executor
        WebElement cydeoLink=Driver.getDriver().findElement(By.linkText("CYDEO"));
        WebElement homeLink=Driver.getDriver().findElement(By.linkText("Home"));

        //use js executor to scroll(o means move to zero argument I am passing and the argument is cydeolink until it is true
        BrowserUtils.sleep(2);
        js.executeScript("arguments[0].scrollIntoView(true)",cydeoLink);


        BrowserUtils.sleep(2);
        js.executeScript("arguments[0].scrollIntoView(true)",homeLink);



    }
}
