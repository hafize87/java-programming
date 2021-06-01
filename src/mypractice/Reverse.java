package mypractice;

import day41_arraylist.ArraysAsList;

import java.util.*;

public class Reverse {

    public static void main(String[] args) {

        String name = "Hafize";

        String reverseName = "";

        for (int i = name.length()-1; i>=0  ; i--) {

            reverseName += name.charAt(i);
        }

        System.out.println(reverseName);

        // 2 way

        name = "ihsan";

        List<String> rev = new ArrayList<>(Arrays.asList(name.split("")));

        Collections.reverse(rev);

        String result =  String.join("", rev);

        System.out.println(result);
    }
}
