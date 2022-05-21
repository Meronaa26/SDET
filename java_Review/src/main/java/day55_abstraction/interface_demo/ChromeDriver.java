package day55_abstraction.interface_demo;

public class ChromeDriver implements WebDriver{
    @Override
    public void get(String url) {
        System.out.println("ChromeDriver  navigating to " + url);
    }

    @Override
    public void findElements(String locator) {
        System.out.println("ChromeDriver - locating elements by" + locator);

    }

    @Override
    public void quit() {
        System.out.println("ChromeDriver -quitting ");

    }

    @Override
    public String getTitle() {
        return "Wooden Spoon";
    }
}
