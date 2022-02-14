package PasswordMaker;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PasswordMakerTest {

    @Test
    void makePassword() {

        String result = PasswordMaker.makePassword("Give me liberty or give me death");

        assertEquals("Gml0gmd", result);

    }
}