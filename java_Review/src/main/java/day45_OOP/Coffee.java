package day45_OOP;

public class Coffee {
    String coffeeType;
    int amount;

    @Override
    public String toString() {
        return "Coffee{" +
                "coffeeType='" + coffeeType + '\'' +
                ", amount=" + amount +
                '}';
    }

    public void refill(){
        amount =100;

    }
    public void drink( int someAmount){
        amount -= someAmount;
    }
    public int getAmount(){
        return amount;
    }

    public String getCoffeeType() {
        return coffeeType;
    }

    public void setCoffeeType(String newType){
         coffeeType=newType;
    }


}
