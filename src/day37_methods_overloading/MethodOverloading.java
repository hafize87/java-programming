package day37_methods_overloading;

public class MethodOverloading {
    public static void main(String[] args) {

        MethodOverloading.sum(10,5);

        sum(1.6, 3.9);
        sum(10, 10.5);
        sum(4,15,7);

        sum((int)1.6, 5, 7);
        sum("hello", "world");

    }



    public static void sum(int num1, int num2){

        System.out.println("sum(int, int)");
        System.out.println("result = " + (num1 + num2));
    }
    public static void sum(double num1, double num2){

        System.out.println("sum(double, double");
        System.out.println("result = " + (num1 + num2));
    }
    public static void sum(int num1, int num2, int num3){

        System.out.println("sum(int , int , int");
        System.out.println("result = " + (num1 + num2 + num3));
    }
    public static void sum(String word1, String word2){

        System.out.println("sum(String, String");
        System.out.println("result = " + (word1 + word2));
    }
}
