package day57_abstraction_polymorphism.abstract_class_vs_interface;

public abstract  class AbstractA {

    int num;
    private double price;
    public static int  count;
    public final String TYPE="Abstract";
    public static final String LANGUAGE="JAVA";


    public AbstractA(){
        System.out.println("Abstract have constructors ");
    }


    public abstract void absMethodA();

    public void methodB(){
        System.out.println("Method B is called");
    }

    public static void staticMethodC(){
        System.out.println("Static method C is called");
    }
}
