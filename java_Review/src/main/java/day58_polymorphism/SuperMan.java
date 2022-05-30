package day58_polymorphism;

public class SuperMan extends Father implements Worker{


    @Override
    public void work(String job) {
        System.out.println("SuperMan is working as" + job);
    }

    @Override
    public double getPaid() {
        return 5000;
    }
}
