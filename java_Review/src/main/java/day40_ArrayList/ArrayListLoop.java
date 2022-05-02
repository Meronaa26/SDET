package day40_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class ArrayListLoop {

    public static void main(String[] args) {
        List<Integer> nums= new ArrayList<>();//POLYMORPHISM

        nums.add(566); nums.add(56);nums.add(899);nums.add(555);nums.add(999);nums.add(89);nums.add(88);nums.add(77);

        System.out.println("nums = " + nums);
        System.out.println("nums.size() = " + nums.size());
        nums.remove(4);
        System.out.println("nums.size() = " + nums.size());

       nums.remove(new Integer(88));
        System.out.println("nums = " + nums);

        for (int i = 0; i <nums.size() ; i++) {
            System.out.println(nums.get(i));
        }

        for (Integer num : nums) {
            System.out.print(num + " ");

        }
    }
}
