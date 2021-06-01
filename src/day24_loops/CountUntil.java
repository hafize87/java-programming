package day24_loops;
import java.util.Scanner;
public class CountUntil {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter number to start until: ");
        int numberToStop = input.nextInt();

        int start = 1;

        while (start <= numberToStop){
            System.out.print(start + " ");
            start++;
        }


    }
}
