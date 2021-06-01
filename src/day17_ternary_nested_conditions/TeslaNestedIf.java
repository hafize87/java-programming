package day17_ternary_nested_conditions;

public class TeslaNestedIf {
    public static void main(String[] args) {

        char model = 'S';
        String trim = "Long range";

        if(model == 'S'){
            if(trim.equals("Long range")){
                System.out.println("Range : 123");
                System.out.println( "top speed: 155 mph");
                System.out.println("0-60- 3.1sec");
            }
            else if(trim.equals("Plaid")){
                System.out.println("Range : 89");
                System.out.println( "top speed: 15 mph");
                System.out.println("0-60- 3.2sec");
            }
        }
        else{
            System.out.println("Invalid model");
        }

    }
}
