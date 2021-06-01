package day24_loops;

import java.util.Scanner;

public class GiveMe5$ {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("give me $ 5");
        int dollar = input.nextInt();


        while (dollar != 5){
            System.out.println("give me $ 5");
            dollar = input.nextInt();

        }
        System.out.println("Thank you for 5 dollars");

    }
}
