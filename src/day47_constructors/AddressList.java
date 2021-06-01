package day47_constructors;

public class AddressList {
    public static void main(String[] args) {

        Address myAddress = new Address();

        myAddress.setStreet("2537 W Cezanne Cir");
       // System.out.println(myAddress.getStreet());

        myAddress.setState("Arizona");
        // System.out.println(myAddress.getState());


        myAddress.setCity("Tucson");
        //System.out.println(myAddress.getCity());



        myAddress.setZipCode("85741");
       // System.out.println(myAddress.getZipCode());


        System.out.println("myAddress = " + myAddress.toString());

        myAddress.setStreet("11 e orange grove rd");

        System.out.println("myAddress = " + myAddress.toString());

        Address newAddress = new Address(); // calling constructor

        newAddress.setStreet("234 e count st");
        newAddress.setCountry("Melon");
        newAddress.setState("az");
        newAddress.setZipCode("2345");

        System.out.println(newAddress);


        Address papaJon = new Address("8354 e count st", "Vienna","VA", "23344");

    }
}
