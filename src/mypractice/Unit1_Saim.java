package mypractice;

import day05_primitives_concatanation.PrimitivesExamples;

import java.util.Scanner;

public class Unit1_Saim {
    public static void main(String[] args) {
//        [Personal Information - Scanner and If]
//        Ask the user how many people they live with?
//
//        if user lives with Less than 2 people: print "Live with less than 2 people"
//        if the user lives with 3 - 6 people: print "Live with 3 - 6 people"
//        if the user lives with more than 6 people: print "Live with "more than 6 people"
//
//        Ask the user what city they live in?
//        Ask the user if the live in downtown ("yes or no")
//        if you live downtown, ask them have you thought about moving to the suburbs? ("yes or
//        no")
//        if they have thought about it print "do it its great", if they have not print "You should
//        think about it"
//
//        Ask the user their favorite animal?
//        Print "Wow %animal is a great animal"
//
//        Ask the user how many pets they want?
//        Print "Interesting, do you want %numberOfPets %favoriteAnimals?"
//                ----------------------------------------------------------

//            Scanner input = new Scanner(System.in);
//            System.out.println("How many people you live with");
//            int people = input.nextInt();
//
//
//            if(people < 2){
//                System.out.println("Live with less than 2 people");
//            }
//            if(people <= 3 && people >= 6){
//                System.out.println("Live with 3 - 6 people");
//            }
//            if(people > 6) {
//                System.out.println("Live with more than 6 people");
//            }
//
//             System.out.println("What city you live in?");
//            String city = input.next();
//
//            System.out.println("Do you live downtown?");
//            boolean downtown = input.nextBoolean();
//
//            if(downtown){
//                System.out.println("Have you thought about moving to the suburbs?");
//                Boolean suburbs = input.nextBoolean();
//                if(suburbs){
//                    System.out.println("do it its great");
//                }
//                else{
//                    System.out.println("You should think about it");
//                }
//            }
//            System.out.println("What is your favorite animal?");
//            String animal = input.next();
//             System.out.println("Wow " + animal + " animal is a great animal");
//
//        System.out.println("How many pets you want?");
//        int pets = input.nextInt();
//        System.out.println("Interesting, do you want %numberOfPets %favoriteAnimals?");



      //-------------------------------------------------------------------------------------------------------------

//        Operators

//        Analyze each step, What is the result of a, b, and c?

//        int a = 3,
//            b = 2;
//        long c = (a-- + b) * 2 / 3 % 2;
//             //   ( 3 + 2 ) * 2 / 3 % 2
//            //       10 /3 % 2
//                //     3 % 2
//        //              1
//
//        System.out.println(a); // 2
//        System.out.println(b); // 2
//        System.out.println(c);  // 1



 //       ----------------------------------------------------------
 //       Analyze each step, What is the result numOne, numTwo, and biggest?
//        int numOne = 10;
//        int numTwo = numOne++ * 3 + ++numOne + numOne++ % 2;
        //                10 * 3 + 12 + 12 % 2
                //           30 + 12 + 0
                //              42
//        int biggest = numOne > numTwo ? numOne : numTwo;
//
//        System.out.println(numOne);   // 13
//        System.out.println(numTwo);    // 42
//        System.out.println(biggest);   // numbertwo

//        ----------------------------------------------------------
//
//        If statements, multi branch, nested
//
//    [Character Checker]
//        Given a letter (char) determine if the character is an uppercase letter or lowercase letter
//        Ex: 'b' --> lowercase
//        'G' --> uppercase
//        'O' --> uppercase
//        Hint: Use the ASCII table

//        char letter = 'a';
//
//        if(letter >= 'a' && letter <= 'z'){
//            System.out.println("Lowercase");
//        }
//        else if(letter >= 'A' && letter <= 'Z'){
//            System.out.println("Uppercase letter");
//        }
//        else{
//            System.out.println("Invalid letter");
//        }




//   ----------------------------------------------------------------------------------------
//    [Pandemic Checker]
//        Write a program that will read a number from the user. This number will be a year. Use that
//        given year to figure out if there was a pandemic in that year, and if there was which one.
//
//        Data to use:
//        1346-1353: The Black Death
//        1665-1666: Great Plague of London
//        1770-1772: Russian plague
//        1889-1890: Flu pandemic
//        1916: American polio epidemic
//        1918-1920: Spanish Flu
//        2009-2010: H1N1 Swine Flu pandemic
//        2014-2016: West African Ebola epidemic
//        2020-2021: COVID-19
//        Less than 0 and more then 2021: Invalid year
//        Any year not in those ranges: No Pandemic

//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter a year");
//        int year = input.nextInt();
//
//        if(year >= 1346 && year <= 1353){
//            System.out.println("The Black Death");
//        }
//        else if(year >= 1665 && year <= 1666){
//            System.out.println("Great Plague of London");
//        }
//        else if(year >= 1770 && year <= 1772){
//            System.out.println("Russian plague");
//        }
//        else if(year >= 1889 && year <= 1890){
//            System.out.println("Flu pandemic");
//        }
//        else if(year == 1916){
//            System.out.println("American polio epidemic");
//        }
//        else if(year >= 1918 && year <= 1920){
//            System.out.println("Spanish Flu");
//        }
//        else if(year >= 2009 && year <= 2010){
//            System.out.println("H1N1 Swine Flu pandemic");
//        }
//        else if(year >= 2014 && year <= 2016){
//            System.out.println("West African Ebola epidemic");
//        }
//        else if(year >= 2020 && year <= 2021){
//            System.out.println("COVID-19");
//        }
//        else if(year <=0 || year > 2021){
//            System.out.println("Invalid year");
//        }
//        else {
//            System.out.println("No Pandemic");
//        }
     // ------------------------------------------------------------------------------------------------------

//    [Qualification For Army]
//        Given information: Citizenship(String), resident (boolean), and has high school diploma
//        (boolean), and age(int). Determine if the person is qualified to join the army.
//        - The person must be a Citizen of the USA or a resident
//                -> If not print: You must be a U.S. citizen or a resident
//        - Their age must be between 18 and 35
//    -> If not print: Your age must be between 18 to 35 years old
//        - They must have a high school diploma
//    -> If not print: You must have a high school diploma
//    > If all the criteria is met print: You are qualified for the US Army

//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter your status");
//        String citizenShip = input.next();
//        System.out.println("Enter resident or not?");
//        boolean resident = input.nextBoolean();
//        System.out.println("Did you study high school?");
//        boolean highSchools = input.nextBoolean();
//        System.out.println("Enter your age");
//        int age = input.nextInt();
//
//
//        if(citizenShip.equals("US") || resident){
//            if(age >= 18 && age <= 35){
//            }
//            else{
//                System.out.println("Your age must be between 18 to 35 years old");
//            }
//                if(highSchools){
//                    System.out.println("You are qualified for the US Army");
//                }
//                else{
//                    System.out.println("You must have a high school diploma");
//                }
//
//        }
//        else{
//            System.out.println("You must be a U.S. citizen or a resident");
//        }


// --------------------------------------------------------------------------------------------------------

//        [Salary Calculator]

//        Given the following information: hourly rate, weekly hours, and number of weeks. Check if all
//        the inputs are valid and then calculate the salary.
//                - hourly rate cannot be negative or zero
//              -> If invalid print: Hourly Rate cannot be Negative or Zero
//                - weekly hours cannot be zero, negative or more than 65
//              -> If invalid print: Weekly Hours cannot be less than 1 or greater than 65
//                - number of weeks cannot be less than 1 and more than 52
//              -> If invalid print: Number of weeks cannot be less than 1 or greater than 52
//        Equation: salary = hourly rate * weekly hours * number of weeks


//        int hourlyRate = 10;
//        int weeklyHours = 40;
//        int numberOfWeeks = 52;
//        double salary = hourlyRate * weeklyHours * numberOfWeeks;
//
//        if(hourlyRate >= 0){
//            if(weeklyHours >= 0 && weeklyHours <= 65){
//               if(numberOfWeeks > 0 && numberOfWeeks <= 52){
//                   System.out.println(salary);
//               }
//               else{
//                   System.out.println("Number of weeks cannot be less than 1 or greater than 52");
//               }
//            }
//            else{
//                System.out.println("Weekly Hours cannot be less than 1 or greater than 65");
//            }
//        }
//        else{
//            System.out.println("Hourly Rate cannot be Negative or Zero");
//        }



  // ----------------------------------------------------------------------------------------------------
//        Ternary
//
//      [Morning or Night]
//           Given some time value (int) in 24 hours format. Print if its the morning or night.
//           0 - 11 : Morning
//           12- 24 : Night
//     -> You can assume the value given is always valid (in the 24 hours range), but if you want a
//        challenge use an if to control invalid values

//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter hour ( 24 hours format )");
//        int hour = input.nextInt();
//
//        if(hour > 0 && hour <= 11){
//            System.out.println("Morning");
//        }
//        else if(hour >= 12 && hour <= 24){
//            System.out.println("Night");
//        }
//        else{
//            System.out.println("Invalid number");
//        }
//
//        String result = (hour > 0 && hour <= 11) ? "Morning" :(hour >= 12 && hour <= 24)? "Night" : "Invalid number";
//        System.out.println(result);

    // ---------------------------------------------------------------------------------------------

//        Switch
//
//      [House Occupants]
//        Given a house type (String) print out the number of max occupants (int)
//        Tree house: 1
//        Mobile home: 2
//        Apartment: 4
//        Town house: 6
//        Villa: 8
//        Mansion: 10
//      -> Try to use variables instead of printing multiple times

//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter house type");
//        String houseType = input.nextLine();
//
//        int max = 0;
//
//        switch (houseType){
//            case "Tree house":
//                max = 1;
//                break;
//            case "Mobile home":
//                max = 2;
//                break;
//            case "Apartment":
//                max = 4;
//                break;
//            case "Town house":
//                max = 6;
//                break;
//            case "Villa":
//                max = 8;
//                break;
//            case "Mansion":
//                max = 10;
//                break;
//            default:
//                System.out.println("Invalid house");
//        }
//        System.out.println(houseType + " : " + max);


    //------------------------------------------------------------------------------------------------------
//     [Office Hours Schedule]
//
//        Given some Day(String) print out the office hours schedule for that day if there is office hours.
//        Monday, Tuesday, Wednesday:
//        Print: Office hours at 5:30 - 6:45 EST
//        Thursday:
//        Print: Soft Skills day
//        Friday:
//        Print: Day off
//        Saturday, Sunday:
//        Print: Already a long day, no office hours.
//        Any other String:
//        Print: Invalid day given

//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter a day");
//        String day = input.next();
//
//        switch (day){
//            case "Monday":
//            case "Tuesday":
//            case "Wednesday":
//                System.out.println("Office hours at 5:30 - 6:45 EST");
//                break;
//            case"Thursday":
//                System.out.println("Soft Skills day");
//                break;
//            case "Friday":
//                System.out.println("Day off");
//                break;
//            case "Saturday":
//            case "Sunday":
//                System.out.println("Already a long day, no office hours.");
//                break;
//            default:
//                System.out.println("Invalid day");
//    }

    // -------------------------------------------------------------------------------------------------------
//        [Grade level]
//
//        Given a grade level (byte) determine and print which school level someone is in.
//          1-5: Elementary school
//          6-8: Middle school
//          9-12: High school
//          13-16: College
//          17-18: Grad School
//          Other: Invalid grade level given

//        byte gradeLevel = 15;
//
//        if(gradeLevel >= 1 && gradeLevel <= 5) {
//            System.out.println("Elementary School");
//        }
//        else if(gradeLevel >= 6 && gradeLevel <= 8){
//            System.out.println("Middle School");
//        }
//        else if(gradeLevel >= 9 && gradeLevel <= 12){
//            System.out.println("High School");
//        }
//        else if(gradeLevel >= 13 && gradeLevel <= 16){
//            System.out.println("Collage");
//        }
//        else if(gradeLevel >= 17 && gradeLevel <= 18){
//            System.out.println("Grad School");
//        }
//        else{
//            System.out.println("Invalid grade level");
//        }

      //--------------------------------------------------------------------------------------------

//        Challenge:
//        Make an updated calculator, make it as flexible as possible with everything we
//        learned so far


//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter 2 numbers");
//        double num1 = input.nextDouble();
//        double num2 = input.nextDouble();
//        System.out.println("Calculate numbers");
//        char calculate = input.next().charAt(0);
//        double result = 0;
//
//        switch (calculate){
//            case '+':
//                result = num1 + num2;
//                break;
//            case '-':
//                result = num1 - num2;
//                break;
//            case '*':
//                result = num1 * num2;
//                break;
//            case '/':
//                result = num1 / num2;
//                break;
//            case '%':
//                result = num1 % num2;
//                break;
//            default:
//                System.out.println("Invalid number");
//        }
//        System.out.println(result);


    }
}
