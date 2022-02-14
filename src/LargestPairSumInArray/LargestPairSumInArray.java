package LargestPairSumInArray;

import java.util.Arrays;

public class LargestPairSumInArray {

    public static int largestPairSum(int[] numbers) {

        int counter = 0;
        int[] finalArr = new int[numbers.length];

        Arrays.sort(numbers);

        for (int i = finalArr.length-1; i >= 0; i--) {
            finalArr[counter] = numbers[i];
            counter++;
        }

        return finalArr[0] + finalArr[1];

    }

    public static void main(String[] args) {
        System.out.println(largestPairSum(new int[]{10, 14, 2, 23, 19}));
    }

}
