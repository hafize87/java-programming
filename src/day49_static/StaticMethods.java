package day49_static;

public class StaticMethods {


    int num = 10;
    static int count = 5;


    public static void displayMessage(String message) {

        System.out.println("message " + message);
  //      System.out.println("num " + num);   // ERROR num is instance variable. Static cannot access
        System.out.println("count " + count);  // NO ERROR. count is static variable

    }

    public static void otherStaticMethod(){

        System.out.println("Other static method");
        displayMessage("wooden spoon");
    }


    // StaticMethods.instanceMethod();   -->  NO
    // StaticMethods stm = new StaticMethods();
    // stm.StaticMethods();
    public void instanceMethod(){

        System.out.println("instance method");
        System.out.println("num " + num);
        System.out.println("count " + count);
        displayMessage("Hello from instance method");
    }

}
