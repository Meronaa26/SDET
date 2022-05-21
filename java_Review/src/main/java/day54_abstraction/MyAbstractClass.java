package day54_abstraction;

public  abstract class MyAbstractClass {

    int num=55;
    public void learn(){
        System.out.println("Learn Java...");
    }
    public abstract void close();  // abstract method- just method with signature  no implementation
}




class Sub extends MyAbstractClass{

    public void close(){  // in here we must implement the method that's why we have {}
        System.out.println("Close -> implementing the method ");

    }
}






class MyObject{
    public static void main(String[] args) {

       // MyAbstractClass mac= new MyAbstractClass(); will not work
        Sub sub= new Sub();
        sub.learn();
        sub.num=89;
        sub.close();

    }
}