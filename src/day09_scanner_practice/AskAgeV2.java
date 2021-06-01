package day09_scanner_practice;

import java.util.Scanner;

public class AskAgeV2 {
    public static void main(String[] args) {

        Scanner input = new Scanner (System.in);
        System.out.println("How old are you?");
        int age = input.nextInt();

        System.out.println(age + " - that's great age!");
        input.close();
    }
}
