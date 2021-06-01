package day24_loops;

import java.util.*;

public class GuessTheNumber {
    public static void main (String[] args){

        Random randomNum = new Random();
        Scanner input = new Scanner(System.in);

        int secretNumber = randomNum.nextInt(101);     // 0 -100 arasi. kendim ne aralikta oldugunu belirleyebilirsin
        int guessingNumber;


        do {
            System.out.println("Guess the secret number");
            guessingNumber = input.nextInt();
            if(guessingNumber > secretNumber){
                System.out.println("Wrong, your number is too large");
            }
            else{
                System.out.println("Wrong, your number is too small");
            }

        }while (secretNumber != guessingNumber);

        System.out.println("Congratulation");
    }
}
