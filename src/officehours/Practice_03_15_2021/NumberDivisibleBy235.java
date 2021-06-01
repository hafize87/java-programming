package officehours.Practice_03_15_2021;

import java.util.Scanner;

public class NumberDivisibleBy235 {
    public static void main(String[] args) {
        //        Create a program that will accept a number and it will print if it is evenly divisible by 2, 3, and 5
//      Ex:
//        number = 65
//      Output:
//        65 is divisible by 2: false
//        65 is divisible by 3: false
//        65 is divisible by 5: true

        Scanner input = new Scanner(System.in);
        System.out.println("Enter integer number");
        int num = input.nextInt();

        if(num%2 == 0){
            System.out.println(num + " is divisible by 2: true");
        }
        else{
            System.out.println(num + " is divisible by 2: false");
        }
        if(num%3 == 0){
            System.out.println(num + " is divisible by 3: true");
        }
        else{
            System.out.println(num + " is divisible by 3: false");
        }
        if(num%5 == 0){
            System.out.println(num + " is divisible by 5: true");
        }
        else {
            System.out.println(num + " is divisible by 5: false");
        }

        int num1 = 65;
        boolean b = num1%2 == 0;
        boolean b2 = num1%3 == 0;
        boolean b3 = num1%5 == 0;

            System.out.println(num1 + " is divisible by 2: " + b);

            System.out.println(num1 + " is divisible by 3: " + b2);

            System.out.println(num1 + " is divisible by 5: " + b3);

    }
}


