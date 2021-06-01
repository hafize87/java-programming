package day18_conditions_practice_strings_intro;

public class SwitchSeasonFinder {
    public static void main(String[] args) {

//        Winter: 12,1,2
//        Spring: 3,4,5
//        Summer: 6,7,8
//        Fall:   9,10,11
//              when month = 2;
//        OUTPUT:
//        "Winter"
//               when month = 7;
//        OUTPUT:
//        "Summer"

        int month = 18;

        switch (month){
            case 12:
            case 1:
            case 2:
                System.out.println("Winter");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Spring");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Summer");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Fall");
                break;
            default:
                System.out.println("Invalid number");



        }
    }
}
