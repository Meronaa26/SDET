package day40_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class ArrayListMethods {

    public static void main(String[] args) {
        List<String>shoppingList =new ArrayList<>();

        shoppingList.add("TV");
        shoppingList.add("watch");
        shoppingList.add("Laptop");
        shoppingList.add("Cable");
        shoppingList.add("Table");

        if(shoppingList.isEmpty()){
            System.out.println("Cart is empty");
        }else{
            System.out.println("Go to mall");
        }

        int count = shoppingList.size();
        System.out.println("count = " + count);
        System.out.println("shoppingList.contains(\"tv\") = " + shoppingList.contains("TV"));

        if(shoppingList.contains("Table")){
            System.out.println("Yes, it is there");
        }else{
            System.out.println("Not there");
        }


        System.out.println("Buy Table");
        System.out.println("shoppingList.remove(\"kkk\") = " + shoppingList.remove("kkk"));// it returns false if that doesn't find the itme in the list

        System.out.println("shoppingList.remove(\"Cable\") = " + shoppingList.remove("Cable"));
        System.out.println("shoppingList = " + shoppingList);

        shoppingList.clear();
        System.out.println("Done shopping Cart is clear = " + shoppingList);

    }


}
