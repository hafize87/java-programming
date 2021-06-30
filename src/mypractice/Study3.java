package mypractice;
import java.util.*;


public class Study3 {
    public static void main(String[] args) {

        String str = "tomorrow";

           combine(str);
    }
    public static void combine(String str) {

        String a = "";

        int count = 0;

        for (int i = 0; i < str.length(); i = a.length()) {

            a += str.charAt(i);

         count++;

            for (int j = 0 ; j < count; j++) {

                a += "$";
            }
        }

        System.out.println(a);
    }


}