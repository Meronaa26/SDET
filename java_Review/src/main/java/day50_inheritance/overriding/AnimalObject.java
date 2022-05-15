package day50_inheritance.overriding;

public class AnimalObject {

    public static void main(String[] args) {
        Animal animal  = new Animal();
        animal.name="Dodidogi";
        animal.type="German";
        animal.speak();

        Dog dog= new Dog();
        dog.name="Dogidogi";
        dog.run();
        dog.speak();

        Cat cat= new Cat();
        cat.name="Caticati";
        cat.type="Hybrid";
        cat.speak();
        cat.jump();

    }
}
