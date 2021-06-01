package day27_loops;

public class Neighbors {
    public static void main(String[] args) {

//        String word = "jaavvaa";
//
//        if 2 side by side characters match: signal beep - a
//        aa -> beep - a
//        vv -> beep - v
//        aa -> beep - a


        String word = "jaavva";
        for(int i = 0; i < word.length()-1; i++){
            System.out.print(word.charAt(i));
            System.out.println(word.charAt(i +1));

            if(word.charAt(i) == word.charAt(i+1)){
                System.out.println("beep- " + word.charAt(i));
            }
        }


    }
}
