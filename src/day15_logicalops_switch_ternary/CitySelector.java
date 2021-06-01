package day15_logicalops_switch_ternary;

public class CitySelector {
    public static void main(String[] args) {

        String city1 = "Duzce";


        if(city1.equals("Duzce") || city1.equals("Ordu")){
            System.out.println("Willing to relocate to " + city1);
        }
        else{
            System.out.println("Not considering - " + city1);
        }


//        String teacher = "Nadir";
//
//        if(teacher.equals("Saim") || teacher.equals("Murodil")){
//            System.out.println("It is a java class with " + teacher);
//        }
//        else{
//            System.out.println("Softskill class with " + teacher);
//        }

        String teacher = "Hafize";

        if(teacher.equals("Saim") || teacher.equals("Murodil")){
            System.out.println("It is a java class with " + teacher);
        }
        else if(teacher.equals("Nadir")){
            System.out.println("Softskill class with " + teacher);
        }
        else{
            System.out.println("some other class with " + teacher);
        }


            // company - "Google", salary >= 100k
        String company = "Google";
        double salary = 75_000.0;

        if(company.equals("Google") || salary >= 100_000){
            System.out.println("Accept offer from " + company);
        }
        else{
            System.out.println("Rejecting offer from " + company);
        }
    }
}
