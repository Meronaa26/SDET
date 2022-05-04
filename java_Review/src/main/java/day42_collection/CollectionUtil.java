package day42_collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CollectionUtil {
    public static void main(String[] args) {
        List<Character> letters= new ArrayList<>();
        letters.addAll(Arrays.asList('j','b','g','y','p','t','e','t'));
        System.out.println("letters.size() = " + letters.size()  + " " + letters);

        Collections.reverse(letters);
        System.out.println("reversed order = " + letters);

        // Love the frequency
        System.out.println("Collections.frequency(letters,'t') = " + Collections.frequency(letters, 't'));

        System.out.println("Collections.max(letters) = " + Collections.max(letters));
        System.out.println("Collections.min(letters) = " + Collections.min(letters));
        System.out.println("Collections.replaceAll(letters , 't','M') = " + Collections.replaceAll(letters, 't', 'M'));
        System.out.println("letters = " + letters);

        Collections.sort(letters);
        System.out.println("letters sort = " + letters);

        List<Integer>nums=Arrays.asList(23,45,77,89,56,68,34,23,89,23,45,23,67,23,67,89,65,23,45,67,89);
        System.out.println("nums = " + nums);
        Collections.reverse(nums);
        System.out.println("nums reversed = " + nums);

        int max=Collections.max(nums);
        System.out.println("max = " + max);
        int min=Collections.min(nums);
        System.out.println("min = " + min);

        System.out.println("Collections.frequency(nums,23) = " + Collections.frequency(nums, 23));

        int countof67= Collections.frequency(nums,67);
        System.out.println("countof67 = " + countof67);

        Collections.replaceAll(nums,67,99);
        System.out.println("nums 67 replaced = " + nums);

        Collections.sort(nums,Collections.reverseOrder());
        System.out.println("nums after sorted = " + nums);

        Collections.shuffle(nums);
        System.out.println("nums Shuffle = " + nums);




    }
}
