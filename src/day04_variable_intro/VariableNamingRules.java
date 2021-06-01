package day04_variable_intro;

public class VariableNamingRules {
    public static void main(String[] args) {

        // int static = 22;  --> error, static is reserved by java

        int static2 = 22;
        int _static = 22;
        int $tatic = 44;
        int staticVar = 234;

        int salary$ = 55;
        // int 1stMonthSalary = 300; --> Error, cannot start with number

        int $ = 34;

        // int _ = 5; variable work fine , but not recommended

        int number_of_friends = 345; // It works but not convention
        int numberOfFriends = 345; // Good

          //  int 1stNum = 7;  CANNOT start with number
        int num1st = 4 ;  // good



    }
}
