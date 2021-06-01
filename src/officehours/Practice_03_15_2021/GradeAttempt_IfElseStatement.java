package officehours.Practice_03_15_2021;

import java.util.Scanner;

public class GradeAttempt_IfElseStatement {
    public static void main(String[] args) {
        //        Write a program that will give the grade after the retake.
//      The program should read a score of the test and which attempt it was.
//          If its the first attempt -> subtract 10%
//          If its the second attempt -> subtract 20%
//          If its the third attempt -> subtract 35%

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the score");
        int score = input.nextInt();
        System.out.println("Enter attempt number 1 - 3");
        int attempt = input.nextInt();

        if(attempt == 1){
            score -= (score * 10/100); //  (score*0.10)
            System.out.println("First attempt: " + score);
        }

        if (attempt == 2){
            score -= (score * 20/100);   // (score*0.20)
            System.out.println("Second attempt: " + score);
        }
        if(attempt == 3){
            score -= (score * 35/100);  // (score*.0.35)
            System.out.println("Third attempt: " + score);
        }


//        Scanner scan = new Scanner(System.in);
//        System.out.println("Enter your test score: ");
//        double score = scan.nextDouble();
//        System.out.println("Which attempt is it?");
//        String attempt = scan.next();
//
//        if (attempt.equals("first")) {
//            score = score - (score * 0.1);
//            System.out.println("Your score is " + score);
//        }
//        else if ( attempt.equals("second")) {
//            score = score - (score * 0.2);
//            System.out.println("Your sco");
//            System.out.println("Your score is " + score);
//        }
//        else if (attempt.equals("third")) {
//            score = score - (score * 0.35);
//            System.out.println("Your score is " + score);
//        }
//        else{
//            System.out.println("Enter correct number");
//        }

    }
}
