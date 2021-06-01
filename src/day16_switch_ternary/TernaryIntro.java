package day16_switch_ternary;

public class TernaryIntro {
    public static void main(String[] args) {

        int score = 90;

        if(score > 60){
            System.out.println("Pass");
        }else{
            System.out.println("Fail");
        }

        String result = (score > 90) ? "Pass" : "Fail";
        System.out.println(result);
    }
}
