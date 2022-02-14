package SillyAddition;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SillyAdditionTest {

    @Test
    void add() {

        int result = SillyAddition.add(16, 18);

        assertEquals(214, result);

    }
}