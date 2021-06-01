package day33_arrays;

import java.util.Arrays;

public class SplitReview {
    public static void main(String[] args) {

        String word =  "java";
        String [] array = word.split("a");
        System.out.println(array.length);     // 2

        int countOfA = array.length-1;
        if(word.endsWith("a")){
            countOfA++;
        }
        System.out.println("countOfA = " + countOfA);


        System.out.println("------- Split with empty String ---");

        String [] strArray = word.split("");
        System.out.println(strArray[0]);
        System.out.println(strArray[1]);
        System.out.println(strArray[2]);
        System.out.println(strArray[3]);

        // regular expression "\\d" ==> number

        String word1 = "java1sql2html";
        String [] wordArray = word1.split("\\d");
        System.out.println(Arrays.toString(wordArray));    //[java, sql, html]

        word1 = word1.replaceAll("\\d","_");
        System.out.println(word1);

        String password = "bcTd123_5";
        if(password.matches("^.*(?=.{8,})(?=..*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^_&+=]).*$")) {
            System.out.println("Valid password");
        } else {
            System.out.println("Invalid password");
        }



    }
}
