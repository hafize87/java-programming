package mypractice;
import java.util.*;


public class Study3 {
    public static void main(String[] args) {

        String [] wordList = {"f","o","o"};
        String [] wordList1 = {"b","a","r"};
        System.out.println(combineRs(wordList, wordList1));


    }
    public static ArrayList<String> combineRs(String[] r1,String[] r2){

        // your code here

        ArrayList<String> total = new ArrayList<>();

        for(String each : r1){
            total.add(each);
        }
        for(String each : r2){
            total.add(each);
        }



             return total;

    }


}