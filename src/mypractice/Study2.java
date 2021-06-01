package mypractice;

import java.util.Arrays;
import java.util.Scanner;

public class Study2 {
    public static void main(String[] args) {

//
//        Scanner scan = new Scanner(System.in);
//        int size = scan.nextInt();
//        int[] nums = new int[size];
//        for(int i =0; i < size; i++) {
//            nums[i] = scan.nextInt();
//        }
//        //WRITE YOUR CODE HERE
//
//        int[] num = new int[(size*2)];
//
//        num [num.length-1] = nums[nums.length-1];
//
//        System.out.print(Arrays.toString(num));

//
//        Scanner scan = new Scanner(System.in);
//        int size = scan.nextInt();
//        int[] num = new int[size];
//        for(int i =0; i < size; i++) {
//            num[i] = scan.nextInt();
//        }


//        int[] nums = new int[2];
//        if(size <= 1 ){
//            System.out.println(Arrays.toString(num));
//        }else{
//            nums[0] = num[0];
//            nums[1] = num[1];
//            System.out.println(Arrays.toString(nums));
//        }


//        Scanner input = new Scanner(System.in);
//        int[] nums = {input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};
//
//        //TODO: Write your code below
//
//        int count = 0;
//        for(int each : nums){
//            if(each % 2 == 0){
//                count++;
//            }
//        }
//        System.out.println(count);


//        Scanner input = new Scanner(System.in);
//        int[] nums = {input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};
//
//        //TODO Type your code below:
//      int count = 0;
//       for(int i = 0; i<nums.length-1; i++){
//           if(nums[i] == 5 && nums[i+1] == 5){
//               count++;
//           }
//       }
//       if(count >= 1){
//           System.out.println("true");
//       }
//       else{
//           System.out.println("false");
//       }


//        Scanner input = new Scanner(System.in);
//        String[] words = {input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine()};
//
//        // leave above code alone :)
//        // assume you have String array of 5 items
//        //and print first and last char of each items in one line
//
//        //TODO: Write your code below
//
//        for(String each:words){
//            System.out.println("" + each.charAt(0) + each.charAt(each.length() - 1));
//        }


//        Scanner input = new Scanner(System.in);
//        String[] arr = new String[5];
//        for (int i=0;i<5;i++)
//        {
//            arr[i] = input.nextLine();
//        }
//        //leave above alone!  write your code below.
//        //Create another loop for your solution!
//
//        for(String each : arr){
//            System.out.println(each.substring(0, 3));
//        }

//
//        Scanner input = new Scanner(System.in);
//        String[] words = new String[5];
//        for(int i = 0; i < 5;  i++) {
//
//            words[i] = input.nextLine();
//
//        }
//
//        //write your code below
//
//        String longest = words[0];
//
//        for(String each : words){
//            if(each.length() > longest.length()){
//                longest = each;
//            }
//        }
//        System.out.println(longest);

//
//        Scanner scan = new Scanner(System.in);
//        String[] str = {scan.next(), scan.next(), scan.next(),
//                scan.next(), scan.next(), scan.next()};

        // Do not touch above


//                String shorter = str[0];
//
//        for(String each : str){
//            if(each.length() < shorter.length()){
//                shorter = each;
//            }
//        }
//        System.out.println(shorter);


//
//        Scanner input = new Scanner(System.in);
//        String[] arr = new String[8];
//        for (int i=0;i<8;i++)
//        {
//            arr[i] = input.nextLine();
//        }
//
//        // DO NOT TOUCH ABOVE
//
//        for(int i = 0; i< arr.length; i++){
//
//            if()
//            System.out.println(arr[i] + " , " + arr[i+1]);
//        }


//        int[] nums = {1,2,3,4,5,6,7};
//
//        //TODO: write your code below
//
//
//        for (int i = 0; i < nums.length/2 ; i++) {
//
//             int temp = nums[i];
//              nums[i] = nums [nums.length-1-i];
//              nums [nums.length-1-i] = temp;
//        }
//
//
//
//        //Do not change below statement:
//        System.out.println(Arrays.toString(nums));


//        Scanner input = new Scanner(System.in);
//        String[] arr = new String[6];
//        for (int i=0;i<6;i++)
//        {
//            arr[i] = input.nextLine();
//        }
//        // DO NOT TOUCH ABOVE
//        for(int i = 0; i < arr.length-2; i++){
//            System.out.println(arr[i] + ", " + arr[i+1] + ", " + arr[i+2]);
//        }


        // ---------------------------------------------------
//
//       String [] words = {"hello", "why", "by", "apple" , "note"};
//
//        String [] ch = new String[words.length];
//
//
//
//       for(int i = 0; i<words.length; i++){
//           ch[i]= words[i].charAt(0)+ "" + words[i].charAt(words[i].length()-1);
//       }
//        System.out.println(Arrays.toString(ch));

        //---------------------------------------------------------------

//        String str = "olive, fish, pursuit, old, warning, python, java, coffee, cat, ray";
//
//
//        String [] strArray = str.split(", ");
//
//        int shorter = strArray[0].length();
//
//        for(int i = 0; i < strArray.length; i++) {
//            if (strArray[i].length() < shorter) {
//                shorter = strArray[i].length();
//            }
//        }
//            String shortletter = "";
//            for (int j = 0; j< strArray.length; j++ ) {
//                if (shorter == strArray[j].length()) {
//                    shortletter += strArray[j] + " ";
//                }
//            }
//
//           String [] lastArray = shortletter.split(" ");Arrays.sort(lastArray);
//          System.out.println(Arrays.toString(lastArray));

//        Scanner scan = new Scanner(System.in);
//        int size = scan.nextInt();
//        int[] nums = new int[size];
//        for(int i = 0; i < size; i++){
//            nums[i] = scan.nextInt();
//        }
//        //WRITE YOUR CODE HERE
//
//        int [] newArray = new int[size];
//
//        for(int i = 0; i< size-1; i++){
//            newArray[i] = nums[i + 1];
//        }
//        newArray[size-1] = nums[0];
//
//        System.out.println(Arrays.toString(newArray));
//

//

        String sen = "java is fun";

        String [] arraySe = sen.split(" ");

        String reverse = "";
        for(int i = arraySe.length-1; i>=0; i--){
            reverse += arraySe[i] + " ";
        }

        System.out.println(reverse.trim());

    }
}