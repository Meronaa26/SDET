package seleniumReview.day6_testng_dropdwons;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import seleniumReview.utilites.WebDriverFactory;

import java.util.concurrent.TimeUnit;

public class P0_CheckBox_Practice {
    public static void main(String[] args) {
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/checkboxes");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

        //Confirm checkbox 1 is NOT selected
        WebElement checkbox1=driver.findElement(By.id("box1"));
        System.out.println( checkbox1.isSelected());
        //Confirm checkbox 2 is selected
        WebElement checkbox2= driver.findElement(By.id("box2"));
        System.out.println(checkbox2.isSelected());

        //Click checkbox 1 to select it
           checkbox1.click();
        System.out.println(checkbox1.isSelected());
        //Click checkbox 2 to deselect it
        checkbox2.click();
        System.out.println(checkbox2.isSelected());





    }
}
