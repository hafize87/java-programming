package day32_arrays_split;
import java.util.*;
public class ShoppingItems {
    public static void main(String[] args) {

        String[] items  = {"Shoes", "Jacket","Gloves", "Airpods", "iPad", "iphone 11 case" };

        double[] prices = {99.99, 150.0, 9.99, 250.0 , 439.50, 39.99};

        int[] itemIDs =   {12345 , 12346, 12347, 12348, 12349, 12350};

        System.out.println("--------FIND THE INDEX OF 'Gloves' in items array");

        // use for loop with condition

        for(int i = 0; i<items.length; i++){
          //  System.out.println(i + "-" + items[i]);  ==> hesinin index ini cikariyo
            if(items[i].equals("Gloves")){
                System.out.println("Gloves found at index " + i);
                break;
            }
        }
//       2. way

        System.out.println(Arrays.binarySearch(items, "Gloves"));


        System.out.println("----- set boolean to true if first 'ipad' is found");
        boolean ipadExists = false;

        for(String each : items){
            if(each.equals("ipad")){
                ipadExists = true;
                break;
            }
        }
        System.out.println(ipadExists);
        if(ipadExists){
            System.out.println("We bought ipad");
        }
        else{
            System.out.println("");
        }


        System.out.println("-------- print a report of each shopping item-----------");


        for(int i = 0; i< items.length; i++){
            System.out.println(items[i] + " - $"+ prices[i] +" - #"+ itemIDs[i]);
        }

        System.out.println("-------- look for 'Jacket' in items and print all details");

        for(int i = 0; i< items.length; i++){
            if(items[i].equals("Jacket")){
                System.out.println(items[i] + " - $" + prices [i] + " - #" + itemIDs[i]);
                break;  // stop searchin after jacket is found
            }
        }
    }
}
