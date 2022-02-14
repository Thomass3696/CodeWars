package FinalExamAlgorithm;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FinalExamAlgorithmTest {

    @Test
    void finalExamAlgorithm() {

        int[][] result = FinalExamAlgorithm.finalExamAlgorithm(new int[][]{{1, 3, 6, 2}, {4, 5, 6, 1}, {3, 3, 1, 5}, {9, 0, 5, 2}});
        int[][] result2 = FinalExamAlgorithm.finalExamAlgorithm(new int[][]{});
        int[][] result3 = FinalExamAlgorithm.finalExamAlgorithm(null);

        assertArrayEquals(new int[][] { {1, 3, 6, 2}, {8, 5, 12, 1}, {3, 3, 1, 5}, {9, 0, 5, 4} }, result);
        assertNull(result2);
        assertNull(result3);

    }
}