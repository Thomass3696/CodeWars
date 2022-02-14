package NumbersAndItsReversalHavingSamePrimeFactors;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SamePrimeFactors {

    public static Object[] sameFactRev(int nMax) {

        List<Integer> sameFacts = new ArrayList<>();

        String strN;
        String strR;

        for (int i = 1080; i < nMax; i++) {

            strN = String.valueOf(i);
            strR = "";

            for (int j = strN.length()-1; j >= 0; j--) {
                strR += String.valueOf(strN.charAt(j));
            }

            if (!strN.equals(strR) && Arrays.equals(getPrimeNumbers(Integer.parseInt(strN)), getPrimeNumbers(Integer.parseInt(strR)))) {
                sameFacts.add(i);
            }

        }

        return sameFacts.toArray();

    }

    public static Object[] getPrimeNumbers(int n) {

        List<Integer> primes = new ArrayList<>();

        // Print the number of 2s that divide n
        while (n%2==0)
        {
            primes.add(2);
            n /= 2;
        }

        // n must be odd at this point.  So we can
        // skip one element (Note i = i +2)
        for (int i = 3; i <= Math.sqrt(n); i+= 2)
        {
            // While i divides n, print i and divide n
            while (n%i == 0)
            {
                primes.add(i);
                n /= i;
            }
        }

        // This condition is to handle the case when
        // n is a prime number greater than 2
        if (n > 2) {
            primes.add(n);
        }

        return primes.stream().distinct().toArray();

    }

    public static void main(String[] args) {

        System.out.println(Arrays.toString(getPrimeNumbers(86240)));
//        System.out.println(Arrays.toString(sameFactRev(2500)));
    }

}
