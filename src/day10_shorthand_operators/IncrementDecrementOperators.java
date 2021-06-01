package day10_shorthand_operators;

public class IncrementDecrementOperators {
    public static void main(String[] args) {
        int i = 1;
        System.out.println("i = " + i);
        i++;
        System.out.println("i = " + i);
        i++;
        i++;
        ++i;
        ++i;
        System.out.println("i = " + i);


        int lineOfCode = 15;
        // increase lineofcode by 1

        lineOfCode = lineOfCode + 1;
        lineOfCode += 1;
        lineOfCode++;
        ++lineOfCode;
        System.out.println(lineOfCode); //19

        // TYPE 4 different ways of decreasing by 1

        lineOfCode = lineOfCode - 1;
        lineOfCode -= 1;
        lineOfCode--;
        --lineOfCode;
        System.out.println(lineOfCode);  //15
        
        char letter = 'a';
        System.out.println("letter = " + letter);
        letter++;         // change to next character
        System.out.println("letter = " + letter);
        letter++;
        ++letter;
        System.out.println("letter = " + letter);
        letter--;
        System.out.println("letter = " + letter);
        letter--;letter--;letter--;
        System.out.println("letter = " + letter);
        
    }
}
