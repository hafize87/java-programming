package day15_logicalops_switch_ternary;

public class UsedCarSelector {
    public static void main(String[] args) {
//        Car dealership:
//           budget = 5000
//           model -> "Toyota" , "Honda" ,"Tesla"
//           carPrice = 4500
//        using If condition with logical operators, decide if you would like
//        to purchase the car.
//     1 - needs to be within budget
//        AND
//     2 - needs to be "Toyota" OR "Honda" OR "Tesla"

        double budget = 5000;
        double carPrice = 4500;
        String model = "Honda";

        if(carPrice <= budget && (model.equals("Honda") || model.equals("Toyota") || model.equals("Tesla"))){
            System.out.println("I can take " + model);
        }
        else {
            System.out.println("I can not take it");
        }
    }
}
