package day41_arrayList;

import java.util.ArrayList;

public class CitiesList {
    public static void main(String[] args) {
        //declare arrayList

        ArrayList<String>cities= new ArrayList<>();
        cities.add("Asmera");
        cities.add("Debarwa");
        cities.add("Akurdet");
        cities.add("Massawa");
        cities.add("Dekemhare");

        cities.add(1,"Keren");  //inserting in different index
        System.out.println("cities = " + cities);

        System.out.println("cities  = " + cities.get(0) +  " : " + cities.get(2));
        System.out.println("cities Last = " + cities.get(cities.size() - 1));

        System.out.println("cities.size() = " + cities.size());

        for (int i = 0; i < cities.size(); i++) {
            System.out.println(cities.get(i) + " ");
        }

        for (String city : cities) {
            System.out.println(city);

        }

        cities.remove(3);
        System.out.println(cities);

        // how to check arrayList
        cities.clear();
        System.out.println("After clear " + cities);

        if(cities.isEmpty()){   //cities.size()==0
            System.out.println("List is empty");
        }

        //SET ==> update or replace value at certain index

    }
}
