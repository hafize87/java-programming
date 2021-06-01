package day36_methods_with_return;
import java.util.*;
public class Info {

    public static void main (String [] args){

        //  fullName()   ---> ERROR VERMIYOR ama hic bisey cikartmiyo
        System.out.println("Full name = " + fullName());
        System.out.println("Is married= " + isMarried());
        System.out.println("Age= " + getAge());
        System.out.println("Random year = " + getRandomYear());  // dynamic different year each time

        String name = fullName();
        boolean married = isMarried();
        int age = getAge();
        int year = getRandomYear();
        System.out.println("name = " + name);
        System.out.println("married = " + married);
        System.out.println("age = " + age);
        System.out.println("year = " + year);

        if(isMarried()){
            System.out.println("married");
        }
        else{
            System.out.println("not married");
        }

    }

    public static String fullName(){
       // System.out.println("inside fullname method");
        return "Hafize Aksoy";

    }
    public static boolean isMarried(){

        return true;
    }

    public static int getAge(){
        int age = 34;
        return age;

    }
    public static int getRandomYear(){
        Random random = new Random();
        int randomYear = random.nextInt(2021);
        return randomYear;
    }
}
