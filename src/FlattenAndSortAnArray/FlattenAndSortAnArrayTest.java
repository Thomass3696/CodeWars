package FlattenAndSortAnArray;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FlattenAndSortAnArrayTest {

    @Test
    void flattenAndSort() {

        int[] result1 = FlattenAndSortAnArray.flattenAndSort(new int[][] { {3, 2, 1}, {4, 6, 5}, {9, 7, 8} } );

        assertArrayEquals(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9}, result1);

    }
}