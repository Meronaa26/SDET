package seleniumReview.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import seleniumReview.utilites.Driver;

public class LibraryLoginPage {
    //create constructor and initialize driver and object of the class 

    public LibraryLoginPage() {

        PageFactory.initElements(Driver.getDriver(),this);
        //this keyword pointing to the object of the instance of the class 
    }
    
    @FindBy(id="inputEmail")
    public WebElement inputEmail;

    @FindBy(id="inputPassword")
    public WebElement inputPassword;

    @FindBy(xpath = "//button[text()='Sign in']")
    public WebElement signInButton;

    @FindBy(id="inputEmail-error")
    public WebElement invalidEmailFormatError;

    @FindBy(xpath = "//div[@class='alert alert-danger']")
    public WebElement incorrectEmailOrPasswordError;

}
