package ArrayDiff;

import java.util.Arrays;

public class ArrayDiff {

    public static int[] arrayDiff(int[] a, int[] b) {

        int counter = 0;
        int p = 0;

        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < a.length    ; j++) {
                if (b[i] == a[j]) {
                    a[j] = 11111;
                    counter++;
                }
            }
        }

        int[] finArr = new int[a.length-counter];

        for (int i = 0; i < a.length; i++) {
            if (a[i] != 11111) {
                finArr[p] = a[i];
                p++;
            }
        }

        return finArr;

    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(arrayDiff(new int[]{1, 2}, new int[]{1})));
    }

}
