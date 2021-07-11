package mypractice;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Discover discover = new Discover(input.nextLong(), input.nextDouble());
        System.out.println(discover);

        CapitalOne capitalOne = new CapitalOne(input.nextLong(), input.nextDouble());
        capitalOne.useCard();
        System.out.println(capitalOne);

        Chase chase = new Chase(input.nextLong(), input.nextDouble());
        chase.payBalance(input.nextDouble());
        System.out.println(chase);


    }

    }

class CreditCard{

    long cardNumber;
    double balance;
    double apr;
    boolean cashback;

    public CreditCard(long cardNumber, double balance) {
        this.cardNumber = cardNumber;
        this.balance = balance;

    }

    public void useCard(){

    }

    public void payBalance(){

    }


}
class Discover extends CreditCard{

    double apr = 11.99;
    boolean cashback = true;

    public Discover(long cardNumber, double balance) {
        super(cardNumber, balance);
    }

    public void useCard(){

        System.out.println("Using Discover card");
    }


    public void payBalance(double balance){

        System.out.println("Paying " + balance + " from " + this.balance);
    }

    public String toString() {
        return "Discover credit cart" +
                " | card number: " + cardNumber +
                " | balance used: " + balance +
                " | APR: " + apr +
                " | has cashback: " + cashback;
    }


}
class CapitalOne extends CreditCard{

    double apr = 14.35;
    boolean cashback = false;

    public CapitalOne(long cardNumber, double balance) {
        super(cardNumber, balance);
    }


    @Override
    public void useCard(){

        System.out.println("Using Capital One card");
    }


    public void payBalance(double balance){

        System.out.println("Paying " + this.balance + " from " + balance);
    }

    @Override
    public String toString() {
        return "Capital One credit cart" +
                " | card number: " + cardNumber +
                " | balance used: " + balance +
                " | APR: " + apr +
                " | has cashback: " + cashback;
    }
}
class Chase extends CreditCard{

    double apr = 10.99;
    boolean cashback = true;

    public Chase(long cardNumber, double balance) {
        super(cardNumber, balance);
    }

    @Override
    public void useCard(){

        System.out.println("Using Chase card");
    }


    public void payBalance(double balance){

        System.out.println("Paying " + balance + " from " + this.balance);
        this.balance -= balance;
    }

    @Override
    public String toString() {
        return "Chase credit cart" +
                " | card number: " + cardNumber +
                " | balance used: " + balance +
                " | APR: " + apr +
                " | has cashback: " + cashback;
    }
}