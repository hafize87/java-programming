package day42_arraylist;

import java.util.*;

public class UniqueFromList {

    public static void main(String[] args) {

        List<Integer> num1 = new ArrayList<>(Arrays.asList(2, 4, 4, 1, 5, 6, 0, 6));

        List<Integer> uniqueList1 = getUniqueList(num1);
        System.out.println("\nuniqueList : " + uniqueList1);

        System.out.println(getUniqueList(num1));


    }

    public static List<Integer> getUniqueList(List<Integer> nums) {
        List<Integer> uniqueList = new ArrayList<>();

        for (int each : nums) {

            // check if number appears only Once in the list
            if (Collections.frequency(nums, each) == 1) {

                // print that number
                System.out.print(each + " ");

                uniqueList.add(each);  // assigning to unique arraylist
            }

        }
        System.out.println();
        return uniqueList;
    }
}