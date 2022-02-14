package TraverseArrayDiagonally;

import java.util.Arrays;

public class Diagonal {

/*
    [1, 2, 3]
    [4, 5, 6]
    [7, 8, 9]
*/

    public static int[] diagonal(int[][] arr) {

        int[] finalArray = new int[9];

        finalArray[0] = arr[2][2];
        finalArray[1] = arr[1][2];
        finalArray[2] = arr[2][1];
        finalArray[3] = arr[0][2];
        finalArray[4] = arr[1][1];
        finalArray[5] = arr[2][0];
        finalArray[6] = arr[0][1];
        finalArray[7] = arr[1][0];
        finalArray[8] = arr[0][0];
        
        return finalArray;
        
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(diagonal(new int[][]{{1, 6, 7}, {7, 2, 4}, {3, 5, 9}})));
    }

}
