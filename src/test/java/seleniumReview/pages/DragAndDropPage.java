package seleniumReview.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import seleniumReview.utilites.Driver;

public class DragAndDropPage {

    public DragAndDropPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(id="draggable")
    public WebElement smallCircle;

    @FindBy(id="droptarget")
    public WebElement bigCircle;

    @FindBy(id="onetrust-accept-btn-handler")
    public WebElement acceptCookies;




}
