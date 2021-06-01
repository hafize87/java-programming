package day48_constructors_static;

import java.util.ArrayList;
import java.util.List;

public class CustomerObjects {

    public static void main(String[] args) {


        Customer cs1 = new Customer();

        System.out.println(cs1);   // print with default values that are set in no_args constructor

        cs1.setName("Bob");
        cs1.setId(1);

        System.out.println(cs1);

        Customer cs2 = new Customer("Mike", 2);  // create object and assign values in the same statement

        Customer cs3 = new Customer("John Ward III", 4567);

        System.out.println(cs2);
        System.out.println(cs3);

        // array of Customers

        Customer [] todaysCustomer = {cs1, cs2, cs3, new Customer("Hafize", 1234)};

        // arrayList of customer

        List<Customer> customersList = new ArrayList<>();

        customersList.add(cs1);
        customersList.add(cs2);
        customersList.add(cs3);
        customersList.add(new Customer("Hafize", 3456));
        customersList.add(new Customer("Kemal", 4567));

        // print info of first customer object in array and arrayList

        System.out.println(todaysCustomer[0]);
        System.out.println(customersList.get(0));

        System.out.println(customersList);  // print toString() info of all Customer object

        System.out.println("-------- FOR LOOP --------");

        for (int i = 0; i < customersList.size(); i++) {
            System.out.println(customersList.get(i));

        }

        System.out.println("------ FOR EACH LOOP --------");

        for(Customer each: customersList){
            System.out.println(each);
        }

        // print all names of Customer in the list

        System.out.println("----- NAMES of CUSTOMERS");

        customersList.forEach(a -> System.out.println(a.getName()));  // forEach method and lambda expression

        for(Customer each : customersList){
            System.out.println(each.getName());  //  instance variable private oldugu icin method ile cagirmamiz gerekiyor. eger basinda private olmasaydi direk (each.name) diye cagirabilirdik
        }



    }

}
