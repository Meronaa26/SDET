package day38_methods;

public class MethodCallAnother {

    public static void main(String[] args) {
        start();
        continues();
    }

    public static void start(){
        System.out.println("START");
        continues();
    }

    public static void continues(){
        System.out.println("KEEP CONTINUE ");
        end();
    }

    public static void end(){
        System.out.println("END");
        // start();
    }



}
