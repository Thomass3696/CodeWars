package PascalsTraingle2;

import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class PascalsTriangle2Test {

    @Test
    void pascal() {

        int[][] result1 = PascalsTriangle2.pascal(1);
        int[][] result2 = PascalsTriangle2.pascal(2);
        int[][] result3 = PascalsTriangle2.pascal(3);
        int[][] result4 = PascalsTriangle2.pascal(4);

        int[][] arr1 = new int[][] { {1} };
        int[][] arr2 = new int[][] { {1}, {1, 1} };
        int[][] arr3 = new int[][] { {1}, {1, 1}, {1, 2, 1} };
        int[][] arr4 = new int[][] { {1}, {1, 1}, {1, 2, 1}, {1, 3, 3, 1} };

        Assertions.assertArrayEquals(arr1, result1);
        Assertions.assertArrayEquals(arr2, result2);
        Assertions.assertArrayEquals(arr3, result3);
        Assertions.assertArrayEquals(arr4, result4);

    }
}