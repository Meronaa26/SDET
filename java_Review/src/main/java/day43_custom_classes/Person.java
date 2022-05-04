package day43_custom_classes;

public class Person {
    String firstName;
    int age;

    public void speak(){
        System.out.println("Person can speak");
    }
}

class People{
    public static void main(String[] args) {

        // create object of Person class -Instantiate Person class
        Person person= new Person();
        person.firstName="Bob";
        person.age=33;
        person.speak();

        System.out.println(person.firstName);
        System.out.println("person.age = " + person.age);
    }

}