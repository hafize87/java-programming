package day14_multi_branch_if_statements;

import java.util.Scanner;

public class MultiBranchIfStatement {
    public static void main(String[] args) {
//
//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter day name");
//        String day = input.next();
//
//        if(day.equals("Monday")){
//            System.out.println("Monday");
//        }
//        else if (day.equals("Tuesday")){
//            System.out.println("Tuesday");
//        }
//        else if (day.equals("Wednesday")){
//            System.out.println("Wednesday");
//        }
//        else{
//            System.out.println("Java day");
//        }

        // 1. Way
//            int day = 1;
//            if(day == 1){
//                System.out.println("Monday");
//            }
//            else {
//                System.out.println("Not Monday");
//            }
//

        // 2.way
        int day = 6;
        if(day == 1){
            System.out.println("Monday");
        }
        else if(day == 2){
            System.out.println("Tuesday");
        }
        else if(day == 3){
            System.out.println("Wednesday");
        }
        else{
            System.out.println("Java day");
        }
    }
}
