package day32_arrays_split;
import java.util.Arrays;
public class SentenceSplit {
    public static void main(String[] args) {

        String sentence = "java is fun";

        String [] sentenceArray = sentence.split(" ");
        System.out.println(Arrays.toString(sentenceArray));  // [java, is, fun]

        System.out.println("first word: " + sentenceArray[0]);   // first word: java
        System.out.println("second word: " + sentenceArray[1]);   // second word: is
        System.out.println("third word: " + sentenceArray[2]);   //  third word: fun
    //    System.out.println("fourth word: " + sentenceArray[3]);  // ArrayIndexOutOfBoundsException

        for(String each : sentenceArray){
            System.out.println(each);
        }

        String googleResult = "About 1,810,000 results (0.68 seconds)";
        String [] num = googleResult.split(" ");
        System.out.println(Arrays.toString(num));
        System.out.println(num[1]);   //  1,810,000
        System.out.println(num[3].replace("(", ""));


    }
}
