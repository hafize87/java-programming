package day10_shorthand_operators;

import java.util.Scanner;

public class WeatherToday {
    public static void main(String[] args) {

        Scanner input = new Scanner (System.in);
        System.out.println("How is the weather today?");
       // String s = input.next();
       String s1 = input.nextLine();

        System.out.println(s1 + " is a nice day today!");


        input.close();
    }
}
