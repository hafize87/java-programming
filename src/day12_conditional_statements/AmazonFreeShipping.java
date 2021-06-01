package day12_conditional_statements;

import java.util.Scanner;

public class AmazonFreeShipping {
    public static void main(String[] args) {
//        create scanner object
//        ask "Enter total price"
//        assign value to totalPrice from scan.nextDouble.
//
//        if totalPrice is more than or equal to 25
//        print "FREE SHIPPING ELIGIBLE. Your order total: $55"
//        ELSE
//        print "NOT ELIGIBLE FOR FREE SHIPPING. Your order total is $10. less than minimum of $25"

        Scanner input = new Scanner(System.in);
        System.out.println("Enter total price");
        double totalprice = input.nextDouble();

        if(totalprice >= 25){
            System.out.println("FREE SHIPPING ELIGIBLE. Your order total : $" + totalprice);
        }
        else{
            System.out.println("NOT ELIGIBLE FOR FREE SHIPPING. Your order total is $" + totalprice + ". less than minimum of $25" );
        }

        System.out.println("Thank you for shopping.");


    }
}
