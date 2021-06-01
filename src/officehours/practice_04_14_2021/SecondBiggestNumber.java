package officehours.practice_04_14_2021;

public class SecondBiggestNumber {
    public static void main(String[] args) {

        int [] nums = {4,3,1,4,5,2,4,8,5,8};
        int max = nums[0];        // 8
        int secondMax = nums[0];  // 7

        for(int eachNum : nums) {

            if(eachNum > max){
                secondMax = max;
                max = eachNum;
            }

            if(eachNum > secondMax && eachNum < max){
                secondMax = eachNum;
            }

        }

        System.out.println("max: " + max);
        System.out.println("2nd max: " + secondMax);

    }
}
