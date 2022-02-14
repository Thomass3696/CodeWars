package TakeANumberAndSumItsDigitsRaised;

import java.util.ArrayList;
import java.util.List;

public class SumDigPower {

    public static List<Long> sumDigPow(long a, long b) {

        List<Long> nums = new ArrayList<>();

        String strN;

        long sum;

        for (long i = a; i < b; i++) {
            strN = String.valueOf(i);
            sum = 0;
            for (int j = 1; j < strN.length()+1; j++) {
                    sum += Math.pow(Character.getNumericValue(strN.charAt(j-1)), j);
            }
            if (sum == i) { nums.add(i); }
        }

        return nums;

    }

    public static void main(String[] args) {
        System.out.println(sumDigPow(1, 10000000));
    }

}
