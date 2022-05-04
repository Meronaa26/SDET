package day41_arrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingList {
    public static void main(String[] args) {
        List<Integer> nums=new ArrayList<>();
        nums.add(45);
        nums.add(49); nums.add(7888);nums.add(879);nums.add(56);nums.add(4355); nums.add(6);nums.add(23);
        System.out.println("nums = " + nums);

        Collections.sort(nums);
        System.out.println("Sorting = " + nums);

    }
}
