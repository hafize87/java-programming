package day21_string_manipulation;

public class FirstAndLastTest {
    public static void main(String[] args) {

        String word = "mom";
        char first = word.charAt(0);
        char last = word.charAt(2);

        if(first == last){
            System.out.println("Fist and last letters match");
        }
        else{
            System.out.println("Fist and last letter is not match");
        }

        if(word.charAt(0) == word.charAt(2)){
            System.out.println("Fist and last letters match");
        }
        else{
            System.out.println("Fist and last letters is not match");
        }



        String name = "Hafize";
        char fistLetter = name.charAt(0);
        // 1. way

        //int count = otherWord.length();
        //char lastLetter = otherWord.charAt(count-1);

         //  2. way
        char lastLetter = name.charAt(name.length()-1);

        System.out.println(fistLetter);
        System.out.println(lastLetter);

        if(fistLetter == lastLetter){
            System.out.println("Fist and last letters match");
        }
        else {
            System.out.println("Fist and last letters are not match");
        }



    }
}
