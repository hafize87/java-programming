package mypractice;

public class StringPractice_Saim {
    public static void main(String[] args) {

//        [Cool Name]
//        Declare a variable name. You will check if it is a cool name.
//                - If the name begins with an ‘a’ or a ‘z’ print “Your name is cool”
//                - If the name ends with 'm' print "Almost cool"
//                - Otherwise print “Sorry not a cool name”


//        String name = "Hafize";
//        if (name.startsWith("a") || name.startsWith("z")) {
//            System.out.println("Your name is cool");
//        } else if (name.endsWith("m")) {
//            System.out.println("Almost cool");
//        } else {
//            System.out.println("Sorry not a cool name");
//        }


        //-----------------------------------------------------------------------------------------------------------------
//          [Account Number]
//
//        Declare a variable account number (String). You will check if these account numbers are valid.
//                - If the account number begins with a “2” the account number should be 7 characters long
//        -> Print: "Valid 7 digit account number"
//           Otherwise: "Invalid 7 digit account number"
//                - If the account number begins with a “5” the account number should be 10 characters long
//        -> Print: "Valid 5 digit account number"
//                  Otherwise: "Invalid 5 digit account number"
//         — If the account number does not begin with a 2 or a 5
//        -> Print "Invalid account number"


        String accountNumber = "678888888";

        if (accountNumber.startsWith("2")) {
            if (accountNumber.length() == 7) {
                System.out.println("Valid 7 digit account number");
            } else {
                System.out.println("Invalid 7 digit account number");
            }
        }
        else if(accountNumber.startsWith("5")){
            if(accountNumber.length() == 10){
                System.out.println("Valid 5 digit account number");
            }
            else{
                System.out.println("Invalid 5 digit account number");
            }
        }
        else if(!accountNumber.startsWith("2") && !accountNumber.startsWith("5")){
            System.out.println("Invalid account number");
        }

    }
}
