package day21_string_manipulation;

public class ReplacePractice {
    public static void main(String[] args) {

        String word = "github";
        System.out.println(word.toUpperCase());  // GITHUB
        System.out.println(word.replace("hub", "lab"));   // gitlab
        System.out.println("word = " + word);     // github


        word = word.replace("hub" , "lab");
        System.out.println("word = " + word);   // gitlab

        // gitlab
        //  i--> o ,  a --> i

        System.out.println(word.replace('i' , 'o').replace('a', 'i'));     // gotlib

        String sentence = "java is fun";
        String withNoSpace = sentence.replace(" ", "");
        System.out.println(withNoSpace);    // javaisfun
        //"java" --> "selenium" , "fun" --> "a lot of fun"  --> assing back to sentence

        // 1.way
        sentence = sentence.replace("java", "selenium").replace("fun", "a lot of fun");

        // 2. way
       // sentence = sentence.replace("java", "selenium");
       // sentence = sentence.replace("fun", "a lot of fun");

        System.out.println(sentence);

        String result =  "1-48 of over 4,000 results for java book";
        result = result.replace("1-48 of over " , "")
                                 .replace(" results for java book", "").replace("," ,"");

        System.out.println(result);



        int count = Integer.parseInt(result);
        count++;
        if(count > 0) {
            System.out.println("Search success");
        }

    }
}
