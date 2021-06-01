package day09_scanner_practice;

import java.util.Scanner;

public class CentToDollars {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter cents");
        int cent = input.nextInt();

        int dollar = cent /100;
       int remainingCents = cent % 100;

        System.out.println("cent = " + cent);
        System.out.println("dollar = " + dollar);
        System.out.println("remainingCents = " + remainingCents);
        System.out.println("In " + cent + " cents : " + dollar + " dollars " + remainingCents + " cents." );

        input.close();
    }

}
