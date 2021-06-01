package day29_nestedloop_arrays;

public class ArraysIntro {
    public static void main(String[] args) {

        int num = 10;  //  single variable

        int [] nums = new int[3];   // multiple variable icine 3 tane variable koyduk. ex: int a; , int b; , int c;
                                    // declare ettik. ama daha deger vermedik
        nums[0] = 5;
        nums[1] = 10;
        nums[2] = 7;
        //nums[3] = 100; //ArrayIndexOutOfBoundsException

        // print values of array
        System.out.println("value at index 0 = " + nums[0]);  // 5
        System.out.println("value at index 1 = " + nums[1]);  // 10
        System.out.println("value at index 2 = " + nums[2]);  // 7

        //we can also use int variable to specify index number
        int i = 0;
        System.out.println(nums[i]); // 5
        i++;
        System.out.println(nums[i]);  // 10

        //how to find out the size of the array.
        System.out.println("number of elements = " + nums.length);

        //store length of array into len variable

        // change

        nums[0] = 100;
        nums[1] = 300;
        nums[2] = nums[1];

        System.out.println("nums[0] = " + nums[0]);  // 100
        System.out.println("nums[1] = " + nums[1]);  //300
        System.out.println("nums[2] = " + nums[2]);  //300
    }
}
