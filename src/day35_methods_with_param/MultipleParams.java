package day35_methods_with_param;
import java.util.Scanner;
public class MultipleParams {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("enter 2 doubles");
        double d1 = input.nextDouble();
        double d2 = input.nextDouble();

       showSum(d1, d2);
       showSum(5.6, 7.5);
       showSum(9,44);

    }

    public static void showSum(double num1, double num2){
        double sum = num1 + num2;
        System.out.println(sum);
    }
}
