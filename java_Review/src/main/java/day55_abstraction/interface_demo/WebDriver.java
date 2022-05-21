package day55_abstraction.interface_demo;

public interface WebDriver {

    public abstract void get(String url);
    public abstract void findElements(String locator);
    void quit();
    String getTitle();

}
