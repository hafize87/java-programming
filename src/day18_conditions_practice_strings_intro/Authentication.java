package day18_conditions_practice_strings_intro;

public class Authentication {
    public static void main(String[] args) {

        int last4SSN = 3456;
        int pinCode = 4567;

        int expLast4SSn = 3456;
        int expPinCode = 7543;

        if(last4SSN == expLast4SSn && pinCode == expPinCode){
            System.out.println("Authentication successful");
        }
        else{
            System.out.println("Authentication unsuccessful");
            if(last4SSN != expLast4SSn){
                System.out.println("Last 4 SSn number incorrect");
            }
            if(pinCode != expPinCode){
                System.out.println("Your pin code incorrect");

            }
        }

    }
}
