package day14_multi_branch_if_statements;

import java.util.Scanner;

public class YesOrNo {
    public static void main(String[] args) {

        // print are you want to delete this file
//        Scanner input = new Scanner(System.in);
//        System.out.println("are you want to delete this file? Type 'y' or 'n' ");
//        char file = input.next().charAt(0);
//
//        if(file == 'y'){
//            System.out.println("Your file will be deleted");
//        }
//        else if(file == 'n') {
//            System.out.println("File deletion cancelled");
//        }
//        else{
//            System.out.println("Enter 'n' or 'y'");
//        }


        System.out.println("Are you want to delete this file?");
        char selection = 'y';
        boolean answer;
        String result ;

        if(selection == 'y'){
            System.out.println("Your file will be deleted");
            answer = true;
            result = "deleted";
        }
        else{
            System.out.println("File deletion cancelled");
            answer = false;
            result = "no deleted";
        }
        System.out.println("Did file get deleted? - " + answer);
        System.out.println("Did file get deleted? - " + result);
    }
}
