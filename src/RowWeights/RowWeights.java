package RowWeights;

public class RowWeights {

    public static int[] rowWeights (final int[] weights) {

        int w1 = 0;
        int w2 = 0;

        for (int i = 0; i < weights.length; i++) {
            if (i % 2 == 0) {
                w1 += weights[i];
            }
            else {
                w2 += weights[i];
            }
        }

        return new int[] {w1, w2};

    }

}
