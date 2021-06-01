package mypractice;

import day41_arraylist.ArraysAsList;


import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListPractice_Saim {
    public static void main(String[] args) {

        //  Four or less
//
//        Given an ArrayList of Strings, go through and read only Strings that are 4 characters or less.
//        Take those Strings and put them into a different ArrayList
//
//         Ex: Input: “apples”, “tree”, “loop, “cat”, “animal”, “shortcut”
//
//        Output:[tree, loop, cat]


//
//        List<String> str = new ArrayList<>(Arrays.asList("apples", "tree", "loop", "cat", "animal", "shortcut"));
//        List<String> array = new ArrayList<>();
//
//        for (int i = 0; i<str.size(); i++){
//            if(str.get(i).length()  <= 4){
//                array.add(str.get(i));
//            }
//        }
//        System.out.println(array);

        // ----------------------------------------------------------------------------


//        Hide Password
//
//        Given an array of passwords (String). Hide each password as a star (*) and show the hidden password.
//
//        Ex:Input:{"one", "hi", "hold"};
//
//           Output: [ ***, **, **** ]

//        String [] str = {"one", "hi", "hold"};
//
//        List<String> array = new ArrayList<>();
//
//        String star = "";
//
//        for(String each : str){
//
//            for(int j = 0; j < each.length(); j++){
//            star += "*";
//
//            }
//            array.add(star);
//            star = "";
//        }
//
//        System.out.println(array);

        // ----------------------------------------------------------------------------------

//        Target word
//
//        Given an ArrayList of Strings and a target word (String) print how many times the target word is in the ArrayList
//
//     Ex:
//        Input:”java”, ”html”, “css”,“java”, “javascript”, “selenium”
//        Target:java
//        Output:2

//        List<String> list = new ArrayList<>(Arrays.asList("java", "html", "css","java", "javascript", "selenium"));
//
//        String target = "java";
//        int count = 0;
//
//        for(String each : list){
//
//            if(each.equals("java")){
//                    count++;
//
//            }
//        }
//        System.out.println(count);


        // ----------------------------------------------------------------------

//        Count Letters (Similar to Target word, but different layer)
//
//        Given an ArrayList of Strings and a letter (char) print how many times the letter is found in the ArrayList elements
//
//        Ex:
//            Input:”java”, ”html”, “css”, “java”, “javascript”, “selenium”
//            letter: ‘a’
//            Output:6

//        List<String> list = new ArrayList<>(Arrays.asList("java", "html", "css","java", "javascript", "selenium"));
//
//        char target = 'a';
//        int count = 0;
//
//        for(String each : list){
//
//            for(int i = 0; i < each.length(); i++){
//                if(each.charAt(i) == target){
//                    count++;
//                }
//            }
//        }
//        System.out.println(count);


        // --------------------------------------------------------------------

//        String numbers to sum
//
//        Given an ArrayList of numbers in String format, add each digit of each element and store into a different ArrayList.
//
//        Ex:
//        Input: “123”,“34”,“513”
//        Output:[ 6, 7, 9 ]

        List<String> list = new ArrayList<>(Arrays.asList("123","34","513"));
        List<Integer> nums = new ArrayList<>();


        int sum = 0;

        for(String each : list){

            for (int i = 0; i < each.length(); i++) {

                if (Character.isDigit(each.charAt(i))){
                    sum += Integer.parseInt(each.charAt(i)+"");
                }

            }
            nums.add(sum);
            sum = 0;
        }
        System.out.println(nums);

        // --------------------------------------------------------------------

        //        String broke = "I borrow 53 dollar from Angela, 37 dollar from my Anton and 2305 dollars from richi rich Nuriddin";
//        int brokeSuleymanNowHave =0;
//
//        return how much money Suleyman  got?

        String broke = "I 53 , 37 d 2305 d";

        int brokeSuleymanNowHave =0;



//        int sum = 0;
//        String  num = "";
//        for(int i = 0; i<broke.length(); i++){
//            if(Character.isDigit(broke.charAt(i))) {
//                num += broke.charAt(i);
//
//                if (i == broke.length() - 1 || !Character.isDigit(broke.charAt(i + 1))) {
//                    sum += Integer.parseInt(num);
//                    num = "";
//                }
//            }
//        }
//        System.out.println(sum);



//        String num = "0";
//        int sum = 0;
//
//        for (int i = 0; i < broke.length(); i++) {
//
//
//            if(Character.isDigit(broke.charAt(i))){
//                num += broke.charAt(i);
//            }
//            else{
//                sum += Integer.parseInt(num);
//                num = "0";
//            }
//        }
//        System.out.println(sum);


        // ---------------------------------------------------------------------


//        public static void main(String[] args) {
//
//            diff21("12 geldim 2 gi 454 y 9");
//            num("12 ali, 4 veli, 50 zeki");
//            sum("ali 12, 4 veli, 50 zeki");
//        }
//
//        public static void diff21(String a) {
//
//            String num = "";
//
//            for(int i = 0; i<a.length(); i++){
//                if(Character.isDigit(a.charAt(i))){
//                    num += a.charAt(i) ;
//                }
//                else{
//                    if(i == a.length()-1 || !Character.isDigit(a.charAt(i+1))){
//                        continue;
//                    }else{
//                        num += ", ";
//                    }
//
//                }
//            }
//            System.out.println(num.substring(1).trim());
//
//        }
//
//        public static void num(String str){
//
//            // "12 ali, 4 veli, 50 zeki"
//
//            String num = "";
//
//            for(int i = 0; i< str.length(); i++){
//                if(Character.isDigit(str.charAt(i))){
//                    num += str.charAt(i);
//
//                }
//                else{
//                    if(i == str.length()-1 || Character.isDigit(str.charAt(i + 1))){
//                        num += ",";
//                    }
//                }
//            }
//            System.out.println(num.substring(0, num.length()-1));
//        }
//
//
//        public static void sum(String str){
//            // "ali 12, 4 veli, 50 zeki"
//
//            String num = "0";
//            int sum = 0;
//            for(int i = 0; i<str.length(); i++){
//                if(Character.isDigit(str.charAt(i))){
//                    num += str.charAt(i);
//                }
//                else{
//                    sum += Integer.parseInt(num);
//                    num = "0";
//                }
//
//            }
//            System.out.println(sum);
//

        }

}
