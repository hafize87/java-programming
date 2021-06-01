package day28_loops;

public class JavaCityCases {
    public static void main(String[] args) {

//        int totalCases = 0;
//        loop day = 1 till day 30
//
//        every day there are 200 new cases
//
//        every sunday(day % 7 == 0) there are 500 new cases
//
//        "day 1 - daily cases: 200"

//
//               --------------
//
//        print totalCases =

//    asuume every 7 number ---> sunday e tekabul ediyor. her pazar covid case 500 cogaliyo ama diger gunler 200 cogaliyo
        int covidCase = 0;

        for(int day = 1; day <= 30; day++){
            if(day % 7 == 0){
                covidCase += 500;
            }
            else{
                covidCase +=200;
            }
        }
        System.out.println(covidCase);
    }
}
