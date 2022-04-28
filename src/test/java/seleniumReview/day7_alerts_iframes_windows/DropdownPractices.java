package seleniumReview.day7_alerts_iframes_windows;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import seleniumReview.utilites.WebDriverFactory;

import java.util.concurrent.TimeUnit;

public class DropdownPractices {

    WebDriver driver;
    @BeforeClass
    public void setUpClass(){
        driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
        driver.get("http://practice.cybertekschool.com/dropdown");
    }

    @Test
    public void simpleDropDown(){

       Select select= new Select(driver.findElement(By.xpath("//select[@id='dropdown']")));
        WebElement currentlySelectedOption=select.getFirstSelectedOption();
        String textOfCurrentOption= currentlySelectedOption.getText();


        String actualTextOfCurrentOption =currentlySelectedOption.getText();
        String expectedText= "Please select an option";
        Assert.assertEquals(actualTextOfCurrentOption,expectedText);


        //verify "state selection"default selected value is correct
       Select selectState= new Select(driver.findElement(By.xpath("//select[@id='state']")));
      String expectedTextState= selectState.getFirstSelectedOption().getText();
      String actualText="Select a State";
      Assert.assertTrue(expectedTextState.equals(actualText));
    }

    @Test
    public void state_drop_down(){

        //select Illinois
        Select select= new Select(driver.findElement(By.xpath("//select[@id='state']")));
        select.selectByVisibleText("Illinois");


        //select Virginia
        select.selectByValue("VA");

        //select California
        select.selectByIndex(5);

        //verify final selected option is California
        String expectedOptionText= "California";
        String actualOptionText= select.getFirstSelectedOption().getText();

        // interesting** Didn't know this ==> the final selected option
        Assert.assertEquals(expectedOptionText,actualOptionText,"this message will be printed out only if assertion fails ");
        Assert.assertTrue(select.getFirstSelectedOption().getText().equals("California"));
    }

    @Test
    public void date_dropDownTest() throws InterruptedException {

        Select yearDropDown= new Select(driver.findElement(By.xpath("//select[@id='year']")));
        yearDropDown.selectByVisibleText("1923");


        Select monthDropDown= new Select(driver.findElement(By.xpath("//select[@id='month']")));
        monthDropDown.selectByValue("11");


        Select dayDropDown= new Select(driver.findElement(By.xpath("//select[@id='day']")));
        dayDropDown.selectByIndex(0);
    }

    @Test
    public void multiple_select_dropdown(){



    }



    @Test
    public void non_select_dropdown(){

        //click to non-select dropdown
        WebElement websiteDropdown= driver.findElement(By.id("dropdownMenuLink"));
        websiteDropdown.click();


        //select facebook from dropdown
        WebElement facebook= driver.findElement(By.xpath("//a[.='Facebook']"));
        facebook.click();



        //verify title is Facebook-Log In or Sign Up"
       String expectedTitle="Facebook - log in or sign up";
       String actualTitle=driver.getTitle();
        System.out.println(actualTitle);

       Assert.assertTrue(actualTitle.equals(expectedTitle),"Title is not as expected ");


    }


    @AfterClass
    public void tearDown() throws InterruptedException {
       Thread.sleep(1000);
        driver.close();
}
}
