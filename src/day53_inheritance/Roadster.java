package day53_inheritance;

public class Roadster extends ElectricCar{


    public Roadster(String model, double price, int year, int range) {

     //   System.out.println("Welcome new Roadster!");  once super() constructur olmasi gerekiyor yoksa error verir

        super("Tesla", model, price, year, range);
        System.out.println("Welcome new Roadster!");
    }
}
