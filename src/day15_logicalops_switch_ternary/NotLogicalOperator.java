package day15_logicalops_switch_ternary;

public class NotLogicalOperator {
    public static void main(String[] args) {
        System.out.println("!true = " + (!true));       // false
        System.out.println("!false = " + (!false));      // true

        int age = 2;
        //check if age is not more than 7. print "need to set in child car seat"

        if(!(age >= 7)){
            System.out.println("Need to set in child car seat. age = " + age);
        }
        else {
            System.out.println("Can set normal set. age " + age);
        }

        boolean isSmokingAllowed = false;

        //  not + false --> true
        if(!isSmokingAllowed){
            System.out.println("Smoking is not now allowed here. Exit ");
        }
        else{
            System.out.println("This area is for smoking");
        }

        boolean isAffordable = true;
        //check its not affordable then print "item not affordable"

        if(!isAffordable){
            System.out.println("Item not affordable");
        }
        else{
            System.out.println("You can take item");
        }

        String env = "qa";
        if(!env.equals("qa")){
            System.out.println("In wrong environment for QA testing");
        }

        String carModel = "Tesla";
        // if its not Tesla , print "Not interested"

        if(!carModel.equals("tesla")){
            System.out.println("Not interested");
        }
        String secretPassword = "abc123";
        String inputPassword = "abc321";
        // if inputPassword IS NOT equals inputPassword: print "Incorrect password".
        if(!inputPassword.equals("abc123")){
            System.out.println("Incorrect password");
        }
        if(!inputPassword.equals(secretPassword)){
            System.out.println("Incorrect password");
        }



        if (inputPassword.equals("abc123")){
            System.out.println("Correct password");
        }
        else{
            System.out.println("Incorrect password");
        }

    }
}
