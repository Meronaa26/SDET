package seleniumReview.utilites;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class Driver {
/*
* Creating the private constructor so this class object is not reachable
*
* */
    private Driver() {}
    /*
     * Making our driver instance private so that it is not reachable from outside the class;
     * we make it static because we want it to run befor everything else,and also we will use it in a static method
     */

    private static  WebDriver driver;

    public static WebDriver getDriver(){

        if(driver==null){
            /*
         we read our browser type from configuration.properties file using .get property method we're creating in config class
        */
            String browserType=ConfigurationReader.getProperty("browser");
            switch (browserType){
                case "chrome":
                    WebDriverManager.chromedriver().setup();
                    driver=new ChromeDriver();
                    driver.manage().window().maximize();
                    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                    break;
                case "Firefox":
                    WebDriverManager.firefoxdriver().setup();
                    driver=new FirefoxDriver();
                    driver.manage().window().maximize();
                    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

            }
        }
           return driver;
    }
    /*
    * this method makes sure we have some form of driver session or driver id has
    * */
    public static void closeDriver(){
        if(driver !=null){
            driver.quit();  //==> quit close all
            driver=null;
        }
    }

}
