package mypractice;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static int refuel_times(ArrayList<Integer> deliveries,int max_fuel) {

        int div = 0;

        for(Integer each : deliveries){
            int num = new Integer(each);
            if(num >= max_fuel){
                div += num / max_fuel;
            }
            else{
                div += 1;
            }
        }


        return div;
    }

    // Do not touch below

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int fuel = in.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0; i < size; i++) {
            list.add(in.nextInt());
        }

        System.out.println(refuel_times(list, fuel));

    }


}
