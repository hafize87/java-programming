package day09_scanner_practice;

import java.util.Scanner;

public class AddNumbers {
    public static void main(String[] args) {
        //  Create scanner object
        Scanner input = new Scanner(System.in);

        // ask question
        System.out.println("Enter 2 numbers");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int sum = num1 + num2;
        System.out.println("Result : " + sum);
    }
}
