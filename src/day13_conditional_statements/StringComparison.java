package day13_conditional_statements;

public class StringComparison {
    public static void main(String[] args) {

        String city = "Los Angles";

        if(city.equals("Los Angles")){
            System.out.println("It is LA");
        }
        else{
            System.out.println("It is not LA");
        }

        String weather = "sunny";
         //if(weather == "sunny")   --> it works , not error, but avoid

        if(weather.equals("sunny")){
            System.out.println("Lets go out");
        }
        else{
            System.out.println("Lets stay at home");
        }
    }
}
