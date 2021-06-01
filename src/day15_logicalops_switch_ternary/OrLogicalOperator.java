package day15_logicalops_switch_ternary;

public class OrLogicalOperator {
    public static void main(String[] args) {
        System.out.println("true || true = " + (true||true));           // true
        System.out.println("true || true = " + (true||false));          // true
        System.out.println("true || true = " + (false||true));          // true
        System.out.println("true || true = " + (false||false));         // false

        int apples = 5;
        int orange = 7;
        System.out.println(apples > 3 || orange > 4);     // true

        if(apples > 3 || orange > 4){
            System.out.println("NO need to buy any fruits today");
        }
        else {
            System.out.println("We should buy");
        }
                            //true          //false
        System.out.println(apples > 2 || orange > 10);    // true
        System.out.println(apples > 2 && orange > 10);      // false


        if(apples > 2 || orange > 10){
            System.out.println("NO need to buy any fruits today");
        }
        else {
            System.out.println("We should buy");
        }

        System.out.println(apples == 0 || orange == 0);     // false

        if(apples == 0 || orange == 0){
            System.out.println("NO need to buy any fruits today");
        }
        else {
            System.out.println("We should buy");
        }

    }
}
