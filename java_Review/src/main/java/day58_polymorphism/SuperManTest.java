package day58_polymorphism;

public class SuperManTest {
    public static void main(String[] args) {
        Father father = new SuperMan();
        father.feedKid();
        father.raiseKid();
        father.playWithKid();



        SuperMan superMan = new SuperMan();
        superMan.getPaid();
        superMan.work("SDET");
        superMan.feedKid();
        superMan.raiseKid();
        superMan.playWithKid();


        Worker worker= new SuperMan();
        worker.getPaid();
        worker.work("DEV");

    }
}
