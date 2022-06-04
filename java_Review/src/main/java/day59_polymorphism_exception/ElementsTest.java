package day59_polymorphism_exception;

public class ElementsTest {
    public static void main(String[] args) {
        Link link = new Link();
        link.sendKeys("Meron");
        link.click();
        link.getLinkHrf();

        WebElement loginLink = new Link();

        System.out.println(  loginLink.getText());
        loginLink.sendKeys("Test");
        loginLink.click();


        WebElementUtil.clickElement(loginLink);
        WebElementUtil.clickElement(link);

      WebElement login= WebElementUtil.getLinkWithText("Login");
      login.click();
    }
}
