package day36_methods_with_return;

public class Calculator {
    public static void main (String [] args){

        System.out.println(add(35.6, 7));
        double result =  add(3,6);
        System.out.println("result = " + result);
        System.out.println("100.0 + 200.0 = " + add(100, 200));

        System.out.println(mines(10, 9));
        System.out.println(multiply(23, 7));
        System.out.println(divide(32, 15));

        add(3,8);

    }

    public static double add(double num1, double num2){
        double sum = num1 + num2;
        return sum;
    }
    public static double mines(double num1, double num2){
        double sum = num1 - num2;
        return sum;
    }
    public static double multiply(double num1 , double num2){
        double sum = num1 * num2;
        return sum;
    }
    public static double divide(double num1 , double num2){
        double sum = num1 / num2;
        return sum;
    }
}
