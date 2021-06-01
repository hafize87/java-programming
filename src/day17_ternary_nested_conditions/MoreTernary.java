package day17_ternary_nested_conditions;

public class MoreTernary {
    public static void main(String[] args) {

        int hourlyRate = 50;

        String result = (hourlyRate>45)? "accept":"reject";
        System.out.println("result = " + result);



        String  todaysClass = "Java";
        String teacher = (todaysClass.equals("Java"))? "Saim | Murodil" : "Nadir";
        System.out.println("teacher = " + teacher);


        boolean isEligibleToDrive = true;
        String driving;
        driving = isEligibleToDrive? "Have DL and Can drive" : "No DL, cannot drive";
        System.out.println("driving = " + driving);
    }
}
