package day23_string_manipulation_while_loop;

public class ChainingStringMethods {
    public static void main(String[] args) {

        String word = "woo den sp oon";

        System.out.println(word.toUpperCase().toLowerCase().length());
        System.out.println(word.replace(" ", "").toUpperCase());

        // selenium.findElement(By.id("hi")).click();

        String city = "chicago";
                            //read 1st letter.makeUcase     +  read 2nd till last.make lowercase
        System.out.println(city.substring(0,1).toUpperCase() + city.substring(1));  //Chicago  ilk harfi buyuk yazdirdi

        String city1 = "ISTANBUL";

        String capitalized = (city.substring(0,1).toUpperCase() + city.substring(1).toLowerCase());
        System.out.println("city1 = " + city1);

        //.isEmpty().toUpperCase() Does not work since isEmpty is boolean
    }
}
