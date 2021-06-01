package day13_conditional_statements;

import java.util.Scanner;

public class NiceDayOrNot {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter temperatures");
        int inputTemp = input.nextInt();
        int temp =72;

        if(inputTemp >= temp){
            System.out.println("Is a beautiful day");
            System.out.println("Lets code java");
        }
        else{
            System.out.println("It is kind of cold today");
            System.out.println("Stay home and code java");
        }
    }
}
