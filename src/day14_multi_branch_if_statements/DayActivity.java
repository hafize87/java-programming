package day14_multi_branch_if_statements;

public class DayActivity {
    public static void main(String[] args) {

        // weather = sunny , rainy, snowy, windy
        String weather = "windy";

        if(weather.equals("sunny")){
            System.out.println("Go to park, hiking, and code java");
        }
        else if(weather.equals("rainy")){
            System.out.println("Stay home, drink tea, and code java");
        }
        else if(weather.equals("snowy")){
            System.out.println("clean the car then build snowman, drink hot chocolate, and code java");
        }
        else if(weather.equals("windy")){
            System.out.println("Get ready for power loss, fly a kite, and code java");
        }
        else{
            System.out.println("just keep coding java");
        }
    }
}
