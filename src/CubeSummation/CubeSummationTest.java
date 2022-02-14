package CubeSummation;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CubeSummationTest {

    @Test
    void cubeSum() {

        long result = (int) CubeSummation.cubeSum(17, 14);

        assertEquals(12384, result);

    }
}