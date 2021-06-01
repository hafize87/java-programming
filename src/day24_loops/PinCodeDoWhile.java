package day24_loops;

import java.util.Scanner;

public class PinCodeDoWhile {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int pinCode;
        int secretPineCode = 1234;
        System.out.println("Welcome to ATN , Please enter your code");
        do {

            pinCode = input.nextInt();
            if(pinCode != secretPineCode){
                System.out.println("Try again");
            }

        } while (pinCode != secretPineCode);

        System.out.println("Welcome to your account");
    }
}
