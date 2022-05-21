package day56_abstraction;

public class MountainLanguage implements Greeting{
    @Override
    public void hi() {
        System.out.println("Zee");
    }

    @Override
    public void bye() {
        System.out.println("Chaw");
    }
}
