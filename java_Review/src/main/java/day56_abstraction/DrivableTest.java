package day56_abstraction;

public class DrivableTest {

    public static void main(String[] args) {
        Tesla tesla= new Tesla();
        tesla.autoDrive();
        tesla.transportPeople();


        Plane plane= new Plane();
        plane.autoDrive();
        plane.transportPeople();
        plane.start();
        plane.hi();
        plane.bye();
    }
}
