package day16_switch_ternary;

public class CappuccinoBuyer {
    public static void main(String[] args) {

        // size could be "tall", "grade", "venti"

       String caseSize = "tall";
        double price = 0;
        int calories = 0;

        switch (caseSize){
            case"Tall":
                System.out.println("Tall cappuccino please");
                price = 3.69;
                calories = 90;
                break;
            case "Grande":
                System.out.println("Grande cappuccino please");
                price = 3.99;
                calories = 120;
                break;
            case"Venti":
                System.out.println("Venti cappuccino please");
                price = 4.99;
                calories =150;
                break;

        }
        System.out.println("Total price: $" + price);
        System.out.println("You will consume " + calories + " cal of energy.");
    }
}
