package RotateArray;

import java.util.Arrays;

public class RotateArray {

    public static Object[] rotate(Object[] data, int n) {

        if (Math.abs(n) > data.length) {
            n = n % data.length;
        }
        if (n < 0) {
            n = data.length + n;
        }

        Object[] fin = new Object[data.length];

        for (int i = n; i < data.length; i++) {
            fin[i] = data[i-n];
        }
        for (int i = 0; i < n; i++) {
            fin[i] = data[data.length-n+i];
        }

        return fin;

    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(rotate(new Object[]{true, 2, 3, 4, 5}, -1)));
    }

}
