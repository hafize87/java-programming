package day07_arithmetic_operators_casting;

import java.util.Scanner;

public class PrimitiveCasting {
    public static void main(String[] args) {

        int num1 = 100;
        byte b1 = (byte) num1;
        short s1 = (short) num1;
        long l1 = num1;

        System.out.println(num1);
        System.out.println(b1);
        System.out.println(s1);
        System.out.println();
        System.out.println(l1);

        Scanner input = new Scanner(System.in);
        String s = input.nextLine();
        System.out.println("Today's word of the day is: " + s);




    }
}
