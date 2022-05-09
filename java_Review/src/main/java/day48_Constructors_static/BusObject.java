package day48_Constructors_static;

public class BusObject {
    public static void main(String[] args) {

        Bus bus=new Bus();
        bus.driver= new Driver("Abbas");
        bus.engine= new Engine(9);
        System.out.println("bus = " + bus);

        Bus metroBus = new Bus();
        metroBus.driver=new Driver("Meron");
        metroBus.engine=new Engine(8);
        System.out.println("metroBus = " + metroBus);
    }
}
