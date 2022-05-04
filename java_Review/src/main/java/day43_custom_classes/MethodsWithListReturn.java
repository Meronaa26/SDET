package day43_custom_classes;

import java.util.ArrayList;
import java.util.List;

public class MethodsWithListReturn {
    public static void main(String[] args) {

        // 1 second  =1_000_000_000
        long star =System.nanoTime();
        System.out.println("getIntegerList() = " + getIntegerList());
        long en=System.nanoTime();
        System.out.println("end-start  for list = " + (en - star));



        System.out.println("System.nanoTime() = " + System.nanoTime());
        long start =System.nanoTime();
        System.out.println("intarray() = " + intarray());  //==> not sure why it isn't printing the numbers
        long end=System.nanoTime();
        System.out.println("end-start  for intarray = " + (end - start));


    }

    public static List<Integer> getIntegerList(){

        List<Integer> integerList=new ArrayList<>();
        for (int i = 0; i < 1000_000; i++) {
            integerList.add(i);
        }
        return integerList;
    }

    public static int[] intarray(){

        int[]listInt=new int[200];
        for (int i = 0; i < 200; i++) {
            listInt[i]+=i;
        }
        return listInt;
    }

}
