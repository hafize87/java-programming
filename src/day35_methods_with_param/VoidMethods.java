package day35_methods_with_param;

public class VoidMethods {
    public static void main(String[] args) {

        printAtoZ();
        for (int i = 0; i < 10 ; i++) {
           printAtoZ();
        }

        displayUSAFlag();
        displayUSAFlag();
    }

    public static void printAtoZ(){

        // 1. way "A-Z"

//        for (int i = 'A'; i < 'Z' ; i++) {
//            System.out.print((char) i + " ");
//        }

        // 2. way "A-Z"
        for (char i = 'A'; i <'Z' ; i++) {
            System.out.print(i + " ");

        }
    }

    public static void displayUSAFlag(){

        System.out.println("\n-------------FLAG OF USA---------------");
        String p1 = "* * * * * * ==================================\n * * * * *  ==================================";
        String p2 = "==============================================";
        for (int i = 0; i < 4; i++) {
            System.out.println(p1);
        }
        System.out.println("* * * * * * ==================================");
        for (int i = 0; i < 6; i++) {
            System.out.println(p2);
        }


    }

}
