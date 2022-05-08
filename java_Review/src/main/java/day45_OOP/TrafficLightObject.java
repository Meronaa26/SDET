package day45_OOP;

public class TrafficLightObject {
    public static void main(String[] args) {
        TrafficLight light= new TrafficLight();
        light.showColor();   // is null because I didn't assign anything in here
        light.changeColor("Green");
        light.showColor();// current color is green
        light.changeColor("Red");
        light.showColor();

    }
}
