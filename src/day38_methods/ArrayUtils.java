package day38_methods;

import java.util.Arrays;

public class ArrayUtils {

    public static void printArray(int[] nums){

        for(int each: nums){
            System.out.println(each + " ");
        }
        System.out.println(Arrays.toString(nums));

    }


    public static int sum(int[] nums){
        int sum = 0;
        for (int each: nums){
           sum+= each;
        }
        return sum;
    }


    public static boolean contains(int[] nums, int num){

        // 1. way
//        for(int each: nums){
//            if(num == each){
//                return true;
//            }
//        }
//        return false;

        // 2. way
        boolean found = false;
        for(int each : nums) {
            if(each == num) {
                found = true;
                break;
            }
        }
        return found;
    }

}
