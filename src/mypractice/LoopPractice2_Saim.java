package mypractice;

import java.util.Random;
import java.util.Scanner;

public class LoopPractice2_Saim {
    public static void main(String[] args) {

//        [IQ] PalindromeA word that is the same read forwards and backwards.
//        User takes a word from the console. Print true if the word is a palindrome.
//                Print false if the word is not palindrome.
//
//          -> input: civic->
//                output: true
//          -> input: java->
//                output: false

//        Scanner input = new Scanner (System.in);
//        System.out.println("Enter name");
//        String name = input.next();
//
//        String reverse = "";
//        for(int i = name.length()-1; i >= 0; i--){
//                reverse += name.charAt(i);
//        }
//       if(name.equalsIgnoreCase(reverse)){
//           System.out.println("palindrome");
//       }
//       else{
//           System.out.println("not palindrome");
//       }


        //---------------------------------------------------------------------------------------

//        Count upper, lower, and numbers
//
//        Given a String, find and print how many uppercase letter,
//        lowercase letter, and number are in the String.
//                Ex:
//           Input: 2juMp41EEkd4s4
//           Output:
//             3 uppercase letters
//             6 lowercase letters
//             5 numbers

//        String word = "2juMp'=41EEkd4s4!";
//        int upperCaseCount = 0;
//        int lowerCaseCount = 0;
//        int numberCount = 0;
//        int otherCount = 0;
//
//        for(int i = 0; i<word.length(); i++){
//           if (word.charAt(i) >= 'a' && word.charAt(i) <= 'z'){
//               lowerCaseCount++;
//           }
//           if(word.charAt(i) >= 'A' && word.charAt(i) <= 'Z'){
//               upperCaseCount++;
//           }
//           if(word.charAt(i) >= '0' && word.charAt(i) <= '9'){
//               numberCount++;
//           }
//           if(!(word.charAt(i) >= 'a' && word.charAt(i) <= 'z') && !(word.charAt(i) >= 'A' && word.charAt(i) <= 'Z')
//           && !(word.charAt(i) >= '0' && word.charAt(i) <= '9')){
//               otherCount++;
//           }
//
//        }
//        System.out.println(lowerCaseCount);
//        System.out.println(upperCaseCount);
//        System.out.println(numberCount);
//        System.out.println(otherCount);


        //------------------------------------------------------------------------

//        Biggest substring of matching characters
//
//        Given a String find the biggest substring of chars that match and print it.
//
//         Ex: aaabbbcccccddddee
//        Output: ccccc
//
//        String word = "abbccc";
//        String biggest = "";
//        int count = 0;
//        for (int i = 0; i < word.length(); i++) {
//
//            count = 0;
//            for (int j = 0; j < word.length(); j++) {
//
//                if (word.charAt(i) == word.charAt(j)) {
//                    biggest += word.charAt(j);
//                    count++;
//                }
//
//
//            }
//            if (biggest.length() > count) {
//                biggest = "";
//
//            }
//
//
//        }
//
//        System.out.println(biggest);


        //--------------------------------------------------------------------------------------

//        CHALLENGE–THIS WILL MAY BE DIFFICULT BUT TRY IT. DON’T SPEND TOO MUCH TIME
//
//        Generate a random number that is six digits long.
//        Each digit in this number should be unique, meaning the number 6 digit number should have 6 different character numbers
//        that make it up. Print the number.
//
//        HINTS: Loops, Strings, Random

//
//        Random random = new Random();
//        String unique = "";
//
//        for(int i = 0; i < 6; i++){
//            int num = random.nextInt(10);
//
//            //String num = index + "";
//
//            if(!unique.contains(num+ "")){
//                unique += num;
//            }
//            else{
//                i--;
//            }
//        }
//        System.out.println(unique);


//        Random random = new Random();
//        String uniqe = "";
//
//        while(uniqe.length() < 6){
//           int number = random.nextInt(10);
//           if(!uniqe.contains(number + "")){
//               uniqe += number;
//           }
//        }
//        System.out.println(uniqe);

    }

}


