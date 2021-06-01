package day09_scanner_practice;

import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Enter Fahrenheit");
        double fahrenheit = input.nextDouble();

        double celsius = (fahrenheit - 32) * 5/9;
        System.out.println(fahrenheit + " fahrenheit in celsius: " + celsius);

        input.close();
    }
}
