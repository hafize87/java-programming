package day18_conditions_practice_strings_intro;

import java.util.ArrayList;
import java.util.Arrays;

public class SwitchCheckNumbers {
    public static void main(String[] args) {


        ArrayList<Integer> numOne = new ArrayList<>();
        numOne.addAll(Arrays.asList(4,1,8,-42,2,10));
        ArrayList<Integer> numTwo = new ArrayList<>();

        for (int i = 0; i < numOne.size(); i++) {

        }
        for(int each : numOne)
            switch (each){

                case 1:
                    numTwo.add(1);
                case 5:
                    numTwo.add(50);
                    break;
                case 4:
                    break;
                case 8:
                    numTwo.remove(0);
                    break;
                case 10:
                case -42:
                    numTwo.add(1,0);
                    break;
                case 55:
                    numTwo.add(105);
                    break;
                case 2:
                    numTwo.add(20_000);
                    break;
                default:
                    numTwo.add(null);
            }

        System.out.println(numTwo);

//        int num1 = 20;
//        int num2 = 10;
//
//        switch(num1) {
//            case 10:
//                num1++;
//                num2+=10;
//                break;
//            case 20:
//                num1+=num2;
//                num2--;
//            case 30:
//                num1 = 0;
//                num2 -= 3;
//                break;
//        }
//        System.out.println("num1 = " + num1);     // 0
//        System.out.println("num2 = " + num2);   // 6
    }
}
