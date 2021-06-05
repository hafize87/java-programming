package mypractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class InterviewQuestions {
    public static void main(String[] args) {

//        String -- Same letters

     //   Write a return method that check if a string is build out of the same letters as another string.

     //   Ex:  same("abc",  "cab"); -> true

     //   same("abc",  "abb"); -> false:


      // 1. way solution
//        String str1 = "abcabc";
//        String str2 = "cbaabc";
//        boolean b = true;
//
//        if(str1.length() == str2.length()) {
//
//            for (int i = 0; i < str1.length(); i++) {
//                if (!str2.contains(str1.charAt(i) + "")) {
//                    b = false;
//                    break;
//                }
//            }
//        }
//        else{
//
//            b = false;
//        }
//
//
//        System.out.println(b);






     //  2. way solution

//        String str1 = "abc";
//        String str2 = "cba";
//        char [] letter1 = str1.toCharArray();
//        char [] letter2 = str2.toCharArray();
//
//        Arrays.sort(letter1);
//        Arrays.sort(letter2);
//
//        boolean b = false;
//        if(Arrays.equals(letter1,letter2)) {
//            b = true;
//        }
//        System.out.println(b);


        //-----------------------------------------------------------------------------------

//        String -- Frequency of Characters

//        Write a return method that can find the frequency of characters
//
//        Ex:  ("AAABBCDD") ==> A3B2C1D2

//        String str = "AAABBCDD";
//        int count = 0;
//        String character = "";
//        for(int i = 0; i<str.length(); i++){
//            count = 0;
//            for(int j = 0; j<str.length(); j++){
//               if(str.charAt(i) == str.charAt(j)){
//                   count++;
//               }
//            }
//            if(!character.contains(str.charAt(i)+"")){
//                character += "" + str.charAt(i) + count;
//            }
//        }
//        System.out.println(character);


        //---------------------------------------------------------------------------------

//        String -- Remove Duplicates

//        Write a return method that can remove the duplicated values from String
//
//        Ex:  removeDup("AAABBBCCC")  ==> ABC

        // 1. way solution

//        String str = "AAABBBCCC";
//
//        String duplicate = "";
//
//        for(int i = 0; i < str.length(); i++){
//            if(!duplicate.contains(str.charAt(i)+"")){
//                duplicate += str.charAt(i);
//            }
//        }
//        System.out.println(duplicate);

       // 2. way solution

//        String str = "ABBBCCCDZFggkyyyt";
//        int count = 0;
//        String duplicate = "";
//
//        for(int i = 0; i<str.length(); i++){
//            count = 0;
//            for(int j = 0; j < str.length(); j++){
//                if(str.charAt(i) == str.charAt(j)){
//                    count ++;
//                }
//
//            }
//            if(count > 1 && (!duplicate.contains(str.charAt(i)+""))){
//                duplicate += str.charAt(i);
//            }
//        }
//
//        System.out.println(duplicate);

      // ---------------------------------------------------------------------------------

//        String -- Find the unique

//        Write a return  method that can find the unique characters from the String
//
//        Ex:  unique("AAABBBCCCDEF")  ==>  "DEF";

        // 1. way solution

//        String str = "AAABBBCCDEF";
//
//        String unique = "";

//        for(int i = 0; i<str.length(); i++){
//            if(str.indexOf(str.charAt(i)) == str.lastIndexOf(str.charAt(i))){
//                unique += str.charAt(i);
//            }
//        }
//        System.out.println(unique);

        // 2. way solution

//        for(int i = 0; i<str.length();i++){
//            int count = 0;
//            for(int j = 0; j<str.length(); j++){
//                if(str.charAt(i) == str.charAt(j)){
//                 count++;
//                }
//            }
//            if(count == 1){
//                unique += str.charAt(i);
//            }
//
//        }
//        System.out.println(unique);


      //---------------------------------------------------------------------

//      String -- Reverse
//
//        Write a return method that can reverse  String
//
//        Ex: Reverse("ABCD"); ==> DCBA

//        String name = "ABCD";
//
//        String reverse ="";
//
//        for(int i = name.length()-1; i>=0; i--){
//            reverse += name.charAt(i);
//        }
//        System.out.println(reverse);

     // ---------------------------------------------------------------------

//        String -- Sort Letters and Numbers from alphanumeric String
//
//        Given alphanumeric String, we need to split the string into substrings of consecutive letters or numbers,
//        sort the individual string and append them back together
//
//        Ex:
//
//        Input:  "DC501GCCCA098911"
//
//        OutPut: "CD015ACCCG011899"

        String str = "DC501GCCCA098911";

        String str2 = "";

        for(int i = 0; i < str.length(); i++) {

            if(Character.isLetter(str.charAt(i))){
                str2 += str.charAt(i);
                if(i == str.length()-1 || Character.isDigit(str.charAt(i + 1))){
                    str2 += ",";
                }

            }
            if(Character.isDigit(str.charAt(i))){
                str2 += str.charAt(i);
                if(i == str.length()-1 || Character.isLetter(str.charAt(i + 1))){
                    str2 += ",";
                }
            }
        }
        System.out.println(str2);

        String [] letters = str2.split(",");

        System.out.println(Arrays.toString(letters));

        String sortLetter = "";

        for(String each : letters){

            char [] eachLetter =  each.toCharArray();

            Arrays.sort(eachLetter);

            for (char each1: eachLetter){

                sortLetter += each1;
            }
        }

        System.out.println(sortLetter);



        // 2. way



//        String [] array = str2.split(",");
//
//        str = "";
//
//        for (int i = 0; i< array.length; i++) {
//
//            String [] ch = array[i].split("");
//            Arrays.sort(ch);
//            array [i] = String.join("", ch);
//        }
//
//        System.out.println(Arrays.toString(array));
//     str = String.join("", array);
//        System.out.println(str);


        // ------------------------------------------------------------------------

//        String -- Password Validation Task
//
//        1. Write a return method that can verify if a password is valid or not.
//
//        requirements:
//
//        1. Password MUST be at least have 6 characters and should not contain space
//
//        2. PassWord should at least contain one upper case letter
//
//        3. PassWord should at least contain one lowercase letter
//
//        4. Password should at least contain one special characters
//
//        5. Password should at least contain a digit
//
//        if all requirements above are met, the method returns true, otherwise returns  false



//        String password = "hFdgth1";
//
//        if(password.length() >= 6 && !password.contains(" ")){
//
//            int upperCase = 0;
//            int lowerCase =0;
//            int number = 0;
//            int special =0;
//
//            for (int i = 0; i < password.length(); i++) {
//                if(password.charAt(i) >= 'A' && password.charAt(i) <= 'Z'){
//                    upperCase++;
//                }
//                else if (password.charAt(i) >= 'a' && password.charAt(i) <= 'z') {
//                    lowerCase++;
//                }
//                else if (password.charAt(i) >= '0' && password.charAt(i) <= '9') {
//                    number++;
//                }
//                else{
//                    special++;
//                }
//            }
//
//
//            if(upperCase >= 1) {
//
//                if (lowerCase >= 1) {
//
//                    if(number >= 1){
//
//                        if(special >=1){
//
//                            System.out.println("Correct password");
//                        }
//
//                        else{
//                            System.out.println("NOT correct password you need special character");
//                        }
//                    }
//                    else{
//                        System.out.println("NOT correct password you need number");
//                    }
//
//                }
//                else{
//                    System.out.println("NOT correct password you need lower case");
//                }
//
//            }
//            else{
//                System.out.println("NOT correct password you need upper case");
//            }
//
//        }
//
//        else{
//            System.out.println("NOT correct password at least 6 character or no space");
//        }

    }
}
