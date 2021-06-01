package day42_arraylist;
import day41_arraylist.ArraysAsList;

import java.net.CookieHandler;
import java.util.*;
public class CollectionsUtil {

    public static void main(String[] args) {

        List<Character> letters = new ArrayList<>();

        letters.addAll(Arrays.asList('j','a','v','a','s','f','u','n'));

        System.out.println("size = " + letters.size());

        System.out.println(letters);

        Collections.reverse(letters);

        System.out.println("reverse = " + letters);   // reverse = [n, u, f, s, a, v, a, j]

        System.out.println(Collections.frequency(letters, 'a'));   // 2   // how many time is letter is appearance. kac kere a geciyor.

        int vCount = Collections.frequency(letters, 'v');

        System.out.println("vCount = " + vCount);

        System.out.println("Max char = " + Collections.max(letters));  // v
        System.out.println("Min char = " + Collections.min(letters));  // a

        Collections.replaceAll(letters, 'a', 'y');   //  [n, u, f, s, y, v, y, j]     a yerine y koyuyosun

        System.out.println("after replaceAll = " + letters);

        Collections.sort(letters);

        System.out.println("After sort = " + letters);


      //  ArraysAsList<Integer> nums = Arrays.asList(23, 1, 43, 5, 234, 6, -9, 0)  --> bu sekilde olmuyor as yazinca basina List yazamiz gerekiyor

       List<Integer> nums = Arrays.asList(23, 5, 1, 43, 5, 234, 6, -9, 8, 8);

        System.out.println(nums);

        Collections.reverse(nums);
        System.out.println("after reverse : " + nums);

        int max = Collections.max(nums);

        System.out.println("max number : " + max);   // max number : 234

        int min = Collections.min(nums);

        System.out.println("Min number : " + min);   // Min number : -9

        int countOfFives = Collections.frequency(nums, 5);
        System.out.println("Count of five : " + countOfFives);   // Count of five : 2

        Collections.replaceAll(nums , 5, 50);
        System.out.println("after replaceAll : " + nums);

        Collections.sort(nums , Collections.reverseOrder());
        System.out.println("after reverse sort = " + nums);

        Collections.shuffle(nums);   // random numara gibi her defasinda degisiyor

        System.out.println("After shuffle : " + nums);



    }
}
