package day57_abstraction_polymorphism.shapes;

import java.util.ArrayList;
import java.util.List;

public class ShapeTest {

    public static void main(String[] args) {
        Shape triangle= new Triangle();
        triangle.draw();


        Shape circle= new Circle();
        circle.draw();


        List<Shape> shapes= new ArrayList<>();
        shapes.add(new Circle());
        shapes.add(new Triangle());


        for (Shape each : shapes) {
            each.draw();

        }
    }
}
