package day14_multi_branch_if_statements;

public class LogicalANDOperator {
    public static void main(String[] args) {

        System.out.println(true && true);  //true
        System.out.println(true && false);   // false
        System.out.println(false && true);     // false
        System.out.println(false && false);  // false

        System.out.println(10>5 && 1==1);  // true
        System.out.println(10==10 && 1>6);  // false
        System.out.println(3<10 && 10>89);  // false
        System.out.println(4<5 && 5>9);   //false

        int apple = 10;
        int orange = 5;
        boolean check = apple > 5 && orange>3;
        System.out.println(check);  // true

        if(apple > 6 && orange >2){
            System.out.println("i have enough apples and oranges");
        }
        else{
            System.out.println("I need to go grocery to get some fruit");
        }
    }
}
