package day38_methods;

public class ArrayUtilsTest {
    public static void main(String[] args) {

        int [] nums ={5, 2, 5 , 6};
        ArrayUtils.printArray(nums);

        ArrayUtils.printArray(new int[]{23, 45, 78, 3, 23});

        System.out.println(ArrayUtils.sum(new int [] {3,6,8,12}));  // 18
        int [] numbers = {3,54,1,3};
        System.out.println(ArrayUtils.sum(numbers));  // 61

        System.out.println(ArrayUtils.sum(nums));  // 18


        System.out.println(ArrayUtils.contains(new int[] {4,5,23,7}, 23));

        int[] arrays = {4,1,5,8};
        System.out.println(ArrayUtils.contains(arrays,5));
    }


}
