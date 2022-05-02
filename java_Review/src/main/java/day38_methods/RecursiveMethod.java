package day38_methods;

public class RecursiveMethod {

    public static void main(String[] args) {
       printNums(1);
    }

    public static void printNums( int num){

        System.out.println(num + " ");
        num++;
        printNums(num);
        
    }
}
