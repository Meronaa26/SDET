package seleniumReview.day13_actions_pom_design;

import org.testng.Assert;
import org.testng.annotations.Test;
import seleniumReview.pages.LibraryLoginPage;
import seleniumReview.utilites.Driver;

public class PageObjectModelPractices {

    @Test
    public void negative_login_to_library_test(){
        Driver.getDriver().get("http://library2.cybertekschool.com/login.html");

        //create object of the elements stored class
        LibraryLoginPage loginPage= new LibraryLoginPage();

        //enter incorrect username
        loginPage.inputEmail.sendKeys("34BHY");
        //enter incorrect password
        loginPage.inputPassword.sendKeys("888f");


        Assert.assertTrue(loginPage.incorrectEmailOrPasswordError.isDisplayed());
        Assert.assertTrue(loginPage.incorrectEmailOrPasswordError.getText().contains("Please enter a valid email address."));
    }

}
