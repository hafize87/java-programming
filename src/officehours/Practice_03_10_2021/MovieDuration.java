package officehours.Practice_03_10_2021;

import java.util.Scanner;

public class MovieDuration {
    public static void main(String[] args) {
//        The length of the movie will determine how much it costs.
//                Use a Scanner object to read the input from the user for how long the movie is and print
//        out how much the movie will cost.
//                The length will be given as a decimal as hours.minutes
//                > 1.0 - 8.99
//                > 1.5 - 10.50
//                > 2.0 - 12.99
//                > 2.5 - 14.50
//            -> 3 or more - 15.99

        Scanner input = new Scanner(System.in);
        System.out.println("Enter movie length");
        double movieLength = input.nextDouble();


        if(movieLength == 1){
            System.out.println("Prince: " + 8.99);
        }
        if(movieLength == 1.5){
            System.out.println("Prince: " + 10.50);
        }
        if(movieLength == 2.0){
            System.out.println("Prince: " + 12.99);
        }
        if(movieLength == 2.5){
            System.out.println("Prince: " + 14.50);
        }
        if(movieLength >= 3.0){
            System.out.println("Prince: " + 15.99);
        }


    }
}
