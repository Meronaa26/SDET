package day59_polymorphism_exception;

import day57_abstraction_polymorphism.shapes.Circle;
import day57_abstraction_polymorphism.shapes.Shape;
import day57_abstraction_polymorphism.shapes.Triangle;

public class InstanceOf {
    public static void main(String[] args) {
        Shape shape= new Triangle();

        //Java reflection  API
        System.out.println("shape.getClass().getSimpleName() = " + shape.getClass().getSimpleName());  // class name of object
        System.out.println("shape.getClass().getName() = " + shape.getClass().getName());


        WebElement el = new Link();
        System.out.println("el.getClass().getSimpleName() = " + el.getClass().getSimpleName());
        System.out.println("el.getClass().getDeclaredFields().getClass().getName() = " + el.getClass().getDeclaredFields().getClass().getName());

        if(shape instanceof Circle){
            System.out.println("It is a Circle object");
        }else if(shape instanceof Triangle){
            System.out.println("It is a Triangle object");
        }
    }
}
