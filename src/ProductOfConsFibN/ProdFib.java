package ProductOfConsFibN;

import java.util.Arrays;

public class ProdFib {

    public static long[] productFib(long prod) {

        int count = 0;

        while (true) {

            if (fib(count) * fib(count + 1) == prod) {
                return new long[] {fib(count), fib(count + 1), 1};
            }
            if (fib(count) * fib(count + 1) > prod) {
                return new long[] {fib(count), fib(count + 1), 0};
            }

            count++;

        }

    }

    public static long fib(int n) {

        if (n == 0) { return 0; }
        if (n == 1) { return 1; }
        if (n == 2) { return 1; }

        long last = 0;

        long[] start = new long[]{0, 1, 1};
        long[] fibSeq = new long[n];

        fibSeq[0] = start[0];
        fibSeq[1] = start[1];
        fibSeq[2] = start[2];

        for (int i = 3; i < n; i++) {
            fibSeq[i] = fibSeq[i-1] + fibSeq[i-2];
            last = fibSeq[i];
        }

        return last;

    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(productFib(714)));
    }

}
