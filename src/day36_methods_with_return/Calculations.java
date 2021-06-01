package day36_methods_with_return;

public class Calculations {
    public static void main(String[] args) {
        System.out.println("add 10 + 45 = " + Calculator.add(10, 45));

        System.out.println("100 - 40 = " + Calculator.mines(100, 40));

        System.out.println("55 / 4 = " + Calculator.divide(55, 4));

        System.out.println("50 x 10 = " + Calculator.multiply(50, 10));

        double d1 = 234.5;
        double d2 = 234.5;
        double result = Calculator.add(d1, d2);
        System.out.println(result);
       //   System.out.println(Calculator.add(d1, d2));  --- > direk boylede olur. diger turlude.
    }
}
