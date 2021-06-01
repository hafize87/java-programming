package day10_shorthand_operators;

import java.util.Scanner;

public class ChangeVariableValue {
    public static void main(String[] args) {
        int count = 3;
        System.out.println("count = " + count);

        // add / increase count by 2
        count = count + 2;
        System.out.println("count = " + count);
        
        int apple = 2;
        System.out.println("apple = " + apple);
        apple = apple + 10;
        System.out.println("apple = " + apple);
        apple =apple - 3;
        System.out.println("apple = " + apple);
        
        int pizzaSlice = 8;
        System.out.println("pizzaSlice = " + pizzaSlice);
        pizzaSlice = pizzaSlice / 2 ;
        System.out.println("pizzaSlice = " + pizzaSlice);
        // get another whole small pizza just for you - 6
        
        pizzaSlice = pizzaSlice + 6;
        System.out.println("pizzaSlice = " + pizzaSlice);

        int players = 10;
        System.out.println("players = " + players);
        players = players * 2;
        System.out.println("players = " + players);

        int cents = 244;
        System.out.println("cents = " + cents);
        cents = cents % 100;
        System.out.println("Remaining cents = " + cents);




    }
}
