package SeriesOfIntegersFrom0ToN;

public class SeriesOfIntegersFrom0ToN {

    public static int[] generateIntegers(int n) {

        int[] ints = new int[n+1];

        for (int i = 0; i < n+1; i++) {
            ints[i] = i;
        }

        return ints;

    }

}
