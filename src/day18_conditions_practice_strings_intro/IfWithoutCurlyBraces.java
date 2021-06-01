package day18_conditions_practice_strings_intro;

public class IfWithoutCurlyBraces {
    public static void main(String[] args) {

        String todayClass = "java";

        if(todayClass.equals("java"))
            System.out.println("Java is fun!");
            //System.out.println("Java is fun too");      NOT WORKING> JUST 1 statement olmasi gerekiyo.
        else
            System.out.println("Today is class " + todayClass);
            System.out.println("Love");

        System.out.println("---------------------------------");

        int a = 10;
        if(a == 1)
        System.out.println("a is 1");
        System.out.println("1 is a");

        System.out.println("---------------------------------------------");

        int a1 = 10;
        if (a1 == 1);   // BE CAREFULLY IF STATEMENT DAN SONRA (;) SEMI COLON KOYARSAN CONDITION DOGRU OLSUN OLMASSIN
                        // HEPSINI PRINT EDIYOR.
            System.out.println("a is 1");
            System.out.println("1 is a");

    }
}
