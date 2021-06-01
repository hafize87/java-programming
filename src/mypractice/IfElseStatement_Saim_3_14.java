package mypractice;

import java.util.Scanner;

public class IfElseStatement_Saim_3_14 {
    public static void main(String[] args) {

//      Write a java program that accepts three numbers and return the minimum number
//      (assume that none of them are equal)

        Scanner input = new Scanner (System.in);
        System.out.println("Enter 3 numbers");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();


        if((num1<num2 && num1>num3) || (num1>num2 && num1<num3)){
            System.out.println(num1);
        }
        else if((num2<num1 && num2>num3) || (num2>num1 && num2<num3) ){
            System.out.println(num2);
        }
        else if((num3<num1 && num3>num2) || (num3>num1 && num3<num2)){
            System.out.println(num3);
        }
        else{
            System.out.println("Enter different number");
        }


//        if(one <two && one < three){
//            System.out.println("min number is " + one);
//        }else if (two < one && two < three){
//            System.out.println("min number is " + two);
//        }else
//            System.out.println("min number is " + three);

   //--------------------------------------------------------------------------------------------------------

        //        Write a program that will ask the user to enter three numbers.
//        If the numbers are the same print “All integers are the same”
//        If they are not equal, print which is the biggest value of the three numbers
//          —> If there is two numbers which are the largest print the one that came first
//                > Input: 3,2,6
//                > Output: The biggest number from 3, 2 and 6 is: 6

//        Scanner input = new Scanner (System.in);
//        System.out.println("Enter 3 numbers");
//        int num1 = input.nextInt();
//        int num2 = input.nextInt();
//        int num3 = input.nextInt();
//
//        if((num1 == num2 || num1 == num3) && (num2 == num1 || num2 == num3) && (num3 ==num1 || num3 == num2) ){
//            System.out.println("All integers are the same");
//        }
//        else if(num1 > num2 && num1 > num3){
//            System.out.println("The biggest number from " + num1 + ", "+ num2 + " and "+ num3+ " is : "+ num1);
//        }
//        else if(num2>num1 && num2>num3){
//            System.out.println("The biggest number from " + num1 + ", "+ num2 + " and "+ num3+ " is : "+ num2);
//        }
//        else{
//            System.out.println("The biggest number from " + num1 + ", "+ num2 + " and "+ num3+ " is : "+ num3);
//        }

        //-----------------------------------------------------------------------------------------------------------

        //        Write a program that will accept a number representing the month.
//        Print out how many days are in that given month. Assume February (2) has 28 days
//              Ex:
//                  Input: 1
//                  Output: 31 days
//                  Input: 2
//                  Output: 28 days

//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter number 1 to 12");
//        int month = input.nextInt();
//
//        if(month == 1){
//            System.out.println("31 days");
//        }
//        else if(month == 2){
//            System.out.println("28 days");
//        }
//        else if(month == 3){
//            System.out.println("31 days");
//        }
//        else if(month == 4){
//            System.out.println("30 days");
//        }
//        else if(month == 5){
//            System.out.println("31 days");
//        }
//        else if(month == 6){
//            System.out.println("30 days");
//        }
//        else if(month == 7){
//            System.out.println("31 days");
//        }
//        else if(month == 8){
//            System.out.println("31 days");
//        }
//        else if(month == 9){
//            System.out.println("30 days");
//        }
//        else if(month == 10){
//            System.out.println("31 days");
//        }
//        else if(month == 11){
//            System.out.println("30 days");
//        }
//        else if(month == 12){
//            System.out.println("31 days");
//        }
//        else{
//            System.out.println("Invalid number");
//        }

        // ----------------------------------------------------------------------------------------------------------


        //        You are diving in the ocean. Your oxygen tank has a certain level (number) and
//        you must print a message based on the level
//        x          > Above 90 - Your tank is full
//                   > Above 80 - Still okay
//                   > Above 70 - Don't go too far
//                   > Above 60 - Start to head back
//                   > Above 50 - Be careful now you at at 50%

//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter certain level (number)");
//        int num = input.nextInt();
//
//        if(num >= 90){
//            System.out.println("Your tank is full");
//        }
//        else if(num >= 80){
//            System.out.println("Still okay");
//        }
//        else if (num >= 70){
//            System.out.println("Don't go too far");
//        }
//        else if(num >= 60){
//            System.out.println("Start to head back");
//        }
//        else if (num >= 50) {
//            System.out.println("Be careful now you at at 50%");
//        }
//        else {
//            System.out.println("Stay at home");
//        }

   //----------------------------------------------------------------------------------------------------------

        //        Write a program that will accept your salary amount.
//     Then also ask the user if they are full time or not (boolean).
//        If they are full time add 20000 to their salary, but if they are part time then subtract 5000. Print the final salary.

//        Scanner input = new Scanner(System.in);
//        System.out.println("Are fulltime worker or part time?");
//        boolean work = input.nextBoolean();
//        double fullTime = 20000;
//        double partTime = 5000;
//        double salaryAmount = 85000;
//
//        if(work == true){
//            salaryAmount += fullTime;
//        }
//        else{
//            salaryAmount -= partTime;
//        }
//        System.out.println(salaryAmount);

   // -----------------------------------------------------------------------------------------

        //        [If statement, operators]
//      Write a java program that can identify if a person is eligible to vote for the president.
//          Age of voting: 18. Print "Eligible to vote" or "not eligible to vote".
//        => To make it dynamic change the three angles to be Scanner inputs

//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter your age");
//        int age = input.nextInt();
//
//        if(age <=0){
//            System.out.println("Invalid age");
//        }
//        else if (age < 18){
//            System.out.println("Not eligible to vote");
//        }
//        else {
//            System.out.println("Eligible to vote");
//        }

        //--------------------------------------------------------------------------------------------------------------


//        [If statement, operators]
//          Write a program that will accept a boolean value. Print out the opposite of the given boolean
//          Ex: true -> false
//            false -> true

//        System.out.println("Enter boolean value");
//        boolean value = input.nextBoolean();
//
//        if(value){
//            System.out.println("False");
//        }
//        else{
//            System.out.println("True");

    //-------------------------------------------------------------------------------------------------------

        //        [Field Trip]
//         Your school goes on a Field trip each year. The place you go will be based on your grade.
//        Given some grade number (1-6) figure out the details of your field trip. Print the information at the end.
//            Data based on grade:
//
//        grade - 1
//        location -  Apple orchard
//        number of groups - 3
//        teacher in charge - Ms. Smith
//
//        grade - 2
//        location - Zoo
//        number of groups - 7
//        teacher in charge - Mr. Lee
//
//        grade - 3
//        location - Aquarium
//        number of groups - 5
//        teacher in charge - Ms. Wilson
//
//        grade - 4
//        location - Movie theater
//        number of groups - 2
//        teacher in charge - Ms. Reyes
//
//        grade - 5
//        location - Museum
//        number of groups - 5
//        teacher in charge - Ms. Lela
//
//        grade - 6
//        location - Six Flags
//        number of groups - 8
//        teacher in charge - Mr. Watt

//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter grade 1 - 6");
//        int grade = input.nextInt();
//
//        String location = "";
//        int numberOfGroups = 0;
//        String teacherInCharge = "";
//
//        switch (grade){
//            case 1 :
//                location = "Apple orchard";
//                numberOfGroups = 3;
//                teacherInCharge = "Ms. Smith";
//                break;
//            case 2 :
//                location = "Zoo";
//                numberOfGroups = 7;
//                teacherInCharge = "Mr. Lee";
//                break;
//            case 3 :
//                location = "Aquarium";
//                numberOfGroups = 5;
//                teacherInCharge = "Ms. Wilson";
//                break;
//            case 4 :
//                location = "Movie theater";
//                numberOfGroups = 2;
//                teacherInCharge = "Ms. Reyes";
//                break;
//            case 5 :
//                location = "Museum";
//                numberOfGroups = 5;
//                teacherInCharge = "Ms. Lela";
//                break;
//
//            case 6 :
//                location = "Six Flags";
//                numberOfGroups = 8;
//                teacherInCharge = "Mr. Watt";
//                break;
//            default:
//                System.out.println("Invalid number");
//
//        }
//        System.out.println("Grade : " + grade + " location : " + location + " Number of group : " + numberOfGroups +
//                " teacher name : " + teacherInCharge);
//
//
    }
}
