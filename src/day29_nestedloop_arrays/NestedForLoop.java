package day29_nestedloop_arrays;

public class NestedForLoop {
    public static void main(String[] args) {


        for(int minute =1; minute<=5; minute++){
            System.out.println("\nminute = " + minute);
            for (int second = 1; second<=60; second++){
                System.out.print(second + " ");
            }
        }

        System.out.println();

        /**
         * 0:1
         * 0:2
         * 0:59
         * 1:0
         * 1:1
         * 1:2
         * .......
         */

        for(int minute = 0; minute<=4; minute++){
            for (int second = 0; second <= 59; second++){
                System.out.println(minute + ":" + second);
            }
        }
    }
}
