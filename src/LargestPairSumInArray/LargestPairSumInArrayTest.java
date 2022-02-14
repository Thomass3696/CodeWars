package LargestPairSumInArray;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LargestPairSumInArrayTest {

    @Test
    void largestPairSumTest() {

        int result1 = LargestPairSumInArray.largestPairSum(new int[] {10, 12, 14, 19, 5, 20});

        assertEquals(39, result1);

    }
}