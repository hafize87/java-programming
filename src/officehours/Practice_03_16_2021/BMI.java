package officehours.Practice_03_16_2021;

import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        //    Program will ask user to enter their mass (kilogram) and their height (meters).
//    Calculate their BMI and then print the appropriate message based on the provided values: All numbers taken as doubles
//          —> BMI Formula: BMI = mass / height^2
//          —> Values:
//        Less than 18.5 — Underweight
//        From 18.5 to 25 — Normal weight
//        From 25 to 30 — Overweight
//        More than or equal to 30 — Obese

        Scanner input = new Scanner (System.in);
        System.out.println("Enter your mass (kilogram) and your height (meters)");
        double mass = input.nextDouble();
        double height = input.nextDouble();
        double value = mass / (height * height);

        if(value < 18.5){
            System.out.println("Underweight");
        }
        else if(value >= 18.5 && value <= 25 ){
            System.out.println("Normal weight");
        }
        else if(value > 25 && value < 30){
            System.out.println("Overweight");
        }
        else{
            System.out.println("Obese");
        }


    }
}
