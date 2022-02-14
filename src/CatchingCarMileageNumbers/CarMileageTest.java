package CatchingCarMileageNumbers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarMileageTest {

    @Test
    void isInteresting() {

        int result1 = CarMileage.isInteresting(1111, new int[] {123});
        int result2 = CarMileage.isInteresting(1110, new int[] {123});
        int result3 = CarMileage.isInteresting(1109, new int[] {123});
        int result4 = CarMileage.isInteresting(1108, new int[] {123});

        assertEquals(2, result1);
        assertEquals(1, result2);
        assertEquals(1, result3);
        assertEquals(0, result4);

    }
}