package day46_encapsulation;

public class Dealership {
    public static void main(String[] args) {

        Car car1 = new Car();

        // ERROR below, model and year are PRIVATE and
       // car1.year = "Nissan Altima";
        //car1.mileage = 2020;

        car1.setModel("Nissan Altima");
        System.out.println("car1 model " + car1.getModel());

        car1.setYear(2020);
        System.out.println("car1 year " + car1.getYear());

        car1.setMileage(123456);
        System.out.println("car1 mileage " + car1.getMileage());
        System.out.println(car1.toString());

        System.out.println(car1);  // automatically calls toString

        Car alfaRomeo = new Car();

        alfaRomeo.setModel("AWD");
        alfaRomeo.setYear(2022);
        alfaRomeo.setMileage(456);
        System.out.println("Model " + alfaRomeo.getModel());
        System.out.println("Year " + alfaRomeo.getYear());
        System.out.println("Mileage " + alfaRomeo.getMileage());
        System.out.println(alfaRomeo);
    }
}
