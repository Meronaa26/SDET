package day59_polymorphism_exception.exception_Handeling;

public class SwallowingException {
    public static void main(String[] args) {

        try {
            System.out.println("hello");
            System.out.println(5 / 0);
        }catch (Exception ignore){}

        System.out.println("How are you");
    }
}
