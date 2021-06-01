package day12_conditional_statements;

public class IfElseStatement {
    public static void main(String[] args) {

        if(10 > 5){
            System.out.println("Condition is true");
        }
        else {
            System.out.println("Condition is false");
        }

        //check if count is more than 30. if yes, print "Count is more than 30"
        // otherwise print "Count is less than 30"
        int count = 25;
        if(25 > 30){
            System.out.println("Count is more than 30");
        }
        else{
            System.out.println("Count is less than 30");
        }



        byte age = 25;
        if (age >= 18) {
            System.out.println("Eligible to vote");
            System.out.println("Age is greater or equal to 18");
        }
        else{
            System.out.println("Eligible to vote");
            System.out.println("Age is less than 18");
        }
    }

}
