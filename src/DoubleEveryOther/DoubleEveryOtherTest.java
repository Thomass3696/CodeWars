package DoubleEveryOther;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DoubleEveryOtherTest {

    @Test
    void doubleEveryOther() {

        int[] result1 = DoubleEveryOther.doubleEveryOther(new int[] {1, 2, 3, 4, 5});

        assertArrayEquals(new int[] {1, 4, 3, 8, 5}, result1);

    }
}