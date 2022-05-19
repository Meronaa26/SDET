package day53_inheritance;

public class CarObjects {
    public static void main(String[] args) {
        ElectricCar car=new ElectricCar("Honda","Civic",7893.9,2022,67000);
        System.out.println("car.toString() = " + car.toString());
        car.drive(4000);
        System.out.println("car = " + car);

        System.out.println("ElectricCar.getCount() = " + ElectricCar.getCount()); // count is starting to count inhere so it is 1



        Roadster roadster = new Roadster("RoadSter" ,"Tesla",344566,2022,56789);
        System.out.println("roadster.toString() = " + roadster.toString());
        roadster.drive(2000);
        roadster.drive(300);
        System.out.println("roadster.getCount() = " + roadster.getCount());//static method is inherited   count will be 2 in here ++


        ModelX modelX = new ModelX("Toyota","HRV", 28000,2018 ,23000);
        System.out.println("modelX = " + modelX);
        modelX.drive(3500);
        System.out.println("ModelX.getCount() = " + ModelX.getCount()); // count in here is 3 because of static

    }
}
