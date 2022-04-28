package seleniumReview.day4_cssSelector_xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import seleniumReview.utilites.WebDriverFactory;

public class P6_XpathMultipleButtons {
    public static void main(String[] args) {

        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/multiple_buttons");

        WebElement button1= driver.findElement(By.xpath("//button[@class='btn btn-primary'][1]"));  ////button[@onclick='button1()']   OR  //button[.='Button 1']
        button1.click();

        WebElement resultText= driver.findElement(By.xpath("//p[@id='result']"));

        String expectedTextmessage="Clicked on button one!";
        String actualTextMessage= resultText.getText();
        System.out.println(actualTextMessage);

        if(actualTextMessage.equals(expectedTextmessage)){
            System.out.println("Message text is correct");
        }else{
            System.out.println("Message text is not correct");
        }



    }
}
