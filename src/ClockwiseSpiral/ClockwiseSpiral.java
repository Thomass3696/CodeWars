package ClockwiseSpiral;

import java.util.Arrays;

public class ClockwiseSpiral {

    public static int[][] createSpiral(int n) {

        System.out.println(n);

        if (n < 1) {
            return new int[][]{};
        }

        int[][] spiral = new int[n][n];
        int currL = n;
        int row = 0;
        int col = 0;
        int num = 1;

        for (int i = 0; i < n*2-1; i++) {
            i--;

            for (int j = 0; j < currL; j++) {
                spiral[row][col] = num;
                num++;
                col++;
            }
            i++;
            currL--;
            col--;
            for (int j = 0; j < currL; j++) {
                row++;
                spiral[row][col] = num;
                num++;
            }
            i++;
            for (int j = 0; j < currL; j++) {
                col--;
                spiral[row][col] = num;
                num++;
            }
            i++;
            currL--;
            for (int j = 0; j < currL; j++) {
                row--;
                spiral[row][col] = num;
                num++;
            }
            i++;
            col++;
        }

        if (n % 2 != 0) {
            spiral[n/2][n/2] = n*n;
        }

        return spiral;

    }

    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(createSpiral(21)));
    }

}
