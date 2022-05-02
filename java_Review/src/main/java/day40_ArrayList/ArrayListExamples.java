package day40_ArrayList;

import java.util.ArrayList;

public class ArrayListExamples {
    public static void main(String[] args) {

        //ArrayList internally uses array ==> it wraps arrays
        ArrayList<Integer> nums= new ArrayList<>();
        nums.add(90);
        nums.add(89);
        nums.add(34);
        nums.add(45);
        nums.add(67);

        System.out.println(nums);
        System.out.println("nums.get(2) = " + nums.get(2));
        System.out.println("nums.size() = " + nums.size());

        System.out.println("nums.remove(3) = " + nums.remove(3));
        System.out.println("nums = " + nums);

    }

}
