package mypractice;



import java.util.*;

public class Study1 {

    public static void main(String[] args) {


        System.out.println(a("tomorrow"));
    }

    public static String a(String s ) {

       String str =  "";
        //output = t$m$$r$$$w

        for (int i = 0; i < s.length(); i++) {
            int count = 0;
            for (int j = 0; j < s.length(); j++) {

                if (s.charAt(i) == s.charAt(j)) {
                    count++;

                }
                if (count > 1 && !str.contains(s.charAt(i)+"")) {
                    str += s.charAt(i);
                }
            }
        }

        for (int i = 0; i < str.length(); i++) {
            for (int j = 0; j < s.length(); j++) {
                if(str.charAt(i) == s.charAt(j)){

                 s =   s.replace(s.charAt(j)+"", "$");
            }

            }
        }
        return s;


    }
}
