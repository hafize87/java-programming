package day35_methods_with_param;

public class Email {
    public static void main(String[] args) {

        buildEmail("Hafize", "gmail");
        buildEmail("kemal", "sonoranschools");
        buildEmail("jonh ward III", "Verizon");


    }

    public static void buildEmail(String name, String domain){

        //String email = name + "@" + domain + ".com";

        name = name.replace(" ", "_").toLowerCase();
        domain = domain.toLowerCase();

        System.out.println(name + "@" + domain +".com");

    }
}
