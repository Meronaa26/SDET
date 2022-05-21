package day55_abstraction;

public class FreeWeight extends Lifting{

    @Override
    public void perform() {
        System.out.println("Free wight dumbbells");

    }

    @Override
    public int getCaloriesCount(int minutes) {
        return minutes*30;
    }

    @Override
    public void endLift() {
        System.out.println("Carefully re-rack dumbbells");
    }
}
