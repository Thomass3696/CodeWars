package TribonacciSequence;

import java.util.Arrays;

public class TribonacciSequence {

    public static double[] tribonacci(double[] s, int n) {

        for (double d : s) {
            System.out.println(d);
        }

        if (n == 0) { return new double[]{}; }

        if (n == 1) { return new double[]{s[0]}; }
        if (n == 2) { return new double[]{s[0], s[1]}; }
        if (n == 3) { return new double[]{s[0], s[1], s[2]}; }

        double[] trib = new double[n];
        trib[0] = s[0];
        trib[1] = s[1];
        trib[2] = s[2];

        for (int i = 3; i < n; i++) {
            trib[i] = trib[i-1] + trib[i-2] + trib[i-3];
        }

        return trib;

    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(tribonacci(new double[]{1, 1, 1}, 8)));
    }

}
