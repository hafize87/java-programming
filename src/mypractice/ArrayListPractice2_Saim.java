package mypractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListPractice2_Saim {
    //public static void main(String[] args) {

//        Separate Parts
//
//        Write a program that can extract the special characters, digits and letters from a string and
//        stores them into separate ArrayLists of Characters
//
//    Ex: str = "ABCD123$%#@&456EFG!"
//    list1: {$, %, #, @, &, !}
//    list2: {A, B, C, D, E, F, G}
//    list3: {1, 2, 3, 4, 5, 6}

//        String str = "ABCD123$%#@&456EFG!";
//
//        List<Character> letter = new ArrayList<>();
//        List<Character> number = new ArrayList<>();
//        List<Character> other = new ArrayList<>();
//
//        for(int i = 0; i<str.length(); i++){
//            if(Character.isLetter(str.charAt(i))){
//                letter.add(str.charAt(i));
//            }
//            else if(Character.isDigit(str.charAt(i))){
//                number.add(str.charAt(i));
//            }
//            else{
//                other.add(str.charAt(i));
//            }
//        }
//        System.out.println(letter);
//        System.out.println(number);
//        System.out.println(other);

    //----------------------------------------------------------------


//        Get Uppercase or Lowercase
//
//        The method will accept a String and a boolean.
//                -If the given boolean is true, then extract all the uppercase letters and return them in an ArrayList.
//                -If the given boolean is false, then extract all the lowercase letters and return them in an ArrayList
//      @param str -Given String
//      @param isUpper-Given boolean
//      @return -ArrayList of Strings


//    public static void main(String[] args) {
//
//        System.out.println(uppercaseOrLowercase("TavnhtTIOAEFrtDSliP", false));
//    }
//
//    public static ArrayList<String> uppercaseOrLowercase(String str, boolean bl){
//
//        ArrayList <String> word = new ArrayList<>();
//
//        if(bl){
//            for (int i = 0; i<str.length(); i++){
//                if(Character.isUpperCase(str.charAt(i))){
//                    word.add(str.charAt(i) + "");
//                }
//            }
//        }
//        else{
//            for (int i = 0; i<str.length(); i++){
//                if(Character.isLowerCase(str.charAt(i))){
//                    word.add(str.charAt(i) + "");
//                }
//            }
//        }
//        return word;
//
//    }
//}


    // -------------------------------------------------------------

//    Remove Long Strings
//
//    This method will accept an ArrayList of Strings and an int. Remove any String elements that have less characters
//    than the given number.
//    Return the modified ArrayList of Strings
//        @param list -Given ArrayList of Strings
//        @param int -max number of characters
//        @return -ArrayList of Strings

//    Ex: {“one,”, “two”, “three, “four”, “five”, “six”}
//    Max number: 4
//    Output: {“three, “four”, “five”}

//    public static void main(String[] args) {
//
//        System.out.println(removeLongString(Arrays.asList("one", "two", "three", "four", "five", "six"), 4));
//
//    }
//
//    public static ArrayList<String> removeLongString(List<String> str , int num){
//
//        ArrayList <String> word = new ArrayList<>();
//
//        for(String each:str){
//            if(each.length() >= num){
//                word.add(each);
//            }
//        }
//
//        return word;
//
//    }
//}


            // ------------------------------------------------------------


//    Remove Duplicates
//
//    This method will take an ArrayList of numbers and remove any duplicates values.
//    The method will return an ArrayList of unique elements.
//
//       @param nums - The given ArrayList of numbers
//       @return - ArrayList of numbers
//
//    Ex:
//    Input: {1, 3, 5, 1, 4, 5, 9};
//    Output: {3, 4, 9};



//    public static void main(String[] args) {
//
//        System.out.println(removeDuplicate(Arrays.asList(1, 3, 5, 1, 4, 5, 9)));
//
//    }
//
//    public static ArrayList<Integer> removeDuplicate(List<Integer> nums){
//
//        ArrayList <Integer> duplicate = new ArrayList<>();

       // 1 way solution
//        for(Integer each : nums){
//            if(Collections.frequency(nums, each) == 1){
//                duplicate.add(each);
//            }
//        }

        // 2. way solution

//        int count = 0;
//
//        for(int i = 0; i<nums.size(); i++){
//            count = 0;
//            for(int j = 0; j<nums.size(); j++){
//
//                if(nums.get(i) == nums.get(j)){
//                    count++;
//                }
//            }
//            if(count == 1){
//                duplicate.add(nums.get(i));
//            }
//        }
//        return duplicate;
//    }
//}

        // --------------------------------------------------------------


//    Remove Bad Pairs
//
//    This method will accept an Integer ArrayList and check for bad pairs.
//    A pair is an element and the element next to it.
//    A bad pair is whenever the first number in the pair is bigger then the second number.
//    Remove any bad pairs for the ArrayList and return theArrayList with no bad pairs
//
//    Note: The given ArrayList will always be an even amount of numbers so each number always has one pair
//
//    @param nums - Given ArrayList of numbers
//    @return -ArrayList of numbers

//    Ex: Input: {3, 4, 6, 1, 1, 10, 8, 7};
//    Output: {3, 4, 1, 10};
//    Bad pairs that were removed:
//            6 , 1
//            8 , 7

//        public static void main(String[] args) {
//
//            System.out.println(badPair(Arrays.asList(3, 4, 6, 1, 1, 10, 8, 7)));
//
//        }
//
//        public static ArrayList<Integer> badPair(List<Integer> nums){
//
//            ArrayList <Integer> pair = new ArrayList<>();
//
//            if(nums.size() % 2 == 0){
//
//                for(int i = 0; i<nums.size(); i+=2){
//                    if(nums.get(i) < nums.get(i + 1)){
//                        pair.add(nums.get(i));
//                        pair.add(nums.get(i+1));
//                    }
//
//                }
//            }
//            else{
//                System.out.println("ArrayList has to be an even amount of numbers ");
//            }
//
//            return pair;
//
//        }
//    }


        // --------------------------------------------------------------


//    Switch Pairs
//
//    This method will take an ArrayList of words and switch position for each pair in the List.
//    A pair is an element and the element next to it.
//    The given ArrayList will always have an even number of elements so each elementwill always have a single pair.
//
//        @param words -Given ArrayList of Strings
//        @return -ArrayList of Strings
//
//    Ex:Input: {"Cat", "in", "the", "hat"}
//    There is two pairs: "Cat" and "in""the" and "hat"
//
//    Output: {"in", "Cat", "hat", "the}

//    public static void main(String[] args) {
//        System.out.println(switchPairs(Arrays.asList("Cat", "in", "the", "hat")));
//
//    }
//
//    public static ArrayList<String> switchPairs(List<String> str){
//
//        ArrayList <String> pairs = new ArrayList<>();
//
//        if(str.size() % 2 == 0){
//
//            for(int i = 0; i<str.size(); i+=2){
//                pairs.add(str.get(i+1));
//                pairs.add(str.get(i));
//            }
//
//        }
//        else{
//            System.out.println("ArrayList has to have an even number of elements ");
//        }
//
//
//        return pairs;
//
//    }
//}


    // -------------------------------------------------------------------

//    Reverse All
//
//    This method will take an ArrayList of Strings and reverse each element and return an ArrayList of all reversed words
//
//        @param words -Given ArrayList of Strings
//        @return -ArrayList of Strings
//
//    Ex:Input: {"ted", "talk", "learn"}
//    Output: {"det", "klat", "nrael"}


//    public static void main(String[] args) {
//
//
//        System.out.println(reverseAll(Arrays.asList("ted", "talk", "learn")));
//
//    }
//
//    public static ArrayList<String> reverseAll(List<String> str){
//
//        ArrayList <String> reverse = new ArrayList<>();
//
//
//        String letter = "";
//        for (String each : str) {
//
//            for (int j = each.length()-1; j>=0; j--){
//                letter += each.charAt(j);
//            }
//            reverse.add(letter);
//            letter = "";
//
//        }
//
//        return reverse;
//
//    }
//}


        // ------------------------------------------------------------


//    Holidays
//
//    Create a method that accept an ArrayList of Strings. The String elements will be Holidays
//    Create a method that will accept a number and return an ArrayList of Strings.
//    This number will represent a month number. The String elements returned will be all the holidays in the given month.
//
//        Note: If a invalid month number is given as a parameter (not between 1 and 12) then return null
//    See the next page for month number and holiday data (This is just a sample based on federal holidays. You can add other ones if you want)
//
//    Holidays -Data
//    1: New Years day, Martin Luther King, Jr.
//    Day2: President’s
//    Day5: Memorial
//    Day6: Independence
//    Day9: Labor
//    Day10: Columbus
//    Day11: Veterans Day, Thanksgiving
//    Day12: Christmas Day

//     3, 4, 7, 8: None

//    public static void main(String[] args) {
//
//
//        System.out.println(holidays(5));
//
//    }
//
//    public static ArrayList<String> holidays(int number) {
//
//        ArrayList<String> holiday = new ArrayList<>();
//
//
//        switch (number) {
//            case 1:
//                holiday.add("New Years day");
//                holiday.add("Martin Luther King");
//                holiday.add("Jr. Day");
//                return holiday;
//            case 2:
//                holiday.add("President’s Day");
//                return holiday;
//            case 5:
//                holiday.add("Memorial Day");
//                return holiday;
//            case 6:
//                holiday.add("Independence Day");
//                return holiday;
//            case 9:
//                holiday.add("Labor Day");
//                return holiday;
//            case 10:
//                holiday.add("Columbus Day");
//                return holiday;
//            case 11:
//                holiday.add("Veterans Day");
//                holiday.add("Thanksgiving Day");
//                return holiday;
//            case 12:
//                holiday.add("Christmas Day");
//                return holiday;
//            default:
//                return null;
//
//        }
//
//    }
//}

        // -----------------------------------------------------------------


//    Pangram – Not ArrayList task
//
//    A Pangram is a String that contains all of the letters in the alphabet.
//    Create a methodth at will accept a String and determine if the given String is a pangram.
//    If it is a pangram return true, otherwise return false.
//
//    Example Pangrams:
//        -A quick brown fox jumps over the lazy dog.
//        -Back in June we delivered oxygen equipment of the same size.


    public static void main(String[] args) {


        System.out.println(pangram("A quick brown fox jumps over the lazy dog."));


    }

    public static boolean pangram(String str) {

        str = str.replace(" ", "").toLowerCase();

        String uniqe = "";

        for (int i = 0; i < str.length(); i++){
            if(!uniqe.contains(str.charAt(i)+"") && str.charAt(i) >= 'a' && str.charAt(i) <= 'z'){
                uniqe += str.charAt(i);
            }

        }
        return uniqe.length() >= 26;


    }
}

