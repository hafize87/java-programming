package day09_scanner_practice;

import java.util.Scanner;

public class GroceryShopping {
    public static void main(String[] args) {

        Scanner input = new Scanner (System.in);
        System.out.println("Enter price for milk:");
        double milk = input.nextDouble();

        System.out.println("Enter price for bread:");
        double bread = input.nextDouble();

        System.out.println("Enter price for cucumber:");
        double cucumber = input.nextDouble();

        double sum = milk + bread + cucumber;
        System.out.println("Total price: $" + sum);

        input.close();
    }
}
