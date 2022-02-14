package TheHighestProfitWins;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TheHighestProfitWinsTest {

    @Test
    void minMax() {

        int[] result = TheHighestProfitWins.minMax(new int[] {1, 2, 3, 4, 5});

        assertArrayEquals(new int[] {1, 5}, result);

    }
}