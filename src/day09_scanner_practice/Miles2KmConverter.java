package day09_scanner_practice;

import java.util.Scanner;

public class Miles2KmConverter {
    public static void main(String[] args) {

//        create scanner object
//                miles, kilometers
//         Enter miles:10
//       10 miles in kilometer: 16.0934
//              ---------
//                    formula:
//        kilometers -> miles * 1.609

        Scanner input = new Scanner (System.in);
        System.out.println("Enter miles");
        int mile = input.nextInt();
        double kilometer = mile * 1.609;
        System.out.println(mile + " miles in kilometer: " + kilometer);

        System.out.println("Enter cent");
        int cent = input.nextInt();



    }
}
