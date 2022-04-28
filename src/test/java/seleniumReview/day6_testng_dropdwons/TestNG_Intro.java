package seleniumReview.day6_testng_dropdwons;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import seleniumReview.utilites.WebDriverFactory;

public class TestNG_Intro {

    @BeforeClass
    public void setupClass(){
        WebDriver driver = WebDriverFactory.getDriver("chrome");
    }

    @AfterClass
    public void tearDownClass(){
        System.out.println("after method is running ");
    }
    @BeforeMethod
    public void setupMethod(){
        System.out.println("before method is running ");
    }


    @Test(priority = 1)
    public void test1(){
        System.out.println("running test 1.....");
        String actual="apple";
        String expected="apple";
        Assert.assertEquals(actual,expected);

    }

    @Test(priority = 2)
    public void test2(){
        System.out.println("running test 2.....");

    }
}
