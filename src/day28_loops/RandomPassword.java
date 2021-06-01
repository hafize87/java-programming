package day28_loops;

import java.util.Random;

public class RandomPassword {
    public static void main(String[] args) {

        String source = "abcdABCD07896_%#@!_";
        Random random = new Random();

        String password ="";

        for(int i = 1; i<= 8; i++){


           int index = random.nextInt(source.length());  // kac numaraya kadar random edecegini gosteriyor
          //  source.substring(index, index + 1)   ===> bu sekilde de olabilir
           System.out.print(source.charAt(index));

           password += source.charAt(index);
          // System.out.println(random.nextInt(source.length()));
       }

        System.out.println("\n your password : " + password);
    }
}
