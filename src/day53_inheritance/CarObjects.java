package day53_inheritance;

public class CarObjects {
    public static void main(String[] args) {

        ElectricCar electricCar1 = new ElectricCar("Tesla","Model Y", 48190.0, 2021, 326);

        electricCar1.drive(50);
        System.out.println(electricCar1);

        // System.out.println(electricCar1.make);  ERROR make is private
        // System.out.println(ElectricCar.make);  ERROR make needs to be public static

        System.out.println(electricCar1.getMake());
        System.out.println(electricCar1.getModel());
        System.out.println(electricCar1.getPrice());
        System.out.println(electricCar1.getRange());
        System.out.println(electricCar1.getYear());

        if(electricCar1.getPrice() > 10000){
            System.out.println(electricCar1.getMake() + " - " + electricCar1.getModel() + " is out of my budget");
        }
        else{
            System.out.println("purching " + electricCar1.getMake());
        }
    }
}
