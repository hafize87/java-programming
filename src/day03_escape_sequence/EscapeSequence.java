package day03_escape_sequence;

public class EscapeSequence {
    public static void main(String[] args) {
        System.out.println("I like \"java\" programming");  //I like "java" programming
        System.out.println("Lets buy \"coffee\" and \"tea\"");   //I like "java" programming
        System.out.println("\\"); // \
        System.out.println("java\nintellij");  // java then next line
        System.out.println("\tjava\tselenium\tapi");   //  java	selenium	api --> It will give double space
    }
}
