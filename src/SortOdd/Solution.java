package SortOdd;

import java.util.Arrays;

public class Solution {

    public static int[] sortArray(int[] array) {

        int saveN;

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                saveN = array[i];
                for (int j = i; j < array.length; j++) {
                    if (array[j] % 2 != 0 && array[j] < saveN) {
                        array[i] = array[j];
                        array[j] = saveN;
                        saveN = array[i];
                    }
                }
            }
        }

        return array;

    }

    public static void main(String[] args) {
        int[] array = {0, 4, 4, 5, 2, 3, 4, 1};
        System.out.println(Arrays.toString(sortArray(array)));
    }

}
