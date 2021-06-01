package day41_arraylist;

import java.util.ArrayList;
import java.util.List;

public class UpdatingArrayList {
    public static void main(String[] args) {

        // cars list
        List<String> myCars = new ArrayList<>();

        myCars.add("toyota");
        myCars.add("mazda");
        myCars.add("ford");
        myCars.add("moskvich");
        myCars.add("tesla");
        myCars.add(0, "jeep");
        myCars.add(1, "lada");
        myCars.add(2, "yugo");

        System.out.println(myCars.toString());   // print all cars --> [jeep, lada, yugo, toyota, mazda, ford, moskvich, tesla]

        String allCarsIn1St = myCars.toString(); // saves all cars in 1 string variable "[jeep, lada, yugo, toyota, mazda, ford, moskvich, tesla]"

        System.out.println(allCarsIn1St);  // 1 string variable;

        // change index 0 to "lamborghini"

        myCars.set(0, "lamborghini");

        System.out.println("After set: " + myCars.toString());

        // change index 4 to honda
        myCars.set(4,"honda");

        System.out.println("Afters set honda: " + myCars.toString());

        // how would you do that if myCars was array:
        // myCars[4] = "honda"


        // find the index number of "ford"

//        String str = "java";
//        str.indexOf("v"); --> 2

        System.out.println("index of ford = " + myCars.indexOf("ford"));  // 5
        int moskvichIndex = myCars.indexOf("moskvich");

        System.out.println(moskvichIndex);  // 6

        // change moskvich to jiguli

        myCars.set(moskvichIndex, "jiguli");

        System.out.println("after set to jiguli : " + myCars);

        // replace ford with trabant using single statement:
        // indexOf("ford"), "traban"

        myCars.set(myCars.indexOf("ford"), "traban");

        System.out.println("After set to trabant: " + myCars);

        // lada --> bugatti
        // "lada" var mi yok mu ona bakiyoruz

        if(myCars.contains("lada")){
          myCars.set(myCars.indexOf("lada"), "bugatti");
        }
        else{
            System.out.println("lada is not found");
        }
        System.out.println("after set bugatti = " + myCars);

        // lamborghini --> prius
        // toyota --> lexus
        // traban --> audi

        for(int i = 0; i<myCars.size(); i++){
            if(myCars.get(i).equals("lamborghini")){
                myCars.set(i,"prius");
            }
            else if(myCars.get(i).equals("toyota")){
                myCars.set(i, "lexus");
            }
            else if(myCars.get(i).equals("traban")){
                myCars.set(i, "audi");
            }
        }
        System.out.println("after loop: " + myCars);



    }
}
