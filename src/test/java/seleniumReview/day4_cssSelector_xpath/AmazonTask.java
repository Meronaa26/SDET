package seleniumReview.day4_cssSelector_xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import seleniumReview.utilites.WebDriverFactory;

public class AmazonTask {
    public static void main(String[] args) {
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.get("https://amazon.com");
        driver.manage().window().maximize();
        WebElement searchBox= driver.findElement(By.cssSelector("input[id='twotabsearchtextbox']"));

        searchBox.sendKeys("wooden spoon" + Keys.ENTER);
        String actualTitle= driver.getTitle();
        String expectedTitle="Amazon.com : wooden spoon";
        if(actualTitle.equals(expectedTitle)){
            System.out.println("Correct!!");
        }else{
            System.out.println("Not correct");
        }
    }
}
