package day35_methods_with_param;

public class MethodsWithParams {
    public static void main(String[] args) {
        displayValue(15);
        displayValue(3);
        int count = 55;
        displayValue(count);  // num = count
        greetByName("Kemal");
        greetByName("baby");
        String name1 = "hafize";
        greetByName(name1);
    }

    public static void displayValue(int num){

        System.out.println("The value is " + num);
    }

    public static void greetByName(String name){


        System.out.println("Hello " + name + ", how are you today?");
    }

}
