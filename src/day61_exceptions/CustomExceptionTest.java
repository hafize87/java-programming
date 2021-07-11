package day61_exceptions;

public class CustomExceptionTest {
    public static void main(String[] args) {

        int minutes = 60;
        System.out.println("Class is going on for " + minutes + " minutes.");

        if(minutes > 70){

            throw new BreakTimeException("it is break time");
        }

        System.out.println("lets continue the class");


      //  -----------------------------------

            double balance = 400.0;
            double items = 600.0;

        System.out.println("i have $" + balance + " and adding purchasing item for $" + items);

            if(items > balance){

                throw new InsufficientBalanceException("not enough money");
            }
        System.out.println("Item successfully purchased");
    }
}
