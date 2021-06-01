package day11_comparison_operators;

public class BooleanComparisonOperators {
    public static void main(String[] args) {
        System.out.println(10==10);   // true
        System.out.println(1000 > 100); // true
        System.out.println(985.44 < 98547.8); // true
        System.out.println(10 <= 9);  // false
        System.out.println(5 >= 3);  // true
        System.out.println(-100 != 44);   // true

        int a = 100;
        int b = 200;
        System.out.println(a == b);  //  false
        System.out.println(a > b);      // false
        System.out.println(a < b);      //true
        System.out.println(a >= b);     // false
        System.out.println(a <= b);     // true
        System.out.println(a != b);     // true

        boolean result;
        result = 5 == 5;
        System.out.println("result = " + result);  // true

        result = 33 > 44;
        System.out.println("result = " + result);  // false

        result = 88 < 99;
        System.out.println("result = " + result);   // false

        result = 10 >= 10;
        System.out.println("result = " + result);  //true

        result = 2 != 2;
        System.out.println("result = " + result);      // false

        String city = "Tucson";
        System.out.println(city == "Tucson");  // true
        System.out.println(city == "Baku");  // false
        System.out.println(city != "Arizona");  // true
        
        String name = "Nadir";
         boolean checkName = name == "Nadir";
        System.out.println("checkName = " + checkName);  // true
        
        checkName = name != "Kuzzat";  // false
        System.out.println("checkName = " + checkName);   // true

        int f = 10/0;
        System.out.println(10/0);

        
        
        



    }
}
