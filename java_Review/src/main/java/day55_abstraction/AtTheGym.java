package day55_abstraction;

public class AtTheGym {
    public static void main(String[] args) {
       // Exercise exercise = new Exercise();  // can not create an object from abstract class

       Swimming swimming= new Swimming();
       swimming.getCaloriesCount(5);
       swimming.perform();
       swimming.start();

       Running running = new Running();
       running.getCaloriesCount(5);
       running.perform();
       running.start();


    //   Lifting lifting = new Lifting() ; abstract class

        FreeWeight freeWeight= new FreeWeight();
        freeWeight.endLift();
        freeWeight.getCaloriesCount(5);
        freeWeight.perform();

    }
}
