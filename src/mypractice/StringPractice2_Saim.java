package mypractice;

import java.time.chrono.MinguoDate;
import java.util.Scanner;

public class StringPractice2_Saim {
    public static void main(String[] args) {

//          [Remove first and last]
//        Given two words. Print the first word without its first character then print the second word without its last character.
//                Input:
//                  apple
//                  banana
//                Output:
//                  pple
//                  banan


//        String apple = "apple";
//        String banana = "banana";
//
//          System.out.println(apple.substring(1, apple.length()-1));
//        System.out.println(banana.substring(1, banana.length()-1));

        //        ---------------------------------------------------------------------

//          [Middle char]
//        Given a String, write a program to display the middle character of a string
//              a) If the length of the string is even there will be two middle characters.
//              b) If the length of the string is odd there will be one middle character.
//        Ex:
//        Input: elephant
//        Output: The middle characters: ph

//        String elephant = "hafiz";
//
//        if(elephant.length() % 2 == 0){
//            System.out.println(elephant.substring(elephant.length() / 2 - 1, elephant.length() / 2 + 1));
//        }
//        else{
//            System.out.println(elephant.substring(elephant.length() / 2, elephant.length() / 2 + 1));
//        }


//                ---------------------------------------------------------------------
//          [Initials]
//        Given a person's name in a String (first and last name), then prints out the initials of the user.
//        The initials should be uppercase.
//                  Ex:
//                      input: james bond
//                      output: your initials are JB

//        String name = "Kemal Aksoy";
//        String lastname = name.substring(name.indexOf(" "));
//
//
//        System.out.print(name.toUpperCase().charAt(0));
//        System.out.println(lastname.toUpperCase().substring(1,2));


//        ---------------------------------------------------------------------

//          [Move first word]
//
//      Given a sentence. Display the sentence with the first word moved to the end of the sentence.
//        Ex:
//        input: Java is a fun language
//        output: is a fun language Java
//        Hint: Use indexOf and substring

//        String str = "I love you";
//
//        String firstLetter = (str.substring(0, str.indexOf(" ")));
//        String lastLetter = str.substring(str.lastIndexOf(" "), str.length()).trim();
//        System.out.println(lastLetter + str.substring(str.indexOf(" "), str.lastIndexOf(" ")) + " " + firstLetter);



//        ---------------------------------------------------------------------

//          [SMS parts]
//
//        Given a String in the following format:
//     “Sender: <James Bond>. From Number: [202-123-3456]. + Message: {“I love programming and problem solving}”
//
//        Separate these parts and print them separately:
//              “Sender: actualSender”
//              “Number: actualNumber”
//              “Message: actualMessage”

//        String str = "Sender: <James Bond>. From Number: [202-123-3456]. + Message: {“I love programming and problem solving}";
//
//        String sender = str.substring(str.indexOf("<")+1, str.indexOf(">"));
//        System.out.println("Sender: " + sender);
//
//        String number = str.substring(str.indexOf("[")+1, str.indexOf("]"));
//        System.out.println("Number: " + number);
//
//        String message = str.substring(str.indexOf("{")+2, str.indexOf("}"));
//        System.out.println(message);


//        ---------------------------------------------------------------------
//
//          [Creating an email]
//        Ask user to enter two strings. Both of these strings should be at least 6 character long.
//        If they are shorter than that print “Invalid data” and program should end.
//        If the information provided is valid,
//        you will take the first 4 characters of first string and combine them with the last three characters of the second string.
//        At the end of your combined string add “@cybertek.com” and print the final string as your created email.
//        The final email should be in all lowercase.
//
//        input:
//        JamesBond
//                Secret
//        output:
//        jameret@cybertek.com

//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter 2 strings");
//        String name1 = input.next();
//        String name2 = input.next();
//
//        String first4 = name1.toLowerCase().substring(0,4);
//        String last3 = name2.toLowerCase().substring(name2.length()-3);
//        System.out.println(first4);
//        System.out.println(last3);
//
//
//        if(name1.length() <= 6 && name2.length() <= 6 ){
//            System.out.println("Invalid data");
//        }
//        else{
//            System.out.println(first4 + last3 +"@cybertek.com");
//
//        }

    }
}
