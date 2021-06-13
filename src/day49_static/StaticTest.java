package day49_static;

public class StaticTest {
    public static void main(String[] args) {



        StaticMethods.displayMessage("wooden spoon");


        StaticMethods stm = new StaticMethods();
        stm.instanceMethod();
        stm.displayMessage("hi");

    }
}
