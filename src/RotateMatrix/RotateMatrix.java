package RotateMatrix;

import java.util.Arrays;

public class RotateMatrix {

    public static int[][] rotateCounterclockwise(int[][] matrix, int times) {

        if (times % 4 == 0) { return matrix; }

        int row;

        int[][] rotatedArray = new int[matrix.length][matrix.length];

        for (int i = 0; i < times % 4; i++) {

            if (i > 0) {
                for (int j = 0; j < rotatedArray.length; j++) {
                    System.arraycopy(rotatedArray[j], 0, matrix[j], 0, rotatedArray.length);
                }
            }

            row = 0;

            for (int j = matrix.length-1; j >= 0; j--) {

                for (int k = 0; k < matrix.length; k++) {
                    rotatedArray[row][k] = matrix[k][j];
                }

                row++;

            }

        }

        return rotatedArray;

    }

    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(rotateCounterclockwise(new int[][]{
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        }, 5)));
    }

}
