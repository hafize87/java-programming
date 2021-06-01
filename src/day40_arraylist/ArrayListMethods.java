package day40_arraylist;
import java.util.*;
public class ArrayListMethods {
    public static void main(String[] args) {

     //    List<String> shoppingList = new ArrayList<>();   -- > boylede yazabilirz
        ArrayList<String> shoppingList = new ArrayList<>();

        System.out.println("size = " + shoppingList.size());   // 0
        System.out.println("isEmpty = " + shoppingList.isEmpty());

        if(shoppingList.isEmpty()){
            System.out.println("List is empty, keep coding java");
        }
        else{
            System.out.println("List is not empty");
        }

        shoppingList.add("shoes");
        shoppingList.add("cheap monitor");
        shoppingList.add("mask");
        shoppingList.add("wooden spoon");
        shoppingList.add("scooter");
        shoppingList.add("java book");
        shoppingList.add("tesla");

        if(shoppingList.isEmpty()){
            System.out.println("List is empty, keep coding java");
        }
        else{
            System.out.println("List is not empty");
        }

        System.out.println(shoppingList);  // [shoes, cheap monitor, mask, wooden spoon, scooter, java book, tesla]

        int count = shoppingList.size();
        System.out.println("Items to buy = " + count);   // 7

        System.out.println("is shoes in my list? " + shoppingList.contains("shoes"));  // true

        if(shoppingList.contains("java book")){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }

        System.out.println("buying .. $80");
        shoppingList.remove("shoes");

        System.out.println("all list = " + shoppingList);   //  [cheap monitor, mask, wooden spoon, scooter, java book, tesla]

        System.out.println("done shopping, get back to coding");

        shoppingList.clear();  // clear the list , remove all items
        System.out.println(shoppingList);  //  []
    }


}
