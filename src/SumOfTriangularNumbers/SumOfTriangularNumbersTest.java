package SumOfTriangularNumbers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SumOfTriangularNumbersTest {

    @Test
    void sumTriangularNumbers() {

        int result = SumOfTriangularNumbers.sumTriangularNumbers(4);

        assertEquals(20, result);

    }
}