package officehours.practice_06_14_2021;

public class Twix extends Candy{


//    Create a class Twix [Child class]
//
//            * Inherits Candy class
//
//    * constructor that invokes the parent constructor
//
//    * extra: static hiding, final, sub class
//
//    Create a class CandyFactory [ No inheritance with Candy classes ]
//
//    This class is to create objects of Candy, Take5, Twix and see how they are working



    public Twix(int quantity, boolean hasPeanuts) {

        super("Mars", quantity, hasPeanuts);

    }
}
