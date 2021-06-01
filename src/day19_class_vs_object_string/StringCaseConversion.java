package day19_class_vs_object_string;

public class StringCaseConversion {
    public static void main(String[] args) {

        String word = "CyberTek";
        String sentence = "Java is fun!";

        // Convert word to all upper case
        System.out.println(word.toLowerCase());
        System.out.println("JAVA".toLowerCase());
        System.out.println(sentence.toLowerCase());

        word.toLowerCase();
        System.out.println(word);   // word degismiyor ayni kaliyor

        // change word to all lowercase letters. and assign back
        word = word.toLowerCase();
        System.out.println(word);  // word degisiyor cunku assing ediyosun  (=) diyosun

        String wordInLcase = word.toLowerCase();
        System.out.println("wordInLcase = " + wordInLcase);
        // change word to all lowercase letters. and assign back
        word = word.toLowerCase();
        System.out.println("word = " + word);
        
        String company = "Amazon";
        System.out.println(company.toUpperCase());    // AMAZON
        System.out.println("java".toUpperCase());     // JAVA

        System.out.println("company = " + company);
        company = company.toUpperCase();
        System.out.println("company = " + company);




    }
}
