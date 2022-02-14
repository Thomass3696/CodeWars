package CompareStringsBySumOfChars;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CompareStringsBySumOfCharsTest {

    @Test
    void compare() {

        boolean result1 = CompareStringsBySumOfChars.compare("AD ", "BC1");
        boolean result2 = CompareStringsBySumOfChars.compare("AD", "D1");

        assertTrue(result1);
        assertFalse(result2);

    }
}