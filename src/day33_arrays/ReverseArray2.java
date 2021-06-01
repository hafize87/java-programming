package day33_arrays;

import java.util.Arrays;

public class ReverseArray2 {
    public static void main(String[] args) {

//        int num1 = 10;
//        int num2 = 30;
//        System.out.println("num1 = " + num1);
//        System.out.println("num2 = " + num2);
//
//        // swap those using addition variable
//
//        int temp = num1;
//        num1 = num2;
//        num2= temp;
//
//        System.out.println("num1 = " + num1);
//        System.out.println("num2 = " + num2);

        //---------------------------------------------------------
        // 1. way

        int[] nums = {5, 10, 4, 100};
        System.out.println("before " + Arrays.toString(nums));

        for(int i = 0 ; i < nums.length/2; i++){
            int temp = nums[i];
            nums[i] = nums[nums.length-1-i];
            nums[nums.length-1-i] = temp;
        }
        System.out.println("after " + Arrays.toString(nums));



        // 1 and last number swap

//        int[] nums = {5, 10, 4, 100};
//        System.out.println(Arrays.toString(nums));
//         int temp = nums [0];
//         nums[0] = nums [3];
//         nums[3] = temp;
//        System.out.println(Arrays.toString(nums));


        // String reverse 1 way

//        String [] words = {"java", "html", "js", "ruby", "css" };
//        System.out.println(Arrays.toString(words));
//
//        for(int i = 0; i < words.length/2; i++ ){
//
//            String temp = words[i];
//            words [i] = words[words.length-1-i];
//            words[words.length-1-i] = temp;
//
//        }
//        System.out.println(Arrays.toString(words));



        String [] words = {"java", "html", "js", "ruby", "css" };
        System.out.println("before reverse = " + Arrays.toString(words));

        for(int i = 0, j = words.length-1; i < words.length/2; i++, j-- ){
            String temp = words[i];
            words[i] = words[j];
            words[j] = temp;
        }
        System.out.println("after reverse = " + Arrays.toString(words));
    }
}
