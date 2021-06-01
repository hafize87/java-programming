package day16_switch_ternary;

public class ApartmentLease {
    public static void main(String[] args) {

        // numberOfBedrooms = 0,1,2;

        int numberOfBedrooms = 3;
        double startingPrice = 0;

        System.out.println("#### WELCOME TO ADAIRE APARTMENTS ####");
        switch (numberOfBedrooms){
            case 0:
                System.out.println("Studio apartment selected");
                startingPrice = 1454;
                break;
            case 1:
                System.out.println("One apartment selected");
                startingPrice = 1725;
                break;
            case 2:
                System.out.println("Two apartment selected");
                startingPrice = 2899;
                break;
            default:
                System.out.println(numberOfBedrooms + " bedroom currently unavailable");
        }
        System.out.println("Starting price: $" + startingPrice);
    }
}
