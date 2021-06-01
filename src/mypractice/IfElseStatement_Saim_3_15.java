package mypractice;

import java.util.Scanner;

public class IfElseStatement_Saim_3_15 {
    public static void main(String[] args) {
//               [Street light]
//       You are at a street line. The color of the street line will determine what you should do.
//          Green light - Print "Go"
//          Yellow light - Print "Slow down"
//           Red light - Print "Stop"
//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter color of the street line");
//        String light = input.next();
//
//        if(light.equals("Green")){
//            System.out.println("Go");
//        }
//        else if(light.equals("Yellow")){
//            System.out.println("Slow down");
//        }
//        else if(light.equals("Red")){
//            System.out.println("Stop");
//        }
//        else{
//            System.out.println("Invalid color");}
//
        //-------------------------------------------------------------------------------------------------//

//        [Baking contest]
//      You are in a baking contest. Your cookies will be rated by 3 judges.
//      The 3 scores from the judges will be averaged and compared with the 2 other people in the contest.
//          Use variables: judge score 1, judge score 2, judge score 3, other person score 1, other persons score 2
//
//        If your score is more than both of the other people then print "First place!"
//        If your score is more then one other person then print "Second place"
//        If your score is less than both of the other people then print "Third place"

//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter judge score");
//        int judgeScore1 = input.nextInt();
//        int judgeScore2 = input.nextInt();
//        int judgeScore3 = input.nextInt();
//        System.out.println("Enter other person score");
//        int otherPersonScore1 = input.nextInt();
//        int otherPersonScore2 = input.nextInt();
//
//        int averageScore = (judgeScore1 + judgeScore2 + judgeScore3)/3;
//
//        if(averageScore > otherPersonScore1 && averageScore > otherPersonScore2){
//            System.out.println("First place!");
//        }
//        else if((averageScore > otherPersonScore1 && averageScore < otherPersonScore2) ||
//                (averageScore < otherPersonScore1 && averageScore > otherPersonScore2)){
//            System.out.println("Second place!");
//        }
//        else{
//            System.out.println("Third place!");
//        }

       // -------------------------------------------------------------------------------------------------------

//
//              [Author] - Look at CappuccinoBuyer from class for an idea
//   You are an author. You are writing a book and want to figure out some information related to the genre of book you are writing.
//  Given the genre name figure out: average page length, average profit, average number of sequels, average number of countries published in.
//      Make variables for all of that information. Given empty defaults for all except the neighborhood name.
//      Print the information once at the end.
//               Data based on genre:
//        genre - Fantasy
//        page length - 500
//        profit - 1,000,000
//        sequels - 5
//        countries - 50
//
//        genre - Detective
//        page length - 350
//        profit - 700,000
//        sequels - 3
//        countries - 45
//
//        genre - Science Fiction
//        page length - 720
//        profit - 900,500
//        sequels - 4
//        countries - 30
//
//        genre - Short Story
//        page length - 150
//        profit - 300,000
//        sequels - 1
//        countries - 40

        Scanner input = new Scanner(System.in);
        System.out.println("Enter genre name");
        String name = input.nextLine();

       int pageLength =0;
       double profit =0;
       int sequels = 0;
       int countries =0;

       switch (name){
           case"Fantasy":
               pageLength =500;
               profit =1000000;
               sequels = 5;
               countries =50;
               break;
           case"Dedective":
               pageLength =350;
               profit = 700000;
               sequels = 3;
               countries = 45;
               break;
           case"Science Fiction":
               pageLength =720;
               profit =900500;
               sequels = 4;
               countries =30;
               break;
           case"Short Story":
               pageLength =150;
               profit =300000;
               sequels = 1;
               countries =40;
               break;
           default:
               System.out.println("Invalid name");
       }
        System.out.println("Name : " + name + " Page length : " + pageLength + " Profit : " + profit + " Sequels : " + sequels
        + " Countries " + countries);

    }
}
