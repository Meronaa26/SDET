package day41_arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayAsList {
    public static void main(String[] args) {

        List<Integer>nums= Arrays.asList(   3,45,67,89,45,24,5,6,78,90)   ;//... varargs T
        System.out.println(nums);   //nums is immutable that can't be modified we can not say add or remove i here
       // nums.add(89);  // it runs but get an exception UnsupportedOperationException

        List<Integer> newList=new ArrayList<>(Arrays.asList( 3,45,67,89,45,24,5,6,78,90));
        newList.add(34);
        newList.add(55);
        newList.add(1,66);
        newList.add(3,99);

        System.out.println("newList = " + newList);

        newList.remove(5); // it takes only index
        newList.remove(new Integer(6));

        System.out.println("newList = " + newList);


        List<String> drinksWithCaffeine= new ArrayList<>(Arrays.asList("coffee","tea","red bull" ," coke","pepsi","mdew","monster","celsius","kambucha"));
        int caffeeinAmount=0;
        for (String drink:drinksWithCaffeine) {
            if (drink.equals("monster") || drink.equals("red bull") || drink.equals("celsius")) {
                caffeeinAmount = 150;
                System.out.println(drink +"-->" + caffeeinAmount);
            } else if (drink.equals("coffee") || drink.equals("kambucha")) {
                caffeeinAmount = 112;
                System.out.println(drink +"-->" + caffeeinAmount);
            } else {
                caffeeinAmount = 35;
                System.out.println(drink +"-->" + caffeeinAmount);
            }
        }

        // trying it with switch

        for (String drink:drinksWithCaffeine) {
            switch (drink) {
                case "coffee": case "kambucha":
                    caffeeinAmount=112;
                    System.out.println(drink +"-->" + caffeeinAmount);
                    break;
                case "tea": case "coke":  case "mdew":
                    caffeeinAmount=35;
                    System.out.println(drink +"-->" + caffeeinAmount);
                    break;
                case "red bull":  case "monster":   case "celsius":
                    caffeeinAmount=150;
                    System.out.println(drink +"-->" + caffeeinAmount);
                    break;
            }
        }

        drinksWithCaffeine.forEach(drink -> System.out.println( "LAMBEDA  : " + drink.toUpperCase() ));
    }
}
