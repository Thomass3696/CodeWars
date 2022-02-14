package PrimesInNumbers;

import java.util.Arrays;
import java.util.HashMap;

public class PrimeDecomp {

    public static String factors (int n) {

        System.out.println(n);

        String result = "";

        HashMap<Integer, Integer> primes = new HashMap<>();

        // Print the number of 2s that divide n
        while (n % 2 == 0)
        {
            if (primes.containsKey(2)) {
                primes.put(2, primes.get(2) + 1);
            }
            else {
                primes.put(2, 1);
            }
            n /= 2;
        }

        // n must be odd at this point.  So we can
        // skip one element (Note i = i +2)
        for (int i = 3; i <= Math.sqrt(n); i += 2)
        {
            // While i divides n, print i and divide n
            while (n % i == 0)
            {
                if (primes.containsKey(i)) {
                    primes.put(i, primes.get(i) + 1);
                }
                else {
                    primes.put(i, 1);
                }
                n /= i;
            }
        }

        // This condition is to handle the case when
        // n is a prime number greater than 2
        if (n > 2) {
            if (primes.containsKey(n)) {
                primes.put(n, primes.get(n) + 1);
            }
            else {
                primes.put(n, 1);
            }
        }

        int[] sortingArr = new int[primes.size()];
        int count = 0;

        for (Integer integer : primes.keySet()) {
                sortingArr[count] = integer;
                count++;
        }

        Arrays.sort(sortingArr);

        for (int j : sortingArr) {
            if (primes.get(j) > 1) {
                result += "(" + j + "**" + primes.get(j) + ")";
            } else {
                result += "(" + j + ")";
            }
        }

        return result;

    }

    public static void main(String[] args) {
        System.out.println(factors(18195729));
    }

}
