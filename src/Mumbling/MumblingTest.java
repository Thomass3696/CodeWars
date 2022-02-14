package Mumbling;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MumblingTest {

    @Test
    void accum() {

        String result1 = Mumbling.accum("abcd");

        assertEquals("A-Bb-Ccc-Dddd", result1);

    }
}