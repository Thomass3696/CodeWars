package HappyBirthday;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HappyBirthdayTest {

    @Test
    void wrap() {

        int result = HappyBirthday.wrap(17, 32, 11);

        assertEquals(162, result);

    }
}