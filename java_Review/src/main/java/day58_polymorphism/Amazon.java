package day58_polymorphism;

public class Amazon extends OnlineShopping implements Prime{

    @Override
    public void buy() {
        System.out.println("Buying items on Amazon.com");
    }

    @Override
    public void sell() {

        System.out.println("Selling items on Amazon.com");
    }

    @Override
    public void primeShipping() {
        System.out.println("Free 2 day shipping ");
    }
}
