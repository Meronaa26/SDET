package day41_arrayList;

import java.util.ArrayList;
import java.util.List;

public class UpdatingArrayList {

    //SET ==> update or replace value at certain index

    public static void main(String[] args) {
        List<String> cars= new ArrayList<>();
        cars.add("HONDA");
        cars.add("TOYOTA");
        cars.add("AUDI");
        cars.add("LEXUS");
        cars.add(0,"MAZDA");
        cars.add(3,"JEEP");

        System.out.println("cars = " + cars.toString());
        String allCarsIN1st =cars.toString();  //here is what we need the toString method it saves all cars in one string
        System.out.println("allCarsIN1st = " + allCarsIN1st);

        cars.set(3,"YUGO");
        System.out.println("cars = " + cars);


        //INDEXOF
        //find the index of  AUDI
        System.out.println("cars.indexOf(\"AUDI\") = " + cars.indexOf("AUDI"));
        cars.set(cars.indexOf("LEXUS"), "FORD");
        System.out.println("cars = " + cars);

        if(cars.contains("AUDI")){
            cars.set(cars.indexOf("AUDI"), "BUGATTI");
        }else{
            System.out.println("The car is not in the list");
        }

        System.out.println("cars = " + cars);


        for (int i = 0; i < cars.size(); i++) {
            if(cars.get(i).equals("HONDA")){
                cars.set(i,"TESLA" );
            }else if(cars.get(i).equals("YUGO")){
                cars.set(i,"LEXUS");
            }
        }
        System.out.println(cars );
    }
}
