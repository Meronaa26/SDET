package day37_methods_overloading;

public class VarArgs {


    public static void main(String[] args) {
       addNumbers(56,78,90);
       addNumbers(89,9,9999,444,44,53,22222,5555,6677,7777,444);

    }
    public static void addNumbers(int ... nums){   // it considers as array
        int sum=0;
        //inside this method , it is used as regular array
        for (int num : nums) {
            sum+=num;
        }
        System.out.println("sum = " + sum);
    }
}
