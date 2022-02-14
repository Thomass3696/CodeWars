package ChangingLetters;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ChangingLettersTest {

    @Test
    void swap() {

        String result = ChangingLetters.swap("Hello World!");

        assertEquals("HEllO WOrld!", result);

    }
}