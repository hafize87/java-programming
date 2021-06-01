package day20_string_manipulation;

public class StringIsEmpty {
    public static void main(String[] args) {

        String jobTitle = "";
        System.out.println(jobTitle.isEmpty());    // true
        System.out.println(jobTitle.length());      // 0
        System.out.println(jobTitle.length() == 0);   // true

        if(jobTitle.isEmpty()){
            System.out.println("Job title is missing , please resend");
        }
        else{
            System.out.println("Job title looks good");
        }

        if(jobTitle.length() == 0){
            System.out.println("Job title is empty");
        }else {
            System.out.println("Job title is not empty");
        }


        System.out.println(jobTitle.equals(""));   // true


        if("".equals(jobTitle)){
            System.out.println("Job title is empty");
        }else {
            System.out.println("Job title is not empty");
        }

        String word = " ";
        System.out.println(word.isEmpty());    // false
        System.out.println(word.length());     // 1  blank space is character

        String veggie = "carrots";
        System.out.println(veggie.isEmpty());  // false


        // if veggie is not empty , print we have carrots

        if(!veggie.isEmpty()){
            System.out.println("we have " + veggie);
        }

        String word2;
       // System.out.println(word2.isEmpty());  ERROR. NOT initialized



    }
}
