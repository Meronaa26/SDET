package seleniumReview.utilites;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LibraryUtils {


    public static void loginToLibrary(WebDriver driver){

        WebElement userName=driver.findElement(By.xpath("//input[@type='email']"));
        userName.sendKeys("student13@library");

        WebElement password= driver.findElement(By.xpath("//input[@id='inputPassword']"));
        password.sendKeys("tScBPCUr");   //   zcVbvUWH


        WebElement signInButton =driver.findElement(By.xpath("//button[@class='btn btn-lg btn-primary btn-block']"));
        signInButton.click();


    }

}
