package day10_shorthand_operators;

import java.util.Scanner;

public class NextLineBug {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter rent and month");

        double rent = input.nextDouble();
        input.nextLine();   // fix the bug. WORK-AROUND   // nextLine dan once int double yada baska datatype kullansanda
                                // oncesinde input.netLine(); diye bosluk birakmak gerekiyor.
        String  month = input.nextLine();

        System.out.println("Rent: " + rent);
        System.out.println("Month: " + month);
    }
}
