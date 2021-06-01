package officehours.Practice_03_08_2021;

import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {

        // PIC : package --> import --> class

//        Make a class Rectangle create a main method
//    Declare two variables: length and width
//                - Calculate the Perimeter 2(l*w)
//                - Calculate the Area (w * l)
// - Print properties of the Rectangle
// - Modify to accept Scanner inputs

        Scanner scan = new Scanner (System.in);
        System.out.println("Enter length and width");
        double length = scan.nextDouble();
        double width = scan.nextDouble();
        System.out.println("Perimeter : " + 2 * (length + width));
        System.out.println("Area : " + length * width);

    }
}
