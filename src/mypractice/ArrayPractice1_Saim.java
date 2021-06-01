package mypractice;

public class ArrayPractice1_Saim {
    public static void main(String[] args) {

//         100 number array

//    1.Create an int array called numbers that has length of 100

//    2.Assign 1-100 to each index of the array.  Then use a for each loop to print out
//        all the elements of the array


//        int[] numbers = new int[100];
//
//        System.out.println(numbers.length);
//
//
//        for (int i = 0; i <numbers.length ; i++) {  // deger veriyoruz
//           numbers[i] =i+1;
//
//            System.out.println(numbers[i]);      // aslinda burada da print edebiliriz verdigimiz degerleri
//        }
//
//        for(int each : numbers){
//            System.out.println(each + " ");       // verilen degerleri tek tek cikariyoruz
//        }

        //---------------------------------------------------------------------------------------------------

//        Max and Min number from Array
//
//        •Write a program that can find the maximum number from any given int array
//
//        •Write a program that can find the minimum number from any given int array

//        int [] nums = {1, 7, 2, 5};
//
//        int max = nums[0];
//        int min = nums[0];
//        for(int eachNum : nums){
//
//            if(eachNum > max){
//                max = eachNum;
//            }
//           if (eachNum < min){
//             min = eachNum;
//            }
//
//        }
//        System.out.println(max);
//        System.out.println(min);


        // ----------------------------------------------------------------------

//        Average Number from Array
//
//        Given an int array calculate the average number
//
//        -> Make it flexible so it will work with any array size
//
//    Examples:
//        [1,2,3] -> average: 2
//        [10, 15, 5, 6] -> average: 9
//        [4, 5, 6, 7, 8, 10, 20, 30, 0] -> average: 10

//        int[] nums = {10, 15, 5, 6};
//        int total = 0;
//
//        for(int eachNum : nums){
//            total += eachNum;
//        }
//
//        System.out.println(total / nums.length);

        //-------------------------------------------------------------------------------------
//        Even and odd from array
//
//        Write a program that can count the even and odd number from an array of integers
//        Use for each to make it easier
//
//          Ex:
//            Input: [4,1,3,12,5]
//             Output:
//             Even:2
//             Odd: 3

//        int[] num = {4,1,3,12,5};
//        int count1 = 0;
//        int count2 = 0;
//
//        for(int eachNum : num){
//            if(eachNum % 2 == 0){
//                count1++;
//            }
//            else {
//                count2++;
//            }
//        }
//        System.out.println("even: " + count1);
//        System.out.println("odd: " + count2);


        //--------------------------------------------------------------------------------

//        Shortest and Longest words from String array
//
//    •Write a program that can return the shortest string element from a String array
//
//    •Write a program that can return the longest string element from a String array



//        String [] word = {"car", "desktop", "computer"};
//
//        int max = word[0].length();
//
//        String maxl = "";
//        String minl = "";
//
//        for(String each : word){
//            if(each.length() > max){
//                maxl = each;
//            }
//            else{
//                minl = each;
//            }
//
//        }
//        System.out.println(maxl);
//        System.out.println(minl);

        // diger versiyonu

        String [] word = {"hafize", "kemal", "alna", "ece" };
        String longest = word [0];
        String shorter = word [0];

        for(String each : word){
            if(each.length() > longest.length()){
                longest = each;
            }
            if(each.length() < shorter.length()){
                shorter = each;
            }
        }
        System.out.println(longest);
        System.out.println(shorter);




    }
}
