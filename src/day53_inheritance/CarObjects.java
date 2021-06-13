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
            System.out.println("purchasing " + electricCar1.toString());
        }


        System.out.println(ElectricCar.getCount());

        ElectricCar ec2 = new ElectricCar("Tesla", "Cybertek", 59900, 2022, 300);

        System.out.println(ec2.toString());
        System.out.println("Count " + ec2.getCount());   // call static method using object
        System.out.println("Count " + ElectricCar.getCount());   // call static method using className

        Roadster roadster = new Roadster("Roadster", 200000, 2022, 620);
        System.out.println(roadster.toString());
        roadster.drive(1000);
        roadster.drive(600);
        System.out.println(roadster.getCount());     // static method is inherited


        ModelX modelX = new ModelX("Tesla", "Model X", 89990.0, 2021, 360);
        System.out.println(modelX.toString());
        modelX.drive(10);
        System.out.println("Having lunch..");
        modelX.drive(10);
        System.out.println("Range remaining : " + modelX.getRange());
        System.out.println("Total electric cars count : " + ElectricCar.getCount());


    }
}
