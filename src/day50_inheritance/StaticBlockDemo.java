package day50_inheritance;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StaticBlockDemo {


    static int num;
    static List<String> carModels;

    static{

        System.out.println("static initializer block");

        num = 10;
        carModels = new ArrayList<>();
        carModels.addAll(Arrays.asList("Nissan", "audi", "volvo"));
    }



    {   // initializer block --> runs each time object created, before constructor

        System.out.println("Initializer block");
    }



    public StaticBlockDemo(){

        System.out.println("Constructor method");

        num += 5;
    }

    public StaticBlockDemo(int value){

        System.out.println("overloaded constructor - value = " + value);

        num += value;
    }

    // other methods that use the carModels arraylist
}
