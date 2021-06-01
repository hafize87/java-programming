package day46_encapsulation;

public class CapitalOne {
    public static void main(String[] args) {

        CheckingAccount acc = new CheckingAccount();

        acc.setAccountNumber(2345678987L);
        acc.setAccountHolder("Smith");
        acc.setBalance(256.000);
        acc.setType("360 Checking");

        System.out.println("acc = " + acc);
    }
}
