package day43_custom_classes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class ListMethods {

    public static void main(String[] args) {

        System.out.println("getDays() = " + getDays());
        System.out.println("getDays() Size= " + getDays().size());
        System.out.println("getDays().get(0) = " + getDays().get(0));

        List<String>dayNames=getDays();
        System.out.println("dayNames = " + dayNames);
        dayNames.add("Java day");
        System.out.println("dayNames = " + dayNames);

        dayNames.removeIf(day -> day.length() ==6); // the length of each day
        System.out.println(dayNames);

        System.out.println("getRandomList(90) = " + getRandomList(6));

    }

    public static List<String> getDays(){

      List<String>days= new ArrayList<>(Arrays.asList("Monday","Wednesday","Sunday"));
        return days;
    }

   public static List<Integer> getRandomList(int size){
       Random random= new Random();
       List<Integer>randomList=new ArrayList<>();
       for (int i = 1; i <=size; i++) {
           randomList.add(random.nextInt(101));
       }
       return randomList;
   }
}
