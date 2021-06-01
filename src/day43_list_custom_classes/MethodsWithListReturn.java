package day43_list_custom_classes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MethodsWithListReturn {
    public static void main(String[] args) {

        // 1 second = 1_000_000_000 nanoseconds
        long start = System.nanoTime();  // get starting time
        //1. way
        List<Integer> mlnNums = getIntegerList();   //  returns ready ArrayList object. no need new Arraylist....
        long end = System.nanoTime();  // ending time
        double listsecond = (end - start) / 1_000_000_000.0;
        System.out.println("arrayList time = " + (end - start));  // print duration
        System.out.println("ArrayList seconds = " + listsecond);
        System.out.println(mlnNums);

        // 2 way
        System.out.println(getIntegerList());


        long st = System.nanoTime();
        int [] arr = getArray();
        long en = System.nanoTime();
        double second = (en - st) / 1_000_000_000.0;
        System.out.println("Array time = " + (end - start));
        System.out.println("Array time second = " + second);


       // System.out.println(Arrays.toString(getArray()));

    }


    public static List<Integer> getIntegerList (){

        List<Integer> nums = new ArrayList<>();

        for(int i = 0; i<=1000_000; i++){
            nums.add(i);
        }
        return nums;
    }

    public static int [] getArray (){

        /**
         * getIntegerArray
         * No params
         * return int[]
         *    Loop from 0 - 1000_000
         *    and add to int[] then return it
         */

        // declare empty array with size 1-1000001

        int[] array = new int[1000001];

        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }
        return array;
    }


}
