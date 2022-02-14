package StringEndsWith;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringEndsWithTest {

    @Test
    void endsWith() {

        boolean result1 = StringEndsWith.endsWith("abc", "bc");
        boolean result2 = StringEndsWith.endsWith("abc", "d");

        assertTrue(result1);
        assertFalse(result2);
    }
}