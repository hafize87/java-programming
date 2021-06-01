package day41_arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class ArraysAsList {
    public static void main(String[] args) {

        List<Integer> nums = Arrays.asList(23, 1, 34, 54, 654);

        System.out.println(nums);

        // nums.add(100);  bu sekilde add yapamayiz     UnsupportedOperationException
        // nums.remove(0)  remove da yapayiz                 UnsupportedOperationException
       //nums.clear();  bu sekildede yapamayiz array den geldigi icn yapamiyorz       UnsupportedOperationException

        System.out.println(nums);


        List<Integer> nums1 = new ArrayList<>(Arrays.asList(4, 6, 7, 78, 199));

        nums1.add(5);
        nums1.add(45);
        System.out.println(nums1);   // [4, 6, 7, 78, 199, 5, 45]

        nums1.remove(0);
        nums1.remove(new Integer(199));
        System.out.println(nums1);    //  [6, 7, 78, 5, 45]

        // list String drinksWithCaffeine --> coffee , tea, monster, red bull, coke, pepsi, mdev, kambucha, celsius
        // int coffeineAmount


        List<String> drinksWithCaffeine = new ArrayList<>(Arrays.asList("coffee" , "tea",  "monster", "red bull",
                "coke", "pepsi", "mdev", "kambucha", "celsius"));

        int caffeineAmount = 0;

        for(String drink : drinksWithCaffeine){

            if(drink.equals("monster") || drink.equals("red bull") || drink.equals("celsius")){
                caffeineAmount = 150;
                System.out.println(drink + " = " + caffeineAmount);
            }
            else if(drink.equals("coffee") || drink.equals("kambucha")){
                caffeineAmount = 110;
                System.out.println(drink + " = " + caffeineAmount);
            }
            else if(drink.equals("tea") || drink.equals("coke") || drink.equals("pepsi") || drink.equals("mdev")){
                caffeineAmount = 35;
                System.out.println(drink + " = " + caffeineAmount);
            }
        }

        for(String drink: drinksWithCaffeine){

            switch (drink){
                case "monster":
                case"red bull":
                case "celsius":
                    caffeineAmount = 150;
                    System.out.println(drink + " = " + caffeineAmount);
                    break;
                case "coffee": case "kambucha":
                    caffeineAmount = 110;
                    System.out.println(drink + " = " + caffeineAmount);
                    break;
                case "tea": case "coke": case "pepsi": case "mdev":
                    caffeineAmount = 35;
                    System.out.println(drink + " = " + caffeineAmount);
                    break;
            }
        }

        drinksWithCaffeine.forEach(drink -> System.out.println(drink.toUpperCase()));

        drinksWithCaffeine.forEach(drink -> {
            System.out.println("------------");
            System.out.println("drink = " + drink);
            System.out.println("------------");
        });

        List<Integer> num = Arrays.asList(2,4,5);

        num.forEach(n -> System.out.println(n*n) );


    }
}
