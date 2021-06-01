package mypractice;
import day38_methods.ArrayUtils;

import java.util.*;

public class Study1 {

    public static void main(String[] args) {


        System.out.println(reverseNoSpec("Ab,c,de!$"));
    }

    public static String reverseNoSpec(String str) {

        // your code here


        String rev = "";


        for (int i = 0; i < str.length(); i++) {

            if (Character.isLetter(str.charAt(i))) {
                for (int j = str.length() - 1; j >= 0; i++) {

                }
            }
        }

//        String empty = "";
//        for(int i =str.length()-1; i>= 0; i++){
//            if(Character.isLetter(str.charAt(i))){
//
//                empty += str.charAt(i);
//                  if(i == str.length()-1 || !Character.isLetter(str.charAt(i+1))){
//                      empty += " ";
//                  }
//
//            }
//            else{
//                empty += str.charAt(i);
//                if(i == str.length()-1 || Character.isLetter(str.charAt(i+1))){
//                    empty += " ";
//                }
//            }
//        }
         return null;
    }
}
