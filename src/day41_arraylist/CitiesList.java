package day41_arraylist;

import java.util.ArrayList;

public class CitiesList {
    public static void main(String[] args) {

        // declare arraylist

        ArrayList<String> cities = new ArrayList<>();

        // add value

        cities.add("Washington DC");
        cities.add("New York");
        cities.add("Vienna");
        cities.add("Adana");
        cities.add("LA");

        // add duzce to first index

        cities.add(0, "Duzce");

        System.out.println(cities);

        // print first and last city

        System.out.println(cities.get(0) + " " + cities.get(5));   // Duzce LA

        // find last index using size ()-1
        System.out.println(cities.size()-1);   // 5
        System.out.println(cities.get(cities.size()-1));  // LA

        // count of items

        System.out.println(cities.size());  // 6


        int size = cities.size();
        System.out.println(size);  // 6

        // for loop and print all value in same line

        for(int i = 0; i<cities.size(); i++){
            System.out.print(cities.get(i) + " ");
        }
        System.out.println();

        for(String each: cities){
            System.out.print(each + " ");
        }
        System.out.println();

        // remove/ delete item from arrayList

        cities.remove(3); // remove using index
        cities.remove("New York");  // remove using object/ value

        System.out.println("After remove : " + cities);

        cities.clear();

        // make sure it is clear
        // 1) way print | spit it out
        System.out.println(cities);  // []

        // 2) way print | split it out

        if(cities.isEmpty()){
            System.out.println("list is empty");
        }

        // 3) way

        if(cities.size() == 0){
            System.out.println("list is empty");
        }

    }
}
