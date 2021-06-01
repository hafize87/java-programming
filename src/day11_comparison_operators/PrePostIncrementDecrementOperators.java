package day11_comparison_operators;

public class PrePostIncrementDecrementOperators {
    public static void main(String[] args) {

        int num = 1 ;
        num++;
        ++num;
        System.out.println(num);  //3
        
        int nu = 5;
        nu--;
        --nu;
        System.out.println("num2 = " + nu); // 3
        
        //PRE - INCREMENT 
        int num1 = 10;
        int num2 = ++num1;
       
        System.out.println("num1 = " + num1); //11
        System.out.println("num2 = " + num2); //11
        
        //POST _ INCREMENT  -> add 1 afterwards
        int num3 = 8;
       // int num4 = num3;
       // num3++;
        int num4 = num3++;
        System.out.println("num3 = " + num3); // 9
        System.out.println("num4 = " + num4); // 8

        int apple = 5;
        int basket = ++apple;
        System.out.println("apple = " + apple);  //6
        System.out.println("basket = " + basket);  // 6

        int kiwi = 15;
        int kiwiBasket = kiwi++;
        System.out.println("kiwi = " + kiwi);  //16
        System.out.println("kiwiBasket = " + kiwiBasket);  // 15

        int cars = 5;
        System.out.println("cars = " + ++cars);  // 6
        int sedans = 10;
        System.out.println("sedans = " + sedans++); //10
        System.out.println("sedans = " + sedans);  //11

        int a = 50;
        int b = 22;
        int c = a++ + ++b;
        System.out.println("a = " + a);  // 51
        System.out.println("b = " + b);  // 23
        System.out.println("c = " + c);  // 73





    }
}
