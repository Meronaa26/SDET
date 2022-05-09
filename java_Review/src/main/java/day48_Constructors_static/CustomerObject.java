package day48_Constructors_static;

import java.util.ArrayList;
import java.util.List;

public class CustomerObject {
    public static void main(String[] args) {
        Customer c1= new Customer();
        System.out.println(c1);
        c1.setName("Meron");
        c1.setId(5);
        System.out.println(c1);

        Customer c2= new Customer("helen",20);
        System.out.println("c2 = " + c2);

        //array of customers
        Customer[] customers = {c1,c2 , new Customer("Abiti", 89)};
        for (Customer customer : customers) {
            System.out.println(customer.toString());

        }

        //arrayList of customer object
        List<Customer> customerList = new ArrayList<>();
         customerList.add(c1);
         customerList.add(c2);
         customerList.add(new Customer("bashir",890));

        System.out.println("customerList.get(0) = " + customerList.get(0));  // getting first item

        for (int i = 0; i < customerList.size(); i++) {  // looping into the list and print all in the list
            System.out.println("customerList.get(i) = " + customerList.get(i));
        }


    }
}
