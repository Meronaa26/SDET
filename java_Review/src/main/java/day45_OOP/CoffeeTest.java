package day45_OOP;

public class CoffeeTest {
    public static void main(String[] args) {
        Coffee coffee= new Coffee();
           coffee.refill();
           coffee.drink(30);
           System.out.println(coffee.getAmount());
           coffee.setCoffeeType("Moka");
        System.out.println("coffee.getCoffeeType() = " + coffee.getCoffeeType());
       //show all variable values
        System.out.println("coffee.toString() = " + coffee.toString());

       // main(null);

        Coffee coffee4=null;   // will print nullPointer exception because it is not pointing to anything
        coffee4.setCoffeeType("Makaton");
       // System.out.println("coffee4 = " + coffee4);
    }


}
