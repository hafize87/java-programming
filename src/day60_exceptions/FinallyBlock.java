package day60_exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class FinallyBlock {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        try {

            System.out.println("Enter a number: ");
            int num = input.nextInt();
            System.out.println("You entered " + num);
           // System.out.println(num / 0);
           //  System.exit(0);  // stop java all together , finally block will not run
        } catch (InputMismatchException e){

            System.out.println("You entered invalid value");
        }finally {
            input.close();  // close and clean up the scanner
            System.out.println("Finally block - runs always");
        }

        System.out.println("come");

    }
}
