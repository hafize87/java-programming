package day39_wrapper_classes;

public class AutoBoxingUnBoxing {
    public static void main(String[] args) {

        //autoboxing : primitive  --> wrapper class

        int num1 = 100;
        Integer num2 = num1;
        Integer num3 = 234;

        // un-boxing : object --> primitive

        Double d1 = new Double(3.5);
        double d2 = d1;
        double d3 = new Double(234.7);

    }
}
