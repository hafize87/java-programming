package day13_conditional_statements;

public class IfWithBooleanVariable {
    public static void main(String[] args) {
        boolean isHungry = false;

        if(isHungry){
            System.out.println("I am hungry. I will go get something to eat");
        }
        else{
            System.out.println("I am not hungry , Lets keep coding java");
        }

        System.out.println("----------------------------------------------------------------");

        if(isHungry = true){
            System.out.println("I am hungry. I will go get something to eat");
        }
        else{
            System.out.println("I am not hungry , Lets keep coding java");
        }

        double price = 130.44;
        boolean isAffordable = price <= 200.0;
        if(isAffordable){
            System.out.println("I can afford it , lets buy!");
        }
        else{
            System.out.println("Too expensive , lets keep coding java");
        }
        System.out.println("---------------------------------------------------");

        //if it NOT remoteJob print "Sorry I am not interested"
        //otherwise, print "Sure I am interested, what is the interview process?"
        //if(isRemoteJob != true) {
        //if( isRemoteJob == false)
        boolean isRemoteJob = true;

        if(!(isRemoteJob)){
            System.out.println("Sorry am not interested");

        }else{
            System.out.println("Sure i am interested , what is the interview process");
        }

    }
}
