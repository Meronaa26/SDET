package day49_static;

public class BankAccountTest {

    public static void main(String[] args) {
        BankAccount husband= new BankAccount();
        husband.showBalance();   // static variable
        husband.user="husband"; // non static balance

        husband.spend(45);
        husband.showBalance();


        BankAccount wife= new BankAccount();
        wife.showBalance(); // the amount is decreased from th balance , this is the point of static variable
        //if balance  wasn't static the balance will not be decreased
        //static variable only have one copy

    }
}
