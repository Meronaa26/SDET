package day59_polymorphism_exception.exception_Handeling;

public class TrtCatch {
    public static void main(String[] args) {

        try {
            System.out.println(10 / 2);
            System.out.println(10 / 0);
            System.out.println(10 / 3);
        }catch (Exception e){
            System.out.println("RuntimeException happen and handled");
        }
        System.out.println("After first try catch");


        try {
            int[] nums = {3, 4, 6, 7, 8};
            System.out.println(nums[0]);
            System.out.println(nums[5]);
        }catch (ArrayIndexOutOfBoundsException a){
            System.out.println("ArrayIndexOutOfBoundsException handled ");
        }
    }

}
