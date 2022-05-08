package day44_Custom_Class;

public class AnimalObject {
    public static void main(String[] args) {
        Animal animal= new Animal();
        System.out.println(animal.type);
        animal.eat();
        animal.speak();
        animal.eat("Grass");

        //Creating new animal object -cheetahobj
        Animal cheetahObj= new Animal();
        cheetahObj.type="Cheetah";  //reassigning
        System.out.println(cheetahObj.type);
    }
}
