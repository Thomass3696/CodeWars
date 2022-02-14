package SumsOfParts;

import java.util.Arrays;

public class SumsOfParts {

    public static int[] sumParts(int[] ls) {

        if (ls.length == 0) { return new int[] {0}; }

        int[] result = new int[ls.length + 1];

        int sum = 0;

        for (int n : ls) { sum += n; }

        result[0] = sum;

        for (int i = 0; i < ls.length; i++) {
            sum -= ls[i];
            result[i+1] = sum;
        }

        return result;

    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(sumParts(new int[]{0, 1, 3, 6, 10})));
    }

}
