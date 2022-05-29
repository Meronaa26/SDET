package day57_abstraction_polymorphism.abstract_class_vs_interface;

public class ConcreteA extends AbstractA implements InterfaceA ,InterfaceB{

    @Override
    public void absMethodA() {
        System.out.println("Method a is called ");
    }

    @Override
    public void methodB(){
        System.out.println("Method B override version ");
    }

    //@Override   static methods are hidden not override
    public static void staticMethodC(){
        System.out.println("Static method C is called");
    }

    @Override
    public void absMethodD(int num) {
        System.out.println("Method E is called ");
    }
}
