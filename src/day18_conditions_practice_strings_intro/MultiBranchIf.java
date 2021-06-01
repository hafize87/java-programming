package day18_conditions_practice_strings_intro;

public class MultiBranchIf {
    public static void main(String[] args) {

        int number = 0;

        if(number > 0){
            System.out.println(number + " Positive");
        }
        else if(number < 0){
            System.out.println(number + " Negative");
        }
        else {  // else if( number == 0 )  --> we can do it too.
            System.out.println(number + " Equals to 0");
        }

    }

}
