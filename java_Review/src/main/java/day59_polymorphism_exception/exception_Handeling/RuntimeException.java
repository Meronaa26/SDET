package day59_polymorphism_exception.exception_Handeling;

public class RuntimeException {
    public static void main(String[] args) {
        System.out.println(10/2);
        System.out.println(10/0);  // error  ==> runtime exception
        System.out.println(10/3);
    }
}
