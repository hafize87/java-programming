package day48_constructors_static;

public class BusObjects {
    public static void main(String[] args) {

        Bus bus1 = new Bus();

        bus1.driver = new Driver("Mike");
        bus1.engine = new Engine(12);

        System.out.println(bus1.toString());

        Bus bus2 = new Bus();
        bus2.driver = new Driver("John");
        bus2.engine = new Engine(345);

        System.out.println(bus2);

        // print driver name of bus2
        System.out.println(bus2.driver.getName());


    }
}
