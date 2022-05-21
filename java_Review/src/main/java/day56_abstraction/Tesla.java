package day56_abstraction;

public class Tesla  extends Transportation implements SelfDrivable , Greeting{
    @Override
    public void transportPeople() {
        System.out.println("Tesla is transporting people on the roads");
    }

    @Override
    public void cost(int mile) {
        System.out.println("Tesla costs " + mile*0.10 + " to drive " + mile );
    }

    @Override
    public void autoDrive() {
        System.out.println("Tesla is an auto pilot ");
    }

    @Override
    public void hi() {
        System.out.println("Hi Tesla");
    }

    @Override
    public void bye() {
        System.out.println("Bye Tesla");

    }
}
