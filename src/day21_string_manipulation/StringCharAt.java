package day21_string_manipulation;

public class StringCharAt {
    public static void main(String[] args) {


        String word = "java";

        System.out.println(word.charAt(0));     //j
        System.out.println(word.charAt(1));     //a
        System.out.println(word.charAt(2));     //v
        System.out.println(word.charAt(3));     //a
        //System.out.println(word.charAt(4));        // error

        System.out.println(word.length());  // 4

        String company = "Cybertek";
        System.out.println("First letter: " + company.charAt(0));

        // C e y b e r t e k
        char first = company.charAt(0);
        char second = company.charAt(1);
        char third = company.charAt(2);
        char fourt = company.charAt(3);
        char fifth = company.charAt(4);
        char sixth = company.charAt(5);
        char seventh = company.charAt(6);
        char eighth = company.charAt(7);

        System.out.println(first + " " + second + " " + third + " " + fourt +
                            " " + fifth + " " + sixth + " " + seventh + " " + eighth);

        String withSpaces = first + " " + second + " " + third + " " + fourt +
                " " + fifth + " " + sixth + " " + seventh + " " + eighth;

        System.out.println("withSpaces = " + withSpaces);





    }
}
