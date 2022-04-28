package seleniumReview.day5_findElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import seleniumReview.utilites.WebDriverFactory;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class P1_FindElements {
    public static void main(String[] args) {
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/forgot_password");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

      List<WebElement> list =driver.findElements(By.xpath("//body//a"));

      for(WebElement each:list){
          each.getText();
          System.out.println( each.getText());
          System.out.println( each.getAttribute("href"));
          //iter + tab   shortcut for each loop
          //fori + tab  for regular loop

      }

        System.out.println(list.size());


    }
}
