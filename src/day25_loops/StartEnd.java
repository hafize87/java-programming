package day25_loops;

import java.util.Scanner;

public class StartEnd {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter start end number");
        int start = input.nextInt();
        int end = input.nextInt();

        if(start > end){
            System.out.println("reverse numbering is not supporting");
        }

        for(int i = start; i<=end; i++){
            System.out.print(i + " ");
        }

    }
}
