package day47_constructors;

public class Address {

    private String street;
    private String city;
    private String state;
    private String zipCode;
    private String country = "USA";

    // constructor method - automatically called
    public Address() {
        System.out.println("Address constructor");

        street = "123 e unknown st";
        city = "java";
        state = "CG";
        zipCode = "3456";
    }

    //  second constructor method, overload constructor  --> provides shortcut to initialize variables
    // in the same statement :  ex : Address ad = new Address("123 w water st", "boston", "Ma", "123")

    public Address(String street, String city, String country, String zipCode ){

        this.street = street;
        setStreet("123 e river st");

    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;

        if(street.isEmpty() || street.length() > 50){
            System.out.println("Error: invalid street");
        }
        else{
          this.street = street;
        }
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }


    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return street + ", " + city + ", " + state + " " + zipCode;


    }
}
