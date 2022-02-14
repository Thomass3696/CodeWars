package ScoringTest;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ScoringTestTest {

    @Test
    void sol() {

        int result = ScoringTest.sol(new int[] {0, 0, 0, 0, 2, 1, 0}, 2, 0, 1);

        assertEquals(9, result);

    }
}