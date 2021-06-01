package mypractice;

import java.util.Scanner;

public class Manipulation_Saim_3_22 {
    public static void main(String[] args) {

//        What is a class? class in java it is like template or blueprint.
//        What is in a class?  it has 2 things DATA / VARIABLE and BEHAVIOUR
//        What is an object?   we create object from class. object is real thing. it is concrete
//        Which java classes have we used?   Scanner , Random,
//        What is importing and what how have we used it for far?
//        What are methods?

        //-------------------------------------------------------------------------------------------

//        Given two String variables. One is a full name and the second a last name.
//                Check if the full name has the same last name as the other String.
//        Ex:
//        s: "james bond"
//        s: "bond"
//        output: Same last name
//
//        s: "alex benji"
//        s: "bond"
//        output: Not the same last name

//        String name1 = "james bond";
//        String name2 = "bond";
//
//        String fistName = name1.substring(name1.indexOf(" ")+1);
//        if(name2.equals(fistName)){
//            System.out.println("Same last name");
//        }
//        else{
//            System.out.println("Not the same last name");
//        }


    // -------------------------------------------------------------------------------------

//        Given a String variable with a message.
//          You will check if the message contains any of these bad words: “idiot, dumb, heck”
//    -> If the message contains any of those words print: “Message not sent”.
//    -> If the message is bad word free print “Message sent”

//        String name = "I love java and i work a lot";
//
//        if(name.contains("idiot") || name.contains("dumb") || name.contains("heck")){
//            System.out.println("Message not sent");
//        }
//        else{
//            System.out.println("Message sent");
//        }

    // ---------------------------------------------------------------------------------------------


//        A person will enter their address into a String. Make sure the String is not empty.
//                If it is empty print: "No address found".
//                If there is an address make all the text uppercase to match the expected format
//
//        Ex:
//        Input: 231332 leaf ave, lake city 3132
//        Output: 231332 LEAD AVE, LAKE CITY 3132
//
//        Ex:
//        Input: ""
//        Output: No address found

//        String address = "2537 w cezanne cir.";
//         if(address.isEmpty()){
//             System.out.println("No address found");
//         }
//         else {
//             System.out.println(address.toUpperCase());
//         }

    //----------------------------------------------------------------------------------------------------------

//        Given a username and password verify they are valid.
//                - The password cannot be less than 5 characters
//                -> If it is less print: "Password cannot be less than 5 characters"
//        -> If it is more then or equal to 5 print: "Valid password"
//
//                - Also the password should not contain the username
//                - If the password has the username in it print:
//        "Invalid password, username should not be in it"
//            -> Also change the password to have the value: "password"


//        String userName = "hafize";
//        String password = "fiz";
//
//        if(password.length() < 5 ){
//            System.out.println("Password cannot be less than 5 characters");
//            if(password.contains(userName)){
//                System.out.println("Invalid password, username should not be in it");
//            }
//            else{
//                System.out.println(password.replace(password, "password"));
//            }
//        }
//        else{
//            System.out.println("Valid password");
//        }

    //--------------------------------------------------------------------------------------------------------

//        Given three String variables of some text find and print the longest word that also contains 'a'
//
//        Ex:
//        "java"
//        "mouse"
//        "computer"
//        Output: java
//        Ex:
//        "java"
//        "mouse"
//        "apples"
//        Output: apples
//
//        Challenge: Instead of just checking for 'a' add another variable that can be used to check for any character.

//        String name1 = "computer";
//        String name2 = "mouse";
//        String name3 = "pples";
//
//        String biggerWordWithA = "";
//
//        if(name1.contains("a") && name1.length() > biggerWordWithA.length()){
//            biggerWordWithA = name1;
//        }
//        if(name2.contains("a") && name2.length() > biggerWordWithA.length()){
//            biggerWordWithA = name2;
//        }
//        if(name3.contains("a") && name3.length() > biggerWordWithA.length()){
//            biggerWordWithA = name3;
//        }
//
//        if(biggerWordWithA.contains("a")){
//            System.out.println(biggerWordWithA);
//        }
//        else{
//            System.out.println("does not A character ");
//        }


    // ----------------------------------------------------------------------------------------------------------------

//        Given a String message with some text and a number (1-3) replace certain characters from the String message.
//
//                When the number is:
//        1: replace 'a' with 'e'
//        2: replace 's' with 'r'
//        3: replace 'o' with 'z'
//
//        Ex:
//        message: java class is fun
//                number: 1
//        Output: jeve cless is fun
//
//        Ex:
//        message: java class is fun
//                number: 2
//        Output: java clarr ir fun

//        String message = "java class fun";
//        int number = 1;
//         switch (number){
//             case 1:
//                 System.out.println(message.replace("a" , "e"));
//                 break;
//             case 2:
//                 System.out.println(message.replace("s" , "r"));
//                 break;
//             case 3:
//                 System.out.println(message.replace("o", "z"));
//                 break;
//             default:
//                 System.out.println("Invalid number");
//         }


    }
}
