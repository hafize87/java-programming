package mypractice;

import java.util.*;

public class InterviewQuestions {
    // public static void main(String[] args) {

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


    // 2 way

//        String name = "Ihsan";
//
//        List<String> reverse = new ArrayList<>(Arrays.asList(name.split("")));
//
//        Collections.reverse(reverse);
//
//        System.out.println(String.join("", reverse));


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

//        String str = "DC501GCCCA098911";
//
//        String str2 = "";
//
//        for(int i = 0; i < str.length(); i++) {
//
//            if(Character.isLetter(str.charAt(i))){
//                str2 += str.charAt(i);
//                if(i == str.length()-1 || Character.isDigit(str.charAt(i + 1))){
//                    str2 += ",";
//                }
//
//            }
//            if(Character.isDigit(str.charAt(i))){
//                str2 += str.charAt(i);
//                if(i == str.length()-1 || Character.isLetter(str.charAt(i + 1))){
//                    str2 += ",";
//                }
//            }
//        }
//        System.out.println(str2);
//
//        String [] letters = str2.split(",");
//
//        System.out.println(Arrays.toString(letters));
//
//        String sortLetter = "";
//
//        for(String each : letters){
//
//            char [] eachLetter =  each.toCharArray();
//
//            Arrays.sort(eachLetter);
//
//            for (char each1: eachLetter){
//
//                sortLetter += each1;
//            }
//        }
//
//        System.out.println(sortLetter);


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


    //----------------------------------------------------------

//        String -- sum of digits in a string
//
//        Write a method that can return the sum of the digits in a string

//        String str = "I got 3 apples, 5 kiwis, 6 oranges";
//
//       //  1. way
//        List<String> list =new ArrayList<>();
//
//
//
//        for (int i = 0; i < str.length(); i++) {
//
//            if(Character.isDigit(str.charAt(i))){
//
//                list.add(str.charAt(i)+"");
//            }
//
//        }
//        System.out.println(list);
//
//        int result = 0;
//        for (String each : list){
//
//            result += Integer.parseInt(each);
//        }
//        System.out.println(result);

    // 2 way

//        int result = 0;
//        for (int i = 0; i < str.length(); i++) {
//
//            if(Character.isDigit(str.charAt(i))){
//                result += Integer.parseInt(str.charAt(i)+"");
//            }
//
//        }
//        System.out.println(result);

    // 3 way

//        int result = 0;
//       char [] arrays = str.toCharArray();
//
//
//       for(char each : arrays){
//
//           if(Character.isDigit(each)){
//
//               result += Integer.parseInt(each +"");
//           }
//
//       }
//        System.out.println(result);


    // --------------------------------------------------------------------------------------


//        Array -- Find Maximum
//        Write a method that can find the maximum number from an int Array

//
//        int [] arrays = {3, 50, 7, 45};
//
//        // 1 way
//        Arrays.sort(arrays);
//        System.out.println(arrays[arrays.length-1]);
//
//        // 2 way
//
//        List <Integer> list = new ArrayList<>();
//
//        for (int each : arrays){
//
//            list.add(each);
//        }
//
//        System.out.println(Collections.max(list));


    // 3 way
//        int max = arrays[0];
//
//        for (int each : arrays){
//
//            if(each > max){
//                max = each;
//            }
//
//        }
//
//        System.out.println(max);

//     }

    // --------------------------------------------------------------

    //  Array -- Sort Ascending

    // Write a return method that can sort an int array in Ascending order without using the sort method of the Arrays class

//    public static void main(String[] args) {
//
//
//        System.out.println(Arrays.toString(sort(new int[]{3, 1, 5, 8, 2})));
//
//    }
//
//    public static int[] sort(int[] arrays){

    // 1 way

//        Arrays.sort(arrays);
//
//        return arrays;

    // 2 way

//        for(int i = 0; i<arrays.length; i++){
//
//            for (int j = 0; j<arrays.length;  j++) {
//
//                if(arrays[i] < arrays[j]) {
//
//                    int temp = arrays[i];
//                    arrays[i] = arrays[j];
//                    arrays[j] = temp;
//                }
//            }
//        }
//            return arrays;


    // 3 way

//       List<Integer> num = new ArrayList<>();
//
//        for (int i = 0; i < arrays.length; i++) {
//
//           num.add(arrays[i]);
//        }
//
//        for (int i = 0; i < arrays.length; i++) {
//
//            arrays[i] = (Collections.min(num));
//            num.remove(Collections.min(num));
//
//        }
//
//        return arrays;
//    }


    // --------------------------------------------------------------

    //  Array -- Sort Descending

    // Write a return method that can sort an int array in descending order without using the sort method of the Arrays class

//    public static void main(String[] args) {
//
//
//        System.out.println(Arrays.toString(sort(new int[]{3, 1, 5, 8, 2})));
//
//    }
//
//    public static int[] sort(int[] arrays) {


        // 1 way

//        for(int i = 0; i<arrays.length; i++){
//
//            for (int j = 0; j<arrays.length;  j++) {
//
//                if(arrays[i] > arrays[j]) {
//
//                    int temp = arrays[i];
//                    arrays[i] = arrays[j];
//                    arrays[j] = temp;
//                }
//            }
//        }
//            return arrays;


        // 2 way
//
//        List<Integer> num = new ArrayList<>();
//
//        for (int i = 0; i < arrays.length; i++) {
//
//            num.add(arrays[i]);
//        }
//
//        for (int i = 0; i < arrays.length; i++) {
//
//            arrays[i] = (Collections.max(num));
//            num.remove(Collections.max(num));
//
//        }
//
//        return arrays;

        //  3 way
//
//        Arrays.sort(arrays);
//
//        for (int i =0; i<arrays.length/2 ; i++) {
//
//            int temp = arrays[i];
//            arrays[i] = arrays[arrays.length-1-i];
//            arrays[arrays.length-1-i] = temp;
//
//        }
//
//        return arrays;
//    }

        //  3 way
//
//        Arrays.sort(arrays);
//
//        int [] descending = new int[arrays.length];
//
//        for (int i = arrays.length-1, j = 0; i >= 0; i--, j++) {
//
//            descending[j] = arrays[i];
//        }
//
//
//        return descending;

//    }


//    public static void main(String[] args) {
//
//        System.out.println(Arrays.toString(moveZero(new int[]{1, 0, 2, 0, 3, 0, 4, 0})));
//
//    }
//
//    public static int[] moveZero(int[] array){

//      List <Integer > numbers = new ArrayList<>();
//
//
//        for(int i = 0; i < array.length; i++){
//
//
//
//            if(array[i] == 0 ){
//
//                numbers.add(numbers.size()-1);
//
//            }
////        }
////        System.out.println(Arrays.toString(array));
////
////        for(int i = 0; i < array.length; i++) {
////            for (int j = 0; j < array.length; j++) {
////
////                if(array[i] != 0 && array[i] < array[j]){
////                    int temp = array[i];
////                    array[i] = array[j];
////                    array[j] = temp;
////                }
////            }
////        }
//        return array;
//
//    }
//
    }