package seleniumReview.day4_cssSelector_xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import seleniumReview.utilites.WebDriverFactory;

public class P1_cssSelector_cyberteck {
    public static void main(String[]args){
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/forgot_password");
        driver.manage().window().maximize();
        WebElement homeLink= driver.findElement(By.cssSelector("a.nav-link"));
       // WebElement homeLink= driver.findElement(By.cssSelector("a[class='nav-link']")); same us above
        WebElement headerForgotPassword= driver.findElement(By.tagName("h2"));
        WebElement emailText=driver.findElement(By.cssSelector("label[for='email']"));
        WebElement retriveButton=driver.findElement(By.cssSelector("i[class='icon-2x icon-signin']"));
        WebElement poweredText=driver.findElement(By.cssSelector("div[style='text-align: center;']"));
        System.out.println( headerForgotPassword.isDisplayed());
        System.out.println(  emailText.isDisplayed());
        System.out.println( retriveButton.isDisplayed());
        System.out.println( poweredText.isDisplayed());


    }
}
