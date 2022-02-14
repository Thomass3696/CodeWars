package SeriesOfIntegersFrom0ToN;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SeriesOfIntegersFrom0ToNTest {

    @Test
    void generateIntegers() {

        int[] result = SeriesOfIntegersFrom0ToN.generateIntegers(3);

        assertArrayEquals(new int[] {0, 1, 2, 3}, result);

    }
}