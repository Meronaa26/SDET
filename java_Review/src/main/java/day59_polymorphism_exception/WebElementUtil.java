package day59_polymorphism_exception;

public class WebElementUtil {

    public static void clickElement(WebElement webElement){
        System.out.println("Clicking on element");
        webElement.click();
    }

    public static WebElement getLinkWithText(String txt){
        System.out.println("Searching for a link with txt = " + txt);
        return new Link();

    }
}
