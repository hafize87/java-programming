package day25_loops;

public class PrintStars {
    public static void main(String[] args) {



        for (int star= 1;  star <=15; star++){
            System.out.print("* ");
        }

        System.out.println();

        String myStars = "";

        for (int i=1; i<=5; i++ ){

           // myStars = myStars + "* ";
            myStars +=  "* ";


        }
        System.out.print("my stars = " + myStars);
       // System.out.print("my stars = " + myStars.trim());     sondaki boslugu cikartiyo
    }
}
