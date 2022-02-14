package ScrollingText;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ScrollingTextTest {

    @Test
    void scrollingText() {

        String[] result = ScrollingText.scrollingText("CODEWARS");

        String[] a1 = new String[]{"CODEWARS", "ODEWARSC", "DEWARSCO", "EWARSCOD", "WARSCODE", "ARSCODEW", "RSCODEWA", "SCODEWAR"};
        assertArrayEquals(a1, result);

    }
}