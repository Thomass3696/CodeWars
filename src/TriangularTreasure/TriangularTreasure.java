package TriangularTreasure;

public class TriangularTreasure {

    public static long triangular(long n) {

        if (n < 1) {
            return 0;
        }

        long count = 0;

        for (int i = 1; i < n+1; i++) {
            count += i;
        }

        return count;

    }

}
