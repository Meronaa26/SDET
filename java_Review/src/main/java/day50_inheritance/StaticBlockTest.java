package day50_inheritance;

public class StaticBlockTest {
    public static void main(String[] args) {
        StaticBlockDemo st1= new StaticBlockDemo();  // static block     ==15
       // System.out.println("st1 = " + st1);

        StaticBlockDemo st2= new StaticBlockDemo();  // constructor method running   20
       // System.out.println("st2 = " + st2);

        StaticBlockDemo st3= new StaticBlockDemo(); // 25

        System.out.println(StaticBlockDemo.num);
    }
}
