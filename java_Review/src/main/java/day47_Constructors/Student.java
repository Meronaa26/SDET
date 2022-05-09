package day47_Constructors;

public class Student {


    public Student() {
        System.out.println("No - Args constructor ");
    }

    public Student(String name) {
        System.out.println("Name param constructor"  +  name);
    }


    public Student(String name , int age) {
        System.out.println("Name and Age param constructor  "  +  name + "  And age is " + age);
    }
}
