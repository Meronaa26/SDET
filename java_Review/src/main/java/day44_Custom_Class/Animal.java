package day44_Custom_Class;

public class Animal {
    String type= "Tiger";

    public void eat(){
        System.out.println("Eating .........");
    }
    public void speak(){
        System.out.println("Speaking ........");
    }

    public void eat(String food){
        System.out.println("Eating ........." + food);
    }
}
