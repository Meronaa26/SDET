package day46_encapsulation;


public class Dealership {
    public static void main(String[] args) {

        Car car1= new Car();
        car1.setModel("Honda");
        System.out.println("car1.getModel() = " + car1.getModel());
        car1.setMileage(26000);
        car1.setYear(2018);
        System.out.println(car1.getModel() + ":" + car1.getMileage() + " ; " + car1.getYear());

        System.out.println(car1);
        System.out.println(car1.toString());
        System.out.println(car1); // automatically calls the toString method

        Car car2= new Car();
        car2.setYear(2022);
        car2.setMileage(15000);
        car2.setModel("Alfa Romeo Giulia");

        System.out.println(car2.toString());
    }

}
