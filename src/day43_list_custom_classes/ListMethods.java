package day43_list_custom_classes;

import day41_arraylist.ArraysAsList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class ListMethods {
    public static void main(String[] args) {

        System.out.println(getDays());

        System.out.println(getDays().size());  // 5
        System.out.println(getDays().get(0));  // Monday

        List<String> name = getDays();  // i stored other ArrayList
        System.out.println(name);
        name.add("java day");

        // removeIf method - accepts lambda - easy to remove without loop
        name.removeIf(day -> day.length() == 6);
        System.out.println("Name after remove = " + name);    //  [Tuesday, Wednesday, Thursday, java day]


        System.out.println(getRandomList(4));

        List<Integer> store = getRandomList(100);  // once baska seye declere edip cikartiyosun
        System.out.println("store.size()= " + store.size());   // 100

        store.removeIf(n -> n < 90);  // remove store less than 90
        System.out.println(store);

    }

    public static List<String> getDays(){

        List <String> day = new ArrayList<>(Arrays.asList("Monday", "Tuesday", "Wednesday","Thursday", "Friday"));
        return day;

    }

    public static List<Integer> getRandomList (int size){
        Random randomNum = new Random(101);  // new random object with 0-100 limit
        List<Integer> random = new ArrayList<>();

        for (int i = 0; i < size; i++) {
            random.add(randomNum.nextInt(101));  // generate random number 0-101 and add to list

        }
        return random;

    }
}
