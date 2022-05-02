package day38_methods;

import static day38_methods.ArrayUtils.*;
import static day38_methods.StringUtils.*;

public class StringUtilsTest {

    public static void main(String[] args) {
        String userName="";
        String palindrome="meron";
        System.out.println("StringUtils.isPalindrome(palindrome) = " + isPalindrome(palindrome));
        System.out.println("StringUtils.palindrome2(\"meron\") = " + palindrome2("civic"));
        System.out.println("StringUtils.palindrome2(\"kayak\") = " + palindrome2("kayak"));

        System.out.println("StringUtils.isNullOrEmpty(userName) = " + isNullOrEmpty(userName));
        System.out.println("reverse(\"meron\") = " + reverse("meron"));





        int str[]={7,9,4,5,6,8,9};
        printArray(str);
        printArray(new int[]{89,67,6,5,4,3,5});
        int num[]={10,11,20,40};
        System.out.println("sumArray(num) = " + sumArray(num));
        System.out.println("sumArray(str) = " + sumArray(str));



//        int[] nums2={5,6,7,8,9,5,3};
//        int target=3;
//        int num1=0;
//        for (int i : nums2) {
//            boolean number=false;
//            if(i==num1){
//                number=true;
//            }
//        }

        int [] number2={7,8,9,5,6,4};

        System.out.println("findNum(str,5) = " + findNum(number2, 5));

    }

}
