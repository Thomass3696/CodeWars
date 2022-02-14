package FibonacciTribonacciAndFriends;

import java.util.Arrays;

public class FibonacciTribonacciAndFriends {

    public static double[] xBonacci(double[] signature, int n) {

        System.out.println(signature.length + " " + n);

        double[] trib = new double[n];

        if (n < signature.length) {
            System.arraycopy(signature, 0, trib, 0, n);
            return trib;
        }



        System.arraycopy(signature, 0, trib, 0, signature.length);

        int x = signature.length;
        double curr = 0;

        for (int i = x; i < n; i++) {
            for (int j = 0; j < x+1; j++) {
                curr += trib[i-j];
            }
            trib[i] = curr;
            curr = 0;
        }

        return trib;

    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(xBonacci(new double[]{1, 1, 1, 1}, 10)));
    }

}
