package mypractice;

public class LoopPractice3_Saim {
    public static void main(String[] args) {

//            [Book Value]
//        Given a String book with all the text of your book.
//        Figure out how much you will make from your book.

//        Each chapter you have in your book will add 10 $ value to your book.
//        Go through your book and figure out the value of the book. Ignore case sensitivity.
//            Check the next slide for the Book text you can use to test.




//        Sample Book Text
//        Java textbook By Murodil. Chapter 1 datatypes and variables. Chapter 2 conditional statements.
//        chapter 3 String manipulation. Chapter 4 Loops. Chapter 5 Arrays. Chapter 6 Methods. chapter 7 ArrayList.
//        chapter 8 instance and static. Chapter 9 Constructors. Chapter 10 Encapsulation and Inheritance.
//        Chapter 11 Abstraction and Polymorphism. Chapter 12 Exceptions. Chapter 13 Collections.
//        Chapter 14 Learn more.

//        14 Chapters -> value of the book: 140



//        String word = "Chapter";
//        int value = 0;
//
//        for (int i = 1; i<=14; i++) {
//
//            if(word.equalsIgnoreCase("chapter")){
//                value = 10*i;
//            }
//
//        }
//        System.out.println(value);



        //--------------------------------------------------------------------------------------------------

//        Reverse only second word
//        Given a String with three words separated by spaces.
//        Reverse only the second word and return the modified String
//
//        Ex:I love java
//           I evol java


//        String word = "i love java";
//        String first = word.substring(0, word.indexOf(" "));
//        System.out.println(first);
//        String secondWord = word.substring(word.indexOf(" ")+1, word.lastIndexOf(" "));
//        System.out.println(secondWord);
//        String thirt = word.substring(word.lastIndexOf(" ")+1);
//        System.out.println(thirt);
//
//        String reverse = "";
//
//        for(int i = secondWord.length()-1; i>= 0; i--){
//            reverse += secondWord.charAt(i);
//
//        }
//        System.out.println(first + " " + reverse + " " + thirt);

        //-------------------------------------------------------------------------------------------------------

//        Camel Case
//
//        Given a String of words that follow Camel Case convention. Find and print how many words are in the given String.
//        Every word, except the first word, begin with an uppercase letter.
//        The other characters of the word will be lowercase
//
//              Ex:
//              Input:thisHasManyWordsToFind
//              Output: 6
//
//        String word = "thisHasManyWordsToFind";
//        int count = 1;
//
//        for(int i = 0; i< word.length(); i++){
//
//            if(word.charAt(i) >= 'A' && word.charAt(i) <= 'Z'){
//                count++;
//            }
//        }
//        System.out.println(count);


        //------------------------------------------------------------------------------------

//        [IQ] Prime in range
//
//        Given a number. Print out all the prime numbers from 2 to
//        that number A prime number is a number that is only divisible by 1 and itself.
//
//        Ex:
//        Input:50
//        Output:2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47

//
//        int number = 50;
//
//        for(int i = 2 ; i< 50; i++){
//
//            if(i % 2 != 0 && i % 3 != 0 && i % 5 != 0 && i % 7 != 0 || i == 2 || i == 3 || i ==5 || i == 7 ){
//                System.out.print(i + ", ");
//            }
//        }


        // ----------------------------------------------------------------------------------------------

//           [IQ] Unique characters
//
//        Given a String, find and print the unique characters.
//        A character is unique if it only appears once in the String.
//
//                Ex:
//                   AAABCCDEEF
//                   Output:BDF


//        String word = "AAABCCDEEF";
//        String unique = "";
//
//        for(int i = 0; i<word.length(); i++){
//            if(word.indexOf(word.charAt(i)) == word.lastIndexOf(word.charAt(i))){
//                unique += word.charAt(i);
//            }
//        }
//        System.out.println(unique);


        // --------------------------------------------------------------------------------------------------


//           [IQ] Duplicate characters

//        Given a String, find and print the duplicate characters.
//        A character is duplicate if it appears more than once in the String.
//
//        Ex:
//                AAABCCDEEF
//        Output: ACE


//        String word = "AAABCCDEEF";
//        String duplicate = "";
//
//        for(int i = 0; i < word.length(); i++){
//
//            if(word.indexOf(word.charAt(i)) != word.lastIndexOf(word.charAt(i)) && !duplicate.contains(word.charAt(i)+ "")){
//                duplicate += word.charAt(i);
//            }
//        }
//        System.out.println(duplicate);
    }
}
