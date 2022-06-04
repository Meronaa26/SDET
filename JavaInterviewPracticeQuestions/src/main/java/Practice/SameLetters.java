package Practice;

import java.util.Arrays;

public class SameLetters {
    public static void main(String[] args) {
        System.out.println("same(\"bca\",\"abc\") = " + same("bca", "abc"));

    }

    public static boolean same(String a , String b){
        char[] str1=a.toCharArray();
        char[]str2=b.toCharArray();
        Arrays.sort(str1);
        Arrays.sort(str2);
        String a1="" ,b2="";

        for(char each:str1)
            a1+=each;


        for(char each1:str2)
            b2+=each1;

        return a1.equals(b2);
    }
}
