package day13_conditional_statements;

public class ATMPinCodeProgram {
    public static void main(String[] args) {

        System.out.println("**** WELCOME TO TD BANK ATM ****");

        int secretPincode = 2345;
        int inputPincode = 2345;
        if(secretPincode == inputPincode){
            System.out.println("Welcome to your account.");
            System.out.println( "You can withdraw, check balance, deposit");
        }
        else {
            System.out.println("Incorrect pincode!");
            System.out.println("Please try again.");
        }
        System.out.println("\"Thank you for using TD Bank ATM!\"");
    }




}
