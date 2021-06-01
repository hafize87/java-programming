package day08_casting_scanner;

import java.util.Scanner;
public class ScannerIntro {
    public static void main(String[] args) {

        Scanner input = new Scanner  (System.in);
        System.out.println("Please enter your name : ");
        String name = input.next();

        System.out.println("My name is " + name + ".");

    }
}
