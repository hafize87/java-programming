package mypractice;

import java.util.Arrays;

public class NNumber {

    public static void main(String[] args) {

        System.out.println(Arrays.toString(solution(8)));
    }


    public static int[] solution(int N){

        int[] result = new int[N];

        int sum = 0;

        for(int i=0; i < N-1; i++) {

            result[i] =i;

            sum += i;

        }

        result[N-1] = -sum;

        return result;

    }
}
