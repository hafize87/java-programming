package saim_oop;

import java.util.ArrayList;
import java.util.List;

public class WalmartStore {

//    Create a class WalmartStore
//
//    -> Instance variables:
//            - location (String), totalWorth (double)
//            - inventory (List of Items)
//
//    -> Static variables:
//            - company name (String),
//
//    -> Constructor:
//            - Accepts and initializes location, has an empty inventory
//
//        - Overloaded: Accepts and initializes location, also accepts an ArrayList of Items for starting inventory
//
//    -> Instance methods:
//
//            - calculateWorth() -> Checks inventory, totals up amount of money all the items are worth. (each times price * quantity). Stores to the totalWorth variable
//
//        - restockInventory(List of Item) -> Adds the given items to the store inventory.
//    Challenge: If the item exists in the inventory already (same item name and price)
//
//
//        - toString(): returns information about Item


    String location;
    double totalWorth;
    static String name;
    List<Item> items = new ArrayList<>();


    public WalmartStore(String location, List<Item> items){

        this.location = location;
        this.items = items;
    }

    public void calculateWorth(){


    }


}
