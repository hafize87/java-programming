package day37_methods_overloading;

public class DaySelector {

    public static void main(String[] args){

        System.out.println(getDayName(1));   //  Monday
        System.out.println(getDayName(9));   //  Invalid - 9 null

        if(getDayName(2).equals("Monday")){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
        //  loop from 1 to 8 and call the getDayNmae with loop variable
        for (int i = 1; i <= 8; i++){
            System.out.println(i + " = " + getDayName(i));
        }

        //  store getDayName into variable, and print variable

        String day = getDayName(6);
        System.out.println(day);

        String someDay = getDayName(0);
        if(someDay == null){
            System.out.println("someDay is null for invalid day");
        }

        System.out.println(getDayNameV2(6));

    }

    public static String getDayName(int day){

        // 1 way
//        switch (day){
//            case 1:
//                return "Monday";
//              //  break;  --> unreachable code , because return already exits the method
//
//            case 2:
//                return "Tuesday";
//
//            case 3:
//                return "Wednesday";
//
//            case 4:
//                return "Thursday";
//
//            case 5:
//                return "Friday";
//
//            case 6:
//                return "Saturday";
//
//            case 7:
//                return "Sunday";
//
//            default:
//                return "Wrong number, please enter 1 to 7 number";

//        }

        // 2 way
        switch (day){
            case 1: return "Monday";
            case 2: return "Tuesday";
            case 3: return "Wednesday";
            case 4: return "Thursday";
            case 5: return "Friday";
            case 6: return "Saturday";
            case 7: return "Sunday";
            default:
                System.out.println("Invalid - " + day);
                return null;  // nothing , no object

        }

    }
    public static String getDayNameV2(int day){

        String dayName;
                switch (day){
            case 1:
                dayName=  "Monday";
            break;
             case 2:
               dayName = "Tuesday";
            break;
            case 3:
                dayName = "Wednesday";
            break;
            case 4:
                dayName = "Thursday";
            break;
            case 5:
                dayName = "Friday";
            break;
            case 6:
                dayName = "Saturday";
            break;
            case 7:
                dayName = "Sunday";

            default:
                System.out.println("Invalid - " + day);
                dayName = null;
        }
        return dayName;

    }
}
