package day40_arraylist;
import java.util.*;
public class ArrayListExample {
    public static void main(String[] args) {

        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(5);
        nums.add(7);
        nums.add(11);
      //  nums.add("java")  ERROR
        String str = "56";
        nums.add(Integer.valueOf(str));

        System.out.println("size = " + nums.size());  // 3     bize kac tane oldugunu veriyo.

        // reading from arraylist
        System.out.println("index 0 = " + nums.get(0));  // 5
        System.out.println("index 1 = " + nums.get(1));   // 7
        System.out.println("index 2 = " + nums.get(2));  // 11
       //System.out.println("index 3 = " + nums.get(3));   //  IndexOutOfBoundsException   index 3 u yazmadik oyuzden cikiyor

        // print all value in same line

        System.out.println(nums);    // [5, 7, 11]


        // remove the number

        nums.remove(1);  // remove element at index 1

        System.out.println(nums);  // [5, 11]




    }
}
