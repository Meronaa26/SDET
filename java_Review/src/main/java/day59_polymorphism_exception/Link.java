package day59_polymorphism_exception;

public class Link implements WebElement {

    public static final String TAG="a";


    public void getLinkHrf() {
        System.out.println("https://www.java.com");
    }

    @Override
    public void sendKeys(String txt) {
        System.out.println("Not supported");
    }

    @Override
    public void click() {
        System.out.println("Clicking ......");
    }

    @Override
    public String getText() {
        return "Oracle java";
    }
}
