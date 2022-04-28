package seleniumReview.day6_testng_dropdwons;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import seleniumReview.utilites.WebDriverFactory;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class P01_Apple_task {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://www.apple.com");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        List<WebElement>headerList = driver.findElements(By.xpath("//ul[@class='ac-gn-list']//li//a"));  //using xpath   //ul[@class='ac-gn-list']//li//a
                   //className("ac-gn-list"))

        for (int header = 1; header<headerList.size()-1; header++) {
           // System.out.println(headerList.get(header).getText());
            headerList.get(header).click();
            Thread.sleep(1000);
            headerList = driver.findElements(By.xpath("//ul[@class='ac-gn-list']//li//a"));

            System.out.println(driver.getTitle());

        }

//        for (WebElement header : headerList) {  //iter + tab
//           // System.out.println(header.getText());
//            driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
//            header.click();
//            Thread.sleep(1000);
//            headerList = driver.findElements(By.xpath("//ul[@class='ac-gn-list']//li//a"));
//            System.out.println(driver.getTitle());
//        }



        //5==> print out total number of links in each page
        List<WebElement>allLinks=driver.findElements(By.xpath("//body//a"));
        System.out.println(allLinks.size());
        int linksWithNoText=0;
        int linksWithText=0;

        for (WebElement each : allLinks) {
            if(each.getText().isEmpty()){
                linksWithNoText++;
            }else{
                linksWithText++;
            }
        }
        //6==> while in each page print out how many links is missing text total
        System.out.println(linksWithNoText);
        //print link text TOTAL
        System.out.println(linksWithText);
    }

}
