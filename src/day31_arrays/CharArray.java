package day31_arrays;

import java.util.Arrays;

public class CharArray {
    public static void main(String[] args) {

//        char array with following values:
//        'j', 'a', 'v', 'a', ' ', 'i', 's', 'f', 'u', 'n'

        char[] character = {'j', 'a', 'v', 'a', ' ', 'i', 's', ' ', 'f', 'u', 'n'};

        for(int i = 0; i< character.length; i++){
            System.out.print(character[i] + ", ");
        }
        System.out.println();
        for(char each : character){
            System.out.print(each + ", ");
        }

        // CONVERT CHAR INTO STRING ARRAY
        String sentence = new String(character);
        System.out.println("\nsentence = " + sentence);   //sentence = java is fun


        // CONVERT STRING INTO CHAR ARRAY

        String item = "git";
        char [] itemarray = item.toCharArray();
        System.out.println("itemArray.length = " + itemarray.length);
        System.out.println("item.length() = " + item.length());

        System.out.println(Arrays.toString(itemarray));   // [g, i, t]

                        //     0          1         2      3         4          5
        String [] fruits = {"bananas", "apples", "kiwi", "mango", "papaya", "strawberry"};

        String fruitStr = "";
        for(String each : fruits){
            fruitStr += each + "-";
            System.out.print(each + " - ");
        }
        System.out.print("\n" + fruitStr);

        System.out.println();

        String [] language = {"java", "payton", "c++", "sql", "ruby", "javascript"};

        System.out.println(String.join("|", language));  // java|payton|c++|sql|ruby|javascript
        System.out.println(String.join("##", language));  // java##payton##c++##sql##ruby##javascript

        String joinedLanguages = String.join("<>", language);
        System.out.println(joinedLanguages);                //  java<>payton<>c++<>sql<>ruby<>javascript

    }
}
