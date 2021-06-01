package day39_wrapper_classes;

public class WrapperClassMethods {
    public static void main(String[] args) {

        System.out.println(Integer.max(10,5)); // 10
        System.out.println(Integer.sum(50,35));  // 85
        System.out.println(Integer.min(5,2));    // 2
        System.out.println("Min int: " + Integer.MIN_VALUE);
        System.out.println("Max int: " + Integer.MAX_VALUE);

        System.out.println(Double.max(234,76.7));
        System.out.println("Min Double: " + Double.MIN_VALUE);
        System.out.println("Max Double: " + Double.MAX_VALUE);

        System.out.println(Double.compare(5, 1));  // 1 first larger than second
        System.out.println(Double.compare(5,5));   // 0 both equal
        System.out.println(Double.compare(5,45));   // -1  first is smaller than second

        System.out.println(Character.isDigit('8'));  // true
        System.out.println(Character.isDigit('v'));
        System.out.println(Character.isAlphabetic('Q')); // true
        System.out.println(Character.isLetter('r'));  // true
        System.out.println(Character.isLetter('9'));

        char letter = 'A';
        if(Character.isUpperCase(letter)){
            System.out.println("It is uppercase");
        }
        else{
            System.out.println("lowercase");
        }
        String word = "JaVa IS FuN";

        for (int i = 0; i < word.length(); i++) {
            if(Character.isUpperCase(word.charAt(i))){
                System.out.println(word.charAt(i));
            }

        }
        System.out.println(Character.MAX_VALUE);
        System.out.println(Character.MIN_VALUE);

        System.out.println(Boolean.TRUE);


        String a = "234";
        int b = Integer.valueOf(a);
        int c = Integer.parseInt(a);

        int num = Integer.parseInt("123");
        int num1 = Integer.valueOf("345");



    }
}
