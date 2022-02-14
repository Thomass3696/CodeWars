package FinalExamAlgorithm;

import java.util.Arrays;

public class FinalExamAlgorithm {

    public static int[][] finalExamAlgorithm(int[][] arr) {

        if (arr == null || arr.length == 0) {
            return null;
        }

        for (int i = 0; i < arr.length; i++) {
            if (i % 2 != 0) {
                for (int j = 0; j < arr[i].length; j++) {
                    if (arr[i][j] % 2 == 0) {
                        arr[i][j] *= 2;
                    }
                }
            }
        }

        return arr;

    }

    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(finalExamAlgorithm(
                new int[][]{{1, 3, 6, 2}, {4, 5, 6, 1}, {3, 3, 1, 5}, {9, 0, 5, 2}})));
    }

}

