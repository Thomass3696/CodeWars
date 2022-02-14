package PaulsMisery;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PaulsMiseryTest {

    @Test
    void paul() {

        String result = PaulsMisery.paul(new String[] {"life", "eating", "life"});

        assertEquals("Super happy!", result);

    }
}