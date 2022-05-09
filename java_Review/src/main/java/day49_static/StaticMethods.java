package day49_static;

public class StaticMethods {
        int num=10;    // instant variable
         static int count =20;
        public static void displayMessage(String message){
                System.out.println("Messages :" + message);
               // System.out.println("num : " + num);   // we can't access instance variables from static method
                System.out.println("count :" + count);  // static methods can only access static variables or methods
        }

        public static void anotherStaticMethod(){
                System.out.println("Another static method");
                displayMessage("Developer class is heavy");  // static method calling another static method
        }


        public void instanceMethod(){
                System.out.println("Instance method ");
                System.out.println(num); // can access non static variables
                System.out.println("count = " + count);  // access to static too

        }

}
