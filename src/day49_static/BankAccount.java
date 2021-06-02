package day49_static;

public class BankAccount {

    static double balance = 50;
    String user;

    public void spend(double amount){
        System.out.println(user + " spending $" + amount);
        balance -= amount;
    }

    public double showBalance(){

        System.out.println("Current balance = " + balance);

        return balance;
    }




}
