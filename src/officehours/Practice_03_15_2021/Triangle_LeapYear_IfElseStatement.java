package officehours.Practice_03_15_2021;

import java.util.Scanner;

public class Triangle_LeapYear_IfElseStatement {
    public static void main(String[] args) {
        //        [Triangle - If statement, operators]
//   A triangle is valid if the sum of all the three angles is equal to 180 degrees.
//   Write a program that declares three integers as angles and check whether the triangle is valid or not.
//   Print "Valid triangle" or "Not a valid triangle".
//     =>To make it dynamic change the three angles to be Scanner inputs

        Scanner input = new Scanner(System.in);
        System.out.println("Enter triangle angle");
        int angle1 = input.nextInt();
        int angle2 = input.nextInt();
        int angle3 = input.nextInt();
        int sum = angle1 + angle2 + angle3;

        if(sum == 180){
            System.out.println("Valid triangle");
        }
        else{
            System.out.println("Not a valid triangle");
        }


 //        Create a program that will accept a year. Check if the year is a leap year.
//        If it is a leap year print "$year is a leap year" otherwise print "$year is not a leap year"
//
//        Hint: Lets say if a number is evenly divisible by 4 it is a leap year

        System.out.println("Enter a year");
        int year = input.nextInt();

        if(year%100==0){
            if(year%400 == 0){
                System.out.println("Leap year");
            }
            else{
                System.out.println("Not leap year");
            }
        }
        else{
            if(year%4 == 0){
                System.out.println("Leap year");
            }
            else{
                System.out.println("Not leap year");
            }
        }
    }
}
