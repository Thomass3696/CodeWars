package OddTriangle;

import java.util.Arrays;

public class OddTriangle {

    public static long[] oddRow(int n) {

        long num = (long) n * (n-1) + 1;

        long[] row = new long[n];

        for (int i = 0; i < n; i++) {
            row[i] = num + 2L * i;
        }

        return row;

    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(oddRow(7541383)));
    }

}
