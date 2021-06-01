package day19_class_vs_object_string;

public class StringComparison {
    public static void main(String[] args) {

        String city = "Tucson";
       // EQUALS() method -  CASE SENSITIVE

        System.out.println(city.equals("Tucson"));  // true
        System.out.println(city.equals("tucson"));  // false
        System.out.println(city.equals("Tucson "));  // false


        // EQUALSIGNORECASE() method - case insensitive

        System.out.println(city.equalsIgnoreCase("tucson"));  //true
        System.out.println(city.equalsIgnoreCase("TUCSON"));  //true
        System.out.println(city.equalsIgnoreCase("tuccson"));  // false
        System.out.println(city.equalsIgnoreCase("tuc son"));  // false

        if(city.equals("TUCSON")){
            System.out.println("equals() true");
        }
        else{
            System.out.println("equals() false");     // true
        }

        if (city.equalsIgnoreCase("TUCSON")){
            System.out.println("equalsIgnoreCase() true");      //true
        }
        else{
            System.out.println("equalsIgnoreCase() false");
        }

    }
}
