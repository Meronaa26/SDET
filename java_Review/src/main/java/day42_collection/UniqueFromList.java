package day42_collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class UniqueFromList {

    public static void main(String[] args) {
        List<Integer> num= new ArrayList<>(Arrays.asList(2,4,4,1,5,6,0,6,7,8,9,3,4,5,7));
        List<Integer> uniqueList = getUniqueList(num);
        System.out.println("uniqueList = " + uniqueList);
    }

    private static List<Integer> getUniqueList(List<Integer> num) {
        List<Integer>uniqueList=new ArrayList<>();
        System.out.println("uniqueNum = " + num);
        //declare Integer arrayList with following numbers
        for (Integer integer : num) {
            //if it appears only once
            if(Collections.frequency(num,integer) ==1 ){
                uniqueList.add(integer);
                System.out.println(integer  + " ");
            }
        }
        return uniqueList;
    }
}
