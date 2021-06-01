package mypractice;

import java.util.Scanner;

public class SubstringMiddleCharacter {
    public static void main(String[] args) {


        String word = "Hafiz";

        int position;
        int length;

        if(word.length() % 2 != 0){
            if(word.length() >= 3){

                position = word.length() / 2;
                length = 1;
                System.out.println(word.substring(position, position + length));

            }else if(word.length() == 1){
                System.out.print(word + "" + word + word);

            }

        }
        else {
            if(word.length() >= 4){
                //            6 / 2 - 1   = 2
                position = word.length() / 2 - 1;
                length = 2;
                                            //      2     ,     2  +  2 = 4
                System.out.println(word.substring(position, position + length));
            }
            else if(word.length() == 2){
                System.out.println(word + "" + word);
            }
        }


    }
}

