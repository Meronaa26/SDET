package day42_collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MethodsWithList {
    public static void main(String[] args) {
        List<String> listStr=new ArrayList<>(Arrays.asList("html","selenium","a","input","title"));
        printStringList(listStr);
        listStr.add("option");
        listStr.add("python");
        listStr.add("sql");

        printStringList(listStr);

        List<Integer>listnum=new ArrayList<>(Arrays.asList(56,78,90,3,4,5,6,78,90,23));
        System.out.println("sumIntegerList(listnum) = " + sumIntegerList(listnum));


    }

    public static void  printStringList(List<String> stringList){

        for (String str : stringList) {
            System.out.println("str = " + str);
        }
}

       public static int sumIntegerList(List<Integer> intList){
        int sum=0;
        for (Integer integer : intList) {
            sum=integer+sum;
        }
            return sum;
}
}
