package day32_arrays_split;
import java.lang.reflect.Array;
import java.util.*;
public class MaxMinPrice {
    public static void main(String[] args) {

        String[] items  = {"Shoes", "Jacket","Gloves", "Airpods", "iPad", "iphone 11 case" };

        double[] prices = {99.99, 150.0, 9.99, 250.0 , 439.50, 39.99};

        int[] itemIDs =   {12345 , 12346, 12347, 12348, 12349, 12350};

        // print array values as String , in same line, with no loop

        System.out.println(Arrays.toString(items));
        System.out.println(Arrays.toString(prices));
        System.out.println(Arrays.toString(itemIDs));


        double maxPrice = prices[0];
        int maxPriceIndex = 0;
        double minPrice = prices[0];
        int minPriceIndex = 0;

        for(int i = 0; i < prices.length; i++){
            if(prices[i] > maxPrice){
               maxPrice = prices[i];
               maxPriceIndex = i;


            }
            if(prices[i] < minPrice){
               minPrice = prices[i];
               minPriceIndex = i;
            }
        }
        System.out.println("Maximin price $" + maxPrice + " - " + items[maxPriceIndex] + " - #" + itemIDs[maxPriceIndex]);
        System.out.println("Minimum price $" + minPrice + " - " + items[minPriceIndex] + " - #" + itemIDs[minPriceIndex]);

    }
}
