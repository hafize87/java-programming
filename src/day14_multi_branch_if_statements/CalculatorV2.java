package day14_multi_branch_if_statements;

import java.util.Scanner;

public class CalculatorV2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System. in);
        System.out.println("Enter number 2 numbers");
        double num1 = input.nextDouble();
        double num2 = input.nextDouble();
        System.out.println("Enter operator: + , - , * , /");
        char operator = input.next().charAt(0);


        if(operator == '+'){
            System.out.println(num1 + num2);
        }
        else if(operator == '-'){
            System.out.println(num1 - num2);
        }
        else if(operator == '*'){
            System.out.println(num1*num2);
        }
        else if(operator == '/'){
            System.out.println(num1/num2);
        }
        else{
            System.out.println("Invalid operator");
        }



    }
}
