package day26_loops;

public class MultiplicationTable {
    public static void main(String[] args) {


        /**
         * if number less than 1 or more than 10
         * print "ERROR: invalid input"
         * exit main method: return;
         */

        int number = 11;

        if(number < 1 || number >=10){
            System.out.println("Error : Invalid input");
            return;   // Exit main method : return   ==> tekrardan basa donuyor
        }


        for(int i = 1; i<=10; i++){

            System.out.println(number + " * " + i + " = " + (number*i));

        }
    }
}
