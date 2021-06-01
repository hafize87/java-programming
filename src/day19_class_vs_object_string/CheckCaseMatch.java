package day19_class_vs_object_string;

public class CheckCaseMatch {
    public static void main(String[] args) {

        String countyCode = "UsA";

        //    UsA      ==       UsA  convert   USA       ====> ikicide convert to countrycode u buyuk haflerle yazdir diyor
        if(countyCode.equals(countyCode.toUpperCase())){
            System.out.println("Case is correct");
        }
        else{
            System.out.println("Case is not correct");
        }


    }
}
