package mypractice;

import java.util.Scanner;

public class LoopPractice1_Saim {
    public static void main(String[] args) {

//        • Write a program that can calculate the sum of all the even numbers
//        between 1 ~ 100
//
//        int sum = 0;
//
//        for(int i = 1; i<=100; i++){
//            if(i%2 == 0){
//                sum += i;
//
//            }
//            System.out.println(sum);
//        }


    //------------------------------------------------------------------------------------


//             • Write a program that can calculate the sum of all the odd numbers
//         between 1 ~ 100
//
//        int sum = 0;
//        for(int i = 1; i <=100; i++){
//            if(i %2 != 0){
//              sum += i;
//
//            }
//        }
//        System.out.println(sum);

     // -------------------------------------------------------------------------------------------------

//        • Write a program that can print all the ODD numbers between 0 ~ 100
//        that can be divisible by 3 & 5
//
//        for(int i = 0; i<=100; i++){
//            if(i %2 != 0){
//              if(i %3 == 0 && i % 5 == 0) {
//                  System.out.println(i);
//            }
//            }
//        }

        // -------------------------------------------------------------------------------------------


//           • Write a program that can print all the EVEN numbers between 0 ~
//                100 that can be divisible by 3 & 5

//        for(int i = 0; i<=100; i++){
//            if(i %2 ==0){
//                if(i % 3 ==0 && i % 5 == 0){
//                    System.out.println(i);
//                }
//            }
//        }

        // -----------------------------------------------------------------------------------------

//        [Dynamic alphabet]
//          • Write a program that will ask ‘upper’ or ‘lower’
//          • If it is upper: print the alphabet in all uppercase letter from A to Z
//          • If it is lower: print the alphabet in all uppercase letter from a to z
//
//                - Challenge: Also ask if they want to show the alphabet in ascending or
//        order descending
//                - Ascending (artan) : A – Z or a – z
//                - Descending (azalan) : Z – A or z – a



//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter upper or lower");
//        String letter = input.next();
//
//        if(letter.equals("upper")){
//
//            for(int i = 'A'; i<= 'Z'; i++) {
//                System.out.print((char) i);
//            }
//            System.out.println();
//            for (int i = 'Z'; i>= 'A'; i--){
//                System.out.print((char)i);
//            }
//        }
//        else if(letter.equals("lower")) {
//            for (int i = 'a'; i <= 'z'; i++) {
//                System.out.print((char) i);
//            }
//            System.out.println();
//            for (int i = 'z'; i>= 'a'; i--){
//                System.out.print((char)i);
//            }
//        }



      //-----------------------------------------------------------------------------------------

//              [Max and Min from 5 numbers]
//      • Write a program that can ask the user "enter a number" five times
//        and return the maximum number
//      • Write a program that can ask the user "enter a number" five times
//        and return the minimum number

//        Scanner input = new Scanner(System.in);
//        System.out.println("enter 5 numbers");
//        int number = input.nextInt();
//
//        int max = number;
//        int min = number;
//
//
//
//        for (int i = 0; i<5; i++){
//            System.out.println("enter 5 numbers");
//            number = input.nextInt();
//
//            if(number > max){
//                max = number;
//            }
//            if(number < min){
//                min = number;
//            }
//
//        }
//        System.out.println("Max number " + max);
//        System.out.println("Min number " + min);




    }
}
