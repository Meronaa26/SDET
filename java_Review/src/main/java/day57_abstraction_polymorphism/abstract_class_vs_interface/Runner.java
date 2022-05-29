package day57_abstraction_polymorphism.abstract_class_vs_interface;

public class Runner {
    public static void main(String[] args) {

        InterfaceA.staticMethodE("meron"); // we aren't creating an object form interface but calling static method using interface
      ConcreteA.staticMethodC();
    }
}
