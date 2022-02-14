package SquareNSum;

public class SquareNSum {

    public static int squareSum(int[] n) {

        int sum = 0;

        for (int num : n) {
            sum += num*num;
        }

        return sum;

    }

}
