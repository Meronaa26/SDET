package day50_inheritance;

public class InheritanceTest {
    public static void main(String[] args) {

        Person p1 = new Person();
        p1.name="Meron";
        p1.age=25;

        p1.talk();
        p1.walk();
        p1.work(" SDET");

        System.out.println("p1 = " + p1.name);


        Teacher t1= new Teacher();
        t1.teacherId=123;
        t1.name="Muradol";
        t1.age=39;

        System.out.println("t1 = " + t1.name);

        Student student = new Student();
        student.school="Cydeo";
        student.age=17;
        student.topic="Java";
        student.name="Hirute";
        System.out.println("student = " + student.age+" " + student.name + " "+ student.topic);

        student.study("    Selenium  ");
    }
}
