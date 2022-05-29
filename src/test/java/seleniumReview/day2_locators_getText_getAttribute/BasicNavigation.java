package seleniumReview.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicNavigation {
    public static void main(String[] args) throws InterruptedException {
      WebDriverManager.chromedriver().setup();

        //this line opens a browser
        // create an instance of selenium web driver
        WebDriver driver =new ChromeDriver();
        //get the page for tesla
        driver.get("https://www.tesla.com");
        driver.manage().window().maximize();
       // driver.manage().window().fullscreen();   ==> only mac just little difference in the maximized window

        //Going back using navigation
        Thread.sleep(3000);
        System.out.println( "Current Title  :" + driver.getTitle());
        String currenturl= driver.getCurrentUrl();
        System.out.println(currenturl);
        driver.navigate().back();

        //Going forward using navigation
        Thread.sleep(3000);
        driver.navigate().forward();

        //refreshing the page using navigation
        driver.navigate().refresh();



        //going to another url using .to()  method
        driver.navigate().to("https://www.google.com");


        // the difference between .get() and .to() is that .to() will not wait until the page is loaded before going to next page


        System.out.println( "Current Title  :" + driver.getTitle());
        currenturl= driver.getCurrentUrl();
        System.out.println(currenturl);


        driver.close();
        //this method will close the currently opened browser
        //it will only close 1 browser or 1 tab

       // driver.quit();
         // will close all the opened browser or tabs within the same session
        // will kill the current session
        // pkill -9 Google Chrome









    }
}
