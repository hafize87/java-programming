package day20_string_manipulation;

public class StringContains {
    public static void main(String[] args) {

        String company = "Capital one";

        System.out.println(company.contains("i"));  // true
        System.out.println(company.contains("ital"));  //true
        System.out.println(company.contains("l o"));   //true
        System.out.println(company.contains("ai"));   // false

        // if company contain space , print "multiple words with company name"
        // else "single word company name"

        if(company.contains(" ")){
            System.out.println("multiple words with company name");
        }
        else{
            System.out.println("single word company name");
        }


        String etsyTitle = "Wooden spoon | Etsy";
        // check if " | " is in estyTitle

        if (etsyTitle.contains(" | ")){
            System.out.println("Pass - title check passed");
        }
        else{
            System.out.println("Fail - title check failed");
        }

        String firstName = "Hafize";
         if(firstName.contains("a") && firstName.contains("e")){
             System.out.println("First name has \"a\" and \"e\"");
         }
         else {
             System.out.println("First name doesn't have \"a\" and \"e\"");
         }


         firstName = "Nadir";
         if(firstName.contains("a") || firstName.contains("i")){
             System.out.println("First name have \"a\" or \"i\"");
         }
         else{
             System.out.println("First name doesn't have \"a\" or \"i\"");
         }

         String email = "hafize.teacher@gmail.com";

         if(email.contains("@") && email.endsWith(".com")){
             System.out.println("Email correct");
         }
         else{
             System.out.println("Not correct");
         }
    }
}
