package day55_abstraction;

public abstract class Exercise {

    public void start(){
        System.out.println("Warming up and starting the exercise ");
    }


    public  abstract  void perform();  // abstract method letting sub classes implement or override their own way

    public  abstract  int  getCaloriesCount( int minutes);
}
