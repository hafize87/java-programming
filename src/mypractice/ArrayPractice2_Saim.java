package mypractice;

import java.util.Arrays;
import java.util.Random;

public class ArrayPractice2_Saim {
    public static void main(String[] args) {

//        Given an array with values: 1,2,-3,4,-34,55,78,90,33,10
//
//            -Take our all the even numbers from the array and put them into a new array. Print the new array
//
//            -Take our all the odd numbers from the array and put them into a new array. Print the new array

//        int [] nums = {1,2,-3,4,-34,55,78,90,33,10};
//
//        String evenNums = "";
//        String oddNums = "";
//
//        for(int each : nums){
//            if(each % 2 == 0){
//                evenNums += each + " ";
//            }
//            else{
//                oddNums += each + " ";
//            }
//        }
//        System.out.println(evenNums);
//        System.out.println(oddNums);
//
//        String [] evenArray = evenNums.split(" ");
//        System.out.println(Arrays.toString(evenArray));
//
//        String [] oddsArray = oddNums.split(" ");
//        System.out.println(Arrays.toString(oddsArray));


        // ------------------------------------------------------------------------------------------------

//
//        Grade book ( Similar to Max Min Price from class)
//
//        Declare three arrays:
//        1.String array which will hold names for the students (give values)
//        2.Int array which has the score of the student got in the quiz (give values)
//        3.Char array which will have some letter grade based on the score (empty)
//        4.Output the grade book at the end with all the information
//
//          Grade scale:
//        Above 85: A
//        Above 75: B
//        Above 65: C
//        Other: D

        String [] studentsArray = {"ayse", "fatma", "hayriye", "pakize"};
        int [] scoreArray = {85, 75, 65, 50};
        char [] letterArray = new char [scoreArray.length] ;

        int score = 0;
        String student = "";



        for(int i = 0; i < scoreArray.length; i++){
            if(scoreArray[i] <= 100 && scoreArray[i] >= 85){
                score = scoreArray[i];
                student = studentsArray[i];
                letterArray[i] = 'A';
                System.out.println(student + " " + score + ": " + letterArray[i]);
            }
            if(scoreArray[i] <= 84 && scoreArray[i] >= 75){
                score = scoreArray[i];
                student = studentsArray[i];
                letterArray[i] = 'B';
                System.out.println(student + " " + score + ": " + letterArray[i]);
            }
            if(scoreArray[i] <= 74 && scoreArray[i] >= 65){
                score = scoreArray[i];
                student = studentsArray[i];
                letterArray[i] = 'C';
                System.out.println(student + " " + score + ": " + letterArray[i]);
            }
            if(scoreArray[i] <= 64 && scoreArray[i] >= 0){
                score = scoreArray[i];
                student = studentsArray[i];
                letterArray[i] = 'D';
                System.out.println(student + " " + score + ": " + letterArray[i]);
            }
       }


        // ---------------------------------------------------------------------------------


//        Grade book Example
//
//        Example:
//        Names = [“Mike”, “Joe”, “Ana”, “Ali”, “Joanna”]
//        Scores = [80, 54, 100, 66, 94]
//        Grades=[‘B’, ‘D’, ‘A’, ‘C’, ‘A’]    -> Need to find and store these based on score
//
//                  Output:
//              Mike |80 | B
//              Joe|54|D
//              Ana | 100 | A
//              Ali|66 | C
//              Joanna | 94 | A

//        String [] studentsArray = {"Mike", "Joe", "Ana", "Ali", "Joanna"};
//        int [] scoreArray = {80, 54, 100, 66, 94};
//        char [] letterArray = {'B', 'D', 'A', 'C', 'A'};
//
//        int score = 0;
//        String student = "";
//        char letter = ' ';
//
//
//        for(int i = 0; i < scoreArray.length; i++){
//            if(scoreArray[i] <= 100 && scoreArray[i] >= 81){
//                score = scoreArray[i];
//                student = studentsArray[i];
//                letterArray[i] = 'A';
//                System.out.println(student + " | " + score + " | " + letterArray[i]);
//            }
//            if(scoreArray[i] <= 80 && scoreArray[i] >= 67){
//                score = scoreArray[i];
//                student = studentsArray[i];
//                letterArray[i] = 'B';
//                System.out.println(student + " | " + score + " | " + letterArray[i]);
//            }
//            if(scoreArray[i] <= 66 && scoreArray[i] >= 55){
//                score = scoreArray[i];
//                student = studentsArray[i];
//                letterArray[i] = 'C';
//                System.out.println(student + " | " + score + " | " + letterArray[i]);
//            }
//            if(scoreArray[i] <= 54 && scoreArray[i] >= 0){
//                score = scoreArray[i];
//                student = studentsArray[i];
//                letterArray[i] = 'D';
//                System.out.println(student + " | " + score + " | " + letterArray[i]);
//            }
//        }


        // ------------------------------------------------------------------------------------------

//        Multiple Words
//
//        Given a String of words that are separate by commas. Find and print any words that have more than one word
//
//          Example

//        Input: "knife, wooden spoons, plates, cups, forks, pan, pot, trash can, fridge, dish washer”

//                "Output:
//                "wooden spoons"
//                "trash can"
//                "dish washer


//        String [] words = {"knife", "wooden spoons", "plates", "cups", "forks", "pan", "pot", "trash can", "fridge", "dish washer"};
//
//        System.out.println(Arrays.toString(words));
//
//        for(String each: words){
//            if(each.contains(" ")){
//                System.out.println(each);
//            }
//        }


        // -------------------------------------------------------------------------------------------


//        [IQ] Longest Palindrome
//
//        Given a String array. Find the longest Palindrome String in your array.
//
//        Ex:
//        Input: [“java”, “longer word”, “civic” “apple”,  “racecar”, “mom”, “anna”]
//        Output: racecar
//
//          Ex:
//          Input: [“abc”, “dna”, “kevin”, “joe”, “lamp”]
//          Output:
//          No palindrome

        // String[] words = {"java", "longer word", "civic", "apple", "racecar", "mom", "anna"};
//        String[] words = {"abc", "longer word", "apple", "dna"};
//
//         String rev = "";
//        for(int i = 0; i < words.length; i++){
//            String reverse = "";
//            for(int j = words[i].length()-1; j >=0; j--){
//                reverse += words[i].charAt(j);
//            }
//            if(words[i].equals(reverse)){
//                rev += words[i] + " ";
//            }
//
//        }
//
//        String[] arrayReverse = rev.trim().split(" ");
//        String  longest = arrayReverse[0];
//
//        for (String each: arrayReverse) {
//            if(each.length() > longest.length()){
//                longest = each;
//            }
//        }
//
//        if(rev.isEmpty()){
//            System.out.println("No palindrome");
//        }
//        else{
//            System.out.println(longest);
//        }


        // -----------------------------------------------------------------------------------

//        [IQ] Second Biggest Number
//
//        Given an Array of numbers. Find and print the 2nd biggest number.
//        Note the 2nd biggest should be unique meaning it should be different from the max number
//
//        Example:
//
//        Input:[4,3,1,4,5,2,4,8,4,8]
//        Output:5

//        int [] nums = {4,3,1,4,5,2,4,8,8,8};
//        Arrays.sort(nums);
//
//       for(int i = nums.length-1; i>0; i--){
//           if(nums.length-1 != nums[i]){
//               System.out.println(nums[i]);
//            break;
//
//           }
//       }


        // ------------------------------------------------------------------------

//        Reverse Each word
//
//        Given a String,reverse each individual word and print the result
//        Hint: Use a nested loop, split
//
//        Input:  It started to snow in Chicago
//        Output: tI detrats ot wons ni ogacihC

        String sentence = "It started to snow in Chicago";
        String[] arraySentence = sentence.split(" ");

        String reverse = "";
        for (int i = 0; i<arraySentence.length; i++){
                // reverse = "";  ----> eger icine atacaksak oluyo
            for (int j = arraySentence[i].length()-1; j>=0; j--){
                reverse += arraySentence[i].charAt(j);
            }
            reverse += " " ;
          //  arraySentence[i]= reverse;   ---> icine atiyorum
        }
        System.out.println(reverse);


        // --------------------------------------------------------------------------------


//        Challenge: Random Array
//
//    1)Ask the user to enter how many numbers they want in their array
//    2)Ask the user the max number they want for the random numbers –Use this as the bound for your random number
//    3)Create an int array with random numbers. The number of elements is based on the given number
//
//        Flow:How many numbers do you want: 5
//        What is the max number value: 50
//
//    -> Print the array with 5 random numbers from 0 to 50


        int [] nums = new int[5];
        Random random = new Random();

         for (int i = 0; i <nums.length ; i++) {
                nums[i] = random.nextInt(51);
            }

        System.out.println(Arrays.toString(nums));


    }
}