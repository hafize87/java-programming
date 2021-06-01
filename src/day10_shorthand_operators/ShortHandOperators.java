package day10_shorthand_operators;

public class ShortHandOperators {
    public static void main(String[] args) {

        int cars = 10;
        System.out.println("cars in parking lot = " + cars);
        //cars = cars + 2;
        cars += 2;
        System.out.println("cars in parking lot = " + cars);
        cars += 5;
        System.out.println("cars in parking lot = " + cars);

        cars -= 6;
        System.out.println("cars in parking lot = " + cars);

        cars -= 1 ;
        System.out.println("cars in parking lot =" + cars);

        int electricCars = 13;
        System.out.println("electricCars = " + electricCars);

        cars += electricCars;
        System.out.println("cars = " + cars);
        
        String word = "Java";
        System.out.println("word = " + word);
        word =word + "programming";
        System.out.println("word = " + word);
        // add "is fun "
        word += " is fun";
        System.out.println("word = " + word);

        String selenium = " but \"selenium\" is more fun.";
        word += selenium;
        System.out.println("word = " + word);

        word += 123445;  // add 123445 to word (Concatenation)
        System.out.println("word = " + word);
        
        char letter = 'a';
        System.out.println("letter = " + letter);
        letter += 3;
        System.out.println("letter = " + letter);
         // add 'J'
        letter += 1;
        System.out.println("letter = " + letter);

        double parkingFee = 7.50;
        System.out.println("parkingFee = " + parkingFee);
// early bird fee is 50% off

        //parkingFee = parkingFee /2;
        parkingFee /= 2;
        System.out.println("parkingFee = " + parkingFee);

    }
}
