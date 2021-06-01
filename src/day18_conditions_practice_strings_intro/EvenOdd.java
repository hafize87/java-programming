package day18_conditions_practice_strings_intro;

public class EvenOdd {
    public static void main(String[] args) {

        // when number is divisible  by 2 then it is an EVEN number.
       // EVEN --> divisible by 2 ( no reminder = 0 )
        // OOD --> NOT divisible by 2 ( reminder is 1 )

        int num = 5;

        System.out.println(num % 2);    //  burada islemi cikracak yani remainder da ne kadiysa onu cikaracak --> 1
        System.out.println(num % 2 == 0);   // True or false diye cikacak console la.  ----> false


        if(num %2 == 0){      // DIVISIBLE BY 2
            System.out.println("EVEN");
        }
        else{
            System.out.println("ODD");
        }

    }
}
