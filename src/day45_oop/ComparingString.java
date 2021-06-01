package day45_oop;

public class ComparingString {
    public static void main(String[] args) {

        String word1 = "java";  // in string pool
        String word2 = "java";   // re-use from string pool
        String word3 = new String("java");  // create NEW object in HEAP , outside pool
        String word4 = new String("java");  // create NEW object in HEAP , outside pool

        System.out.println(word1 == word2);  // true
        System.out.println(word1 == word3);   // false
        System.out.println(word3 == word4);   // false -> point to different objects in HEAP

        System.out.println(word1.equals(word2));  // true  --> comparing values
        System.out.println(word1.equals(word3));  // true  --> comparing values
        System.out.println(word3.equals(word4));   // true  --> comparing values

    }
}
