package day55_abstraction.interface_demo;

public interface MyInterface {

    public abstract void learn();
}

interface MyInterface2{}

class MyClass implements MyInterface , MyInterface2{

    @Override
    public void learn() {
        System.out.println("Learning in MyClass");
    }
}

class Main{

    public static void main(String[] args) {
       // MyInterface myInterface= new MyInterface(); we can not create an object

        MyClass myClass= new MyClass();

    }
}