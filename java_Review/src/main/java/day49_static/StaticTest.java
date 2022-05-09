package day49_static;

public class StaticTest {

    public static String word="java";

    public static void main(String[] args) {
        //1==> rule 1 is we can call directly static method
        StaticMethods.anotherStaticMethod();

        StaticMethods.displayMessage("Yes you are a rock star!!!");

        StaticMethods staticMethods = new StaticMethods();
        staticMethods.instanceMethod();


        System.out.println("word = " + word);


    }
}
