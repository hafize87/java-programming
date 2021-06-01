package mypractice;

import java.util.Arrays;

public class Same_Letters {
    public static void main(String[] args) {

     // 1. yol
        String word1 = "bca";
        String word2 = "cab";

        String [] arr1 = word1.split(""); // --> arr1: ["b", "c", "a"]
        String [] arr2 = word2.split(""); // --> arr2: ["c", "a", "b"]

        Arrays.sort(arr1); // --> arr1: ["a", "b", "c"]
        Arrays.sort(arr2); // --> arr1: ["a", "b", "c"]

        System.out.println(Arrays.equals(arr1,arr2));

        //---------------------------------------------------//

      // 2. yol
        String word3 = "bca";
        String word4 = "cab";

        char [] word3Arr = word3.toCharArray(); // ---> [b, c, a]
        char [] word4Arr = word4.toCharArray(); // ---> [c, a, b]

        Arrays.sort(word3Arr); // [a, b, c]
        Arrays.sort(word4Arr); // [a, b, c]

        System.out.println(Arrays.equals(word3Arr,word4Arr));


        // -------------------------------------------------------//

      //3. yol

        String str1 = "abcabc";
        String str2 = "cbaabc";
        boolean b = true;

        if(str1.length() == str2.length()) {

            for (int i = 0; i < str1.length(); i++) {
                if (!str2.contains(str1.charAt(i) + "")) {
                    b = false;
                    break;
                }
            }
        }
        else{

            b = false;
        }


        System.out.println(b);


        // -------------------------------------------------------------//

     // 4. yol


        String one = "abc";
        String two = "oiu";

        boolean letter = true;

            if(one.length() != two.length()) {
                letter = false;
            }
            else{

            one = one.toLowerCase();
            two = two.toLowerCase();

            int [] count = new int[26];

            // listen -> l + 1, i + 1, s + 1
            // silent -> s - 1, i - 1, etc

            // a -> 0, b = 1, c = 2
            // z -> 25

            for (int i=0; i < one.length(); i++) {

                char letterFromOne = one.charAt(i); // b -> 98 - 97 = 1
                char letterFromTwo = two.charAt(i);

                count[letterFromOne - 97] = count[letterFromOne - 97] + 1;
                count[letterFromTwo - 97] = count[letterFromTwo - 97] - 1;

                // System.out.println(Arrays.toString(count));
            }

        System.out.println(Arrays.equals(count, new int[26]));
    }

    }
}
