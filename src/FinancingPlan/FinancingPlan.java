package FinancingPlan;

import java.math.BigInteger;

public class FinancingPlan {

    public static BigInteger finance(int n) {

        long sum = 0;
        long x;
        long dec = 0;

        for (int i = 0; i < n + 1; i++) {

            x = 2L * i;

            for (int j = 0; j < n + 1 - dec; j++) {
                sum += x;
                x++;
            }

            dec++;

        }

        return BigInteger.valueOf(sum);

    }

    public static void main(String[] args) {
        System.out.println(finance(6));
    }

}
