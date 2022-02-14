package Snail;

import java.util.Arrays;

public class Snail {

    public static int[] snail(int[][] array) {

        if (array.length == 0 || array[0].length == 0) {
            return new int[] {};
        }

        int[] snail = new int[array.length * array[0].length];
        int currL = array.length;
        int row = 0;
        int col = 0;
        int num;
        int counter = 0;

        for (int i = 0; i < array.length * 2 - 1; i++) {
            i--;

            for (int j = 0; j < currL; j++) {
                num = array[row][col];
                snail[counter] = num;
                col++;
                counter++;
            }
            i++;
            currL--;
            col--;
            for (int j = 0; j < currL; j++) {
                row++;
                num = array[row][col];
                snail[counter] = num;
                counter++;
            }
            i++;
            for (int j = 0; j < currL; j++) {
                col--;
                num = array[row][col];
                snail[counter] = num;
                counter++;
            }
            i++;
            currL--;
            for (int j = 0; j < currL; j++) {
                row--;
                num = array[row][col];
                snail[counter] = num;
                counter++;
            }
            i++;
            col++;
        }

        return snail;

    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(snail(new int[][]{
                new int[]{1, 2, 3},
                new int[]{8, 9, 4},
                new int[]{7, 6, 5}
        })));
    }

}
