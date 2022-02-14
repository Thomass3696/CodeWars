package FlattenAndSortAnArray;

import java.util.Arrays;

public class FlattenAndSortAnArray {

    public static int[] flattenAndSort(int[][] array) {

        int n = 0;
        int counter = 0;

        for (int[] arr : array) {
            n += arr.length;
        }

        int[] myArr = new int[n];

        for(int[] arr : array) {
            for(int num : arr) {
                myArr[counter] = num;
                counter++;
            }
        }

        Arrays.sort(myArr);

        return myArr;

    }

}
