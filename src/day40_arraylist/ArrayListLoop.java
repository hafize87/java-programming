package day40_arraylist;
import java.util.*;
public class ArrayListLoop {
    public static void main(String[] args) {


        List<Integer> nums = new ArrayList<>();  // polymorphic way of declaring

        System.out.println(nums);  // []  icinde hic bisey omadigi icin bos kutu veriyo

        System.out.println("size = " + nums.size());  // size = 0

        nums.add(34); nums.add(344); nums.add(3); nums.add(88);
        nums.add(500); nums.add(5); nums.add(98); nums.add(0);

        System.out.println("size = " + nums.size());    // size = 8
        System.out.println("nums = " + nums);   // nums = [34, 344, 3, 88, 500, 5, 98, 0]

        nums.remove(0);
        System.out.println("nums = " + nums);  //  nums = [344, 3, 88, 500, 5, 98, 0]

      //  nums.remove(88);  --> index 88 --> IndexOutOfBoundsException

        nums.remove(new Integer(88));  // removes number 88. not 88th index
        System.out.println("nums = " + nums);    // nums = [344, 3, 500, 5, 98, 0]

        nums.remove(new Integer(5));
        System.out.println("nums = " + nums);  //   nums = [344, 3, 500, 98, 0]

        // for loop  -- iterate though all values and print

        for (int i = 0; i < nums.size(); i++) {
            System.out.println(nums.get(i));
        }


        // for each loop print same line

        for(int each : nums){    // we can write (Integer each : nums)
            System.out.print(each + " ");
        }
    }
}
