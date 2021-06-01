package officehours.Practice_03_03_2021;

public class Stage1Calculator {
    public static void main(String[] args) {
//        - Declare two double variables
//        - Declare 5 more double variables for each operation.
//        > Execute all the operation between the first two numbers
//                - Print out operations
//        Ex: if the nums are 5 and 10
//        5 + 10 = 15
//        5 - 10 = -5


        double d1 = 5.0;
        double d2 = 10.0;
        double addition =  d1 +d2;
        double subtraction = d1 - d2;
        double multiplication = d1*d2;
        double division = d1 / d2;
        double remainder = d1 % d2;

        System.out.println("Calculation for " + d1 + " & " + d2);
        System.out.println(d1 + " + " + d2 + " = " + addition);
        System.out.println(d1 + " - " + d2 + " = " + subtraction);
        System.out.println(d1 + " * " + d2 + " = " + multiplication);
        System.out.println(d1 + " / " + d2 + " = " + division);
        System.out.println(d1 + " % " + d2 + " = " + remainder);

        // Print without variable
        System.out.println("Calculation for " + d1 + " & " + d2);
        System.out.println(d1 + " + " + d2 + " = " + (d1 + d2));
        System.out.println(d1 + " - " + d2 + " = " + (d1 - d2));
        System.out.println(d1 + " * " + d2 + " = " + (d1 * d2));
        System.out.println(d1 + " / " + d2 + " = " + (d1 / d2));
        System.out.println(d1 + " % " + d2 + " = " + (d1 % d2));
    }
}
