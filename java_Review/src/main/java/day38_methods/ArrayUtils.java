package day38_methods;

public class ArrayUtils {
    public static void printArray(int []nums){

        for (int num : nums) {
            System.out.println(num +" ");
        }
        System.out.println();
    }

    public static int sumArray(int[] sum){
       int result=0;
//        for (int i = 0; i < sum.length; i++) {
//           // result=result+i;
//            result+=i;
//        }
//        return result;


        for (int i : sum) {
           result=result+i;
        }
        return result;
    }

    public static boolean findNum( int number[], int target){
        boolean isthenumber=false;
        for(int each:number){
            if(each==target){
                 isthenumber=true;
                 break;
            }

        }

        return isthenumber;
    }
}
