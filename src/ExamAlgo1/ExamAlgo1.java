package ExamAlgo1;

import java.util.Arrays;

public class ExamAlgo1 {

//    arr[1, 1, 2, 2, 1, 3, 5, 1];
//    indexes of 3 unique smallest;
//    [0, 2, 5]


    public static int[] getSmallestUnique3Index (int[] nums) {

        int index1 = 0;
        int num1 = Integer.MAX_VALUE;

        int index2 = 0;
        int num2 = Integer.MAX_VALUE;

        int index3 = 0;
        int num3 = Integer.MAX_VALUE;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < num1) {
                num1 = nums[i];
                index1 = i;
            }
        }

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < num2 && nums[i] > num1) {
                num2 = nums[i];
                index2 = i;
            }
        }

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < num3 && nums[i] > num2) {
                num3 = nums[i];
                index3 = i;
            }
        }

        return new int[] {index1, index2, index3};

    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(getSmallestUnique3Index(new int[]{1, 1, 2, 2, 1, 3, 5, 1})));
    }

}
