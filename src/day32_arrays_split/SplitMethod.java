package day32_arrays_split;
import java.util.Arrays;
public class SplitMethod {
    public static void main(String[] args) {

        String words = "java:python:selenium:html";
        String [] wordsArray = words.split(":");
        System.out.println(Arrays.toString(wordsArray));
        System.out.println("length of array " + wordsArray.length);

        for(String each : wordsArray){
            System.out.println(each);
        }

        String sentence = "today i am coding java arrays";
        String [] sentenceArray = sentence.split(" ");
        System.out.println("first word: " + sentenceArray[0]);   // first word: today
        System.out.println("first word: " + sentence.split(" ")[0]);  // first word: today
        System.out.println(Arrays.toString(sentenceArray));
        System.out.println(sentenceArray.length);   // 6

        for(int i = 0; i < sentenceArray.length; i++){
            System.out.println("index of: " + i + " letter: " + sentenceArray[i]);     // index of: 0 letter: today
                                                                                        // index of: 1 letter: i
                                                                                        // index of: 2 letter: am
                                                                                        //  index of: 3 letter: coding
                                                                                        // index of: 4 letter: java
                                                                                        //  index of: 5 letter: arrays

        }

    }
}
