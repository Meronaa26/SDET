package seleniumReview.day4_cssSelector_xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import seleniumReview.utilites.WebDriverFactory;

public class T5_WebOrdersLogin {
    public static void main(String[] args) {

//        WebDriverManager.chromedriver().setup();
//        WebDriver driver=new ChromeDriver();
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");
        String expectedTitle="Web Orders Login";
        String actualTitle= driver.getTitle();
        if(actualTitle.equals(expectedTitle)){
            System.out.println("Title is Correct");
        }else{
            System.out.println("Title is not Correct");
        }

            WebElement username= driver.findElement(By.id("ctl00_MainContent_username"));
            WebElement password=driver.findElement(By.id("ctl00_MainContent_password"));
            WebElement siginButton= driver.findElement(By.id("ctl00_MainContent_login_button"));

            username.sendKeys("Tester");
            password.sendKeys("test");
             siginButton.click();


            String expectedTitle1="Web Orders";
            String actualTitle1= driver.getTitle();
            if(actualTitle1.equals(expectedTitle1)){
                System.out.println("Title is Correct");
            }else{
                System.out.println("Title is not Correct");
            }

    }
}
