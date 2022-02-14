package SpoonerizeMe;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SpoonerizeMeTest {

    @Test
    void spoonerize() {

        String result1 = SpoonerizeMe.spoonerize("not picking");

        assertEquals("pot nicking", result1);

    }
}