package day12_conditional_statements;

public class ComparisonExamples {
    public static void main(String[] args) {

        int currentSpeed = 45;
        int speedLimit = 55;
        boolean isSpeeding = currentSpeed > speedLimit;

        System.out.println("Are you speeding? - " + isSpeeding );
        System.out.println("speedLimit = " + speedLimit);
        System.out.println("currentSpeed = " + currentSpeed);

        // 45 + 20 = 65
        currentSpeed += 20;  //65
        System.out.println("currentSpeed = " + currentSpeed);

        System.out.println("Are you speeding? - " + isSpeeding );
        System.out.println("speedLimit = " + speedLimit);
        System.out.println("currentSpeed = " + currentSpeed);

        double accountBalance = 250.25;
        double itemPrice = 100.99;
        System.out.println("Can i afford? - "  + (accountBalance > itemPrice) ); // deger vermeden direk print edersen
                                                                                // mutlaka parantez icine alman gerekiyor



        boolean canAfford = accountBalance > itemPrice;
        System.out.println("Can i afford? - " + canAfford);  // true

       // 250.25 - 100.99
        accountBalance -= itemPrice;
        boolean isBroke = accountBalance <= 0;
        System.out.println("Am i broke? - " + isBroke);





    }
}
