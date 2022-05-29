package day57_abstraction_polymorphism.abstract_class_vs_interface;

public interface InterfaceA {

    public static final String TYPE="Interface";
    double MAX_COUNT=500.00;  // automatically it is public static final




    public abstract void absMethodD(int num);
    public static  void staticMethodE(String str){
        System.out.println("Static method E is called " +  str);
    }

    public default void defaultMethodF(){
        System.out.println("Default method F is called");
    }
}
