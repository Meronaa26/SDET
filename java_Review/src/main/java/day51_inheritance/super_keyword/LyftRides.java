package day51_inheritance.super_keyword;

public class LyftRides {
    public static void main(String[] args) {
        Lyft lyft = new Lyft();
        LyftXl lyftXl = new LyftXl();
        Lux luxRide= new Lux();

        double roundPrice= lyftXl.calculateRate(5);

        System.out.println("lyft.calculateRate(5) = " + lyft.calculateRate(5));
        System.out.println("lyftXl.calculateRate(5) = " + Math.round(roundPrice));
        System.out.println("luxRide.calculateRate(5) = " + luxRide.calculateRate(5));
    }
}
