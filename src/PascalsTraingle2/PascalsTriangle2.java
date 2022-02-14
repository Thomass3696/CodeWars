package PascalsTraingle2;

import java.util.Arrays;

public class PascalsTriangle2 {

    public static int[][] pascal(int depth) {

        int[][] finalArr = new int[depth][];

        for (int i = 0; i < depth ; i++) {
            if (i == 0) {
                finalArr[i] = new int[]{1};
            }
            if (i == 1) {
                finalArr[i] = new int[]{1, 1};
            }
            if (i > 1) {
                finalArr[i] = new int[i+1];
                finalArr[i][0] = 1;
                finalArr[i][i] = 1;
                for (int j = 1; j < i; j++) {
                    finalArr[i][j] = finalArr[i-1][j-1] + finalArr[i-1][j];
                }
            }
        }

        return finalArr;

    }

    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(pascal(1)));
    }

}
