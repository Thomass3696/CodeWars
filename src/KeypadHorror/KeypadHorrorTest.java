package KeypadHorror;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KeypadHorrorTest {

    @Test
    void computerToPhone() {

        String result = KeypadHorror.computerToPhone("789");

        assertEquals("123", result);

    }
}