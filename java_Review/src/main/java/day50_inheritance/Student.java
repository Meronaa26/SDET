package day50_inheritance;

public class Student extends Person{
    String school;
    String topic;

    public void study(String topic){
        System.out.println(name  + "   is studying"+ topic);
    }
}
