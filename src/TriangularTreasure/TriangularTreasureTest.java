package TriangularTreasure;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TriangularTreasureTest {

    @Test
    void triangular() {

        long result = TriangularTreasure.triangular(3);

        assertEquals(6, result);

    }
}