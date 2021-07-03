package mypractice;



import java.util.*;

public class Study1 {

    public static void main(String[] args) {

        int[] nums = {3, 3, 5, 988, 2, 65, 8, 1008,432, 50, 455, 300, 106};
        System.out.println(a(nums));
    }

    public static int a(int [] array ) {

        int s = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[i] > array[j]) {

                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;

                }
            }
        }
        return array[1];
    }
}
