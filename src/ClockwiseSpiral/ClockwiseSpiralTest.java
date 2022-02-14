package ClockwiseSpiral;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClockwiseSpiralTest {

    @Test
    void createSpiral() {

        int[][] result1 = ClockwiseSpiral.createSpiral(3);
        int[][] arr = new int[][] {{1, 2, 3}, {8, 9, 4}, {7, 6, 5}};

        assertArrayEquals(arr, result1);

    }
}