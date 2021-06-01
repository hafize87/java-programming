package day17_ternary_nested_conditions;

public class TernaryExamples {
    public static void main(String[] args) {

        int score = 70;
        String result = (score > 60)? "Pass":"Fail";
        System.out.println(result);

        String word = "Good";
        int x = (word.equals("Good"))? 100 : 0 ;
        System.out.println(x);
        System.out.println((word.equals("Good"))? 100 : 0);

        score = 60;
        char grade = (score>90)? 'A':'B';
        System.out.println(grade);

        score = 47;
        String evenOdd = (score%2==0)? "Even":"Odd";
        System.out.println(evenOdd);




    }
}
