package day59_polymorphism_exception;

public class InputField implements WebElement {

    public static final String TAG_NAME="input";

    public String getValue(){
        System.out.println("Getting value in the input field");
        return "Selenium";
    }

    @Override
    public void sendKeys(String txt) {
        System.out.println("Typing into input field -" + txt);
    }

    @Override
    public void click() {

    }

    @Override
    public String getText() {
        return null;
    }
}
