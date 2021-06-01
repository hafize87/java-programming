package day18_conditions_practice_strings_intro;

public class CarLeasingTest {
    public static void main(String[] args) {

//        Make => Mercedes
//        Model =>  E
//                leasePrice = 500
//        Model => A
//                leasePrice = 400
//
//        Make => Audi
//        Model =>  SQ5
//                leasePrice = 552
//        Model => A3
//                leasePrice = 412

        String carName = "Mercedes";
        String  carModel = "B";
        double price =0;

        if(carName.equals("Mercedes")){
            if(carModel.equals("A")){
                price = 500;
            }
            else if(carModel.equals("B")){
                price = 400;
            }
            else{
                System.out.println("We don't have " + carModel);
            }
        }
        else if(carName.equals("Audi")){
            if(carModel.equals("SQ5")){
                price = 552;
            }
            else if(carModel.equals("A3")){
                price = 412;
            }
            else{
                System.out.println("We don't have " + carModel);
            }
        }
        else{
            System.out.println("We don't have " + carName);
        }

        System.out.println("carName = " + carName);
        System.out.println("carModel = " + carModel);
        System.out.println("price = " + price);
    }
}
