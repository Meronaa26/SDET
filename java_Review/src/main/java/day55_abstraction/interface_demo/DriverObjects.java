package day55_abstraction.interface_demo;

public class DriverObjects {

    public static void main(String[] args) {
      //  WebDriver driver = new WebDriver(); can not creat an object of an interface

        ChromeDriver driver= new ChromeDriver();
        driver.get("url");
        driver.findElements("id=...");
        driver.quit();

    }
}
