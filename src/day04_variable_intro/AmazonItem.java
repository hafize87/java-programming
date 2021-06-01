package day04_variable_intro;

import jdk.swing.interop.SwingInterOpUtils;

public class AmazonItem {
    public static void main(String[] args) {

        String description = "HIC wooden spoon";
        int ratingsCount =181;
        double price = 56;
        String seller = "amazon.com";
        boolean prime = true; // String prime = "yes"

        System.out.println("---- PRODUCT INFORMATION----");
        System.out.print(description);
        System.out.println(" * * * * *");
        System.out.println(ratingsCount);
        System.out.println(price);
        System.out.println(seller);
        System.out.println(true);




    }
}
