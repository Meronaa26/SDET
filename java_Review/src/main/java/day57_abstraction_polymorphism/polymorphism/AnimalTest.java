package day57_abstraction_polymorphism.polymorphism;

import java.util.ArrayList;
import java.util.List;

public class AnimalTest {
    public static void main(String[] args) {


        Animal a1= new Animal();
        a1.makeNoise();

        Animal a2= new Dog();
        a2.makeNoise();

        Animal a3= new Cat();
        a3.makeNoise();

        Animal a4= new Horse();
        a4.makeNoise();


        List<Animal>listOfAnimals= new ArrayList<>();
        listOfAnimals.add(new Dog());
        listOfAnimals.add(new Horse());
        listOfAnimals.add(new Cat());

        for (Animal each : listOfAnimals) {
            each.makeNoise();

        }
    }
}
