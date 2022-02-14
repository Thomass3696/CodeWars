package ExclamationMarksSeries8;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MoveAllExcTest {

    @Test
    void toTheEnd() {

        String result = MoveAllExc.toTheEnd("Hi! Hi!! Hi!");

        assertEquals("Hi Hi Hi!!!!", result);

    }
}