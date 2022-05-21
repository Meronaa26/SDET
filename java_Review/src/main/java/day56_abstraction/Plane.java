package day56_abstraction;

public class Plane extends Transportation implements SelfDrivable, Greeting{
    @Override
    public void hi() {
        System.out.println("Welcom to alsakan airline");
    }

    @Override
    public void bye() {

        System.out.println("Thanks for traveling with us");
    }

    @Override
    public void autoDrive() {
        System.out.println("Flying with auto pilot");

    }

    @Override
    public void transportPeople() {

        System.out.println("Flying people with....");
    }

    @Override
    public void cost(int mile) {
        System.out.println(mile*1500);
    }
}
