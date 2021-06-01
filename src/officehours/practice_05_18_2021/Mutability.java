package officehours.practice_05_18_2021;

import java.util.Arrays;

public class Mutability {
    public static void main(String[] args) {

        String one = "java";
        String two = one;
        String three = two.toUpperCase();
        System.out.println(three);

        System.out.println(two.toUpperCase() == three);

        one = one.substring(2);
        System.out.println(one);
        System.out.println(two);


        String a = new String("anything");
        String b = a;

        b = b.toUpperCase();
        System.out.println("a " + a);
        System.out.println("b " + b);

        int [] arr = {1,2,3};
        int [] arr2 = arr;
        arr2[0] = 100;
        arr[1] = 200;
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr2));


        String word1="java";
        String word2="java";//It doesn't create a new instance
        //In this example, only one object will be created. Firstly, JVM will not find any string object with the value "java" in the string pool, that is why it will create a new object. After that it will find the string with the value "java" in the pool, it will not create a new object but will return the reference to the same instance.

        String another = new String("ABC");

        String other = another;
        System.out.println(another == other);
    }
}
