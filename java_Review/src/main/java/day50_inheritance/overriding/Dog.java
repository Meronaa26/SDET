package day50_inheritance.overriding;

public class Dog extends Animal{

    public void run() {
        System.out.println("Dog is running");
    }

    @Override
    public void speak() {
       // super.speak();
        System.out.println("dog is owing");
    }
}
