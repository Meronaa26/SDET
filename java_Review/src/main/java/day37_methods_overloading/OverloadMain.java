package day37_methods_overloading;

import java.util.Arrays;

public class OverloadMain {
    public static void main(String args[]) {

        System.out.println("Hello from main method ");
        System.out.println("Arrays.toString(args) = " + Arrays.toString(args));
        main("no matter what","keep pushing !!!");
    }

    public static void main(String st1, String name){

        String hello= st1 + " "+ name;
        System.out.println(hello);
    }
}
