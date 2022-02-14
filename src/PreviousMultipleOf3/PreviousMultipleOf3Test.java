package PreviousMultipleOf3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PreviousMultipleOf3Test {

    @Test
    void prevMultOfThree() {

        int result1 = PreviousMultipleOf3.prevMultOfThree(1244);

        assertEquals(12, result1);

    }
}