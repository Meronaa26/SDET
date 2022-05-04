package seleniumReview.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import seleniumReview.utilites.Driver;

public class DynamicLoad7Page {


    public DynamicLoad7Page(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath="//strong[.='Done!']")
    public WebElement doneMessage;

    @FindBy(xpath = "//img[@class='rounded mx-auto d-block']")

    public WebElement spongEBobImage;


    //Should be in different clas==> just did it in here

    @FindBy(xpath = "//button[@class='btn btn-primary'][1]")
    public WebElement startButton;

    @FindBy(xpath = "//h4[.='Hello World!']")
    public WebElement helloWorld;

    @FindBy(xpath = "//input[@type='username']")
    public WebElement userName;

    @FindBy(xpath = "//input[@type='password']")
    public WebElement passWord;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement submitButton;


    @FindBy(id="flash")
    public WebElement errorMessage;

    @FindBy(id="loading")
    public WebElement loadingBar;





}
