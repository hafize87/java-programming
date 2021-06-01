package day09_scanner_practice;

import java.util.Scanner;

public class SalaryCalculator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter hourly rate");
        double rate = input.nextDouble();
        double weeklyPay = rate * 40;
        double monthlyPay = weeklyPay * 52 /12;
        double annualPay = monthlyPay * 12;

        System.out.println("Weekly payment: " + weeklyPay);
        System.out.println("Monthly payment: " + monthlyPay);
        System.out.println("Annual payment: " + annualPay);

        input.close();
    }
}
