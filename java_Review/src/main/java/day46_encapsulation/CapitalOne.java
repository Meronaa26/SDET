package day46_encapsulation;

public class CapitalOne {
    public static void main(String[] args) {
        CheckingAccount account = new CheckingAccount();
        account.setAccountHolder("Meron Tesfay");
        account.setAccountNumber(123456789);
        account.setBalance(500000000);
       // account.setType("Checking");

        System.out.println("account = " + account);
    }
}
