package day42_arraylist;

import java.util.*;
import java.util.List;

public class MethodsWithList {
    public static void main(String[] args) {

        // declere etmek icin 1 yol uzun yol
        List<String> word = new ArrayList<>();
        word.add("java"); word.add("html"); word.add("selenium");
        word.add("a"); word.add("input"); word.add("title");

        // pass the words list to printStrList method
        printStrList(word);


        // declere etmek icin 2 yol kisa yol
        printStrList((Arrays.asList("select", "option", "br", "hr")));


        List<Integer> num = Arrays.asList(23,5,67,4);
        int sum = sumIntegerList(num);
        System.out.println(sum);


        System.out.println(sumIntegerList(Arrays.asList(2, 4, 6, 12, 44, 9)));

    }

    public static void printStrList(List<String> stringList) {

        for(String each : stringList){
            System.out.print(each + " ");
        }
        System.out.println();
    }


    public static int sumIntegerList(List<Integer> num) {

        int sum = 0;

        for(int each : num){
            sum += each;
        }
        return sum;
    }
}
