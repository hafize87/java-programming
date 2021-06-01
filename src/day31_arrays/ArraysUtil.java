package day31_arrays;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.SortedMap;

public class ArraysUtil {
    public static void main(String[] args) {

        int [] nums = {100, 5, 1, 7, 0, -4, 44, 33};

       // print all nums in same line
        System.out.println(Arrays.toString(nums));  // [100, 5, 1, 7, 0, -4, 44, 33]

        //System.out.println(Arrays.sort(nums));  // direk print edemiyorsun

        //  sort nums
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));    // [-4, 0, 1, 5, 7, 33, 44, 100]

        System.out.println("min value: " + nums[0]);   // min value: -4
        System.out.println("max value: " + nums[nums.length-1]);   // max value: 100


      //  Arrays.sort(nums, Collections.reverseOrder());

        String [] words = {"Java", "C#", "C++", "Kotlin", "Python", "Ruby", "Assembly"};

        System.out.println(Arrays.toString(words));
        System.out.println("[" + String.join(", " , words) + "]");

        //
        Arrays.sort(words);
        System.out.println(Arrays.toString(words));     // [Assembly, C#, C++, Java, Kotlin, Python, Ruby]


        Arrays.sort(words, Collections.reverseOrder());

        System.out.println(Arrays.toString(words));   // [Ruby, Python, Kotlin, Java, C++, C#, Assembly]

    }
}
