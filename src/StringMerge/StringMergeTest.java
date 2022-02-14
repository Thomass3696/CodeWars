package StringMerge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringMergeTest {

    @Test
    void stringMerge() {

        String result = StringMerge.stringMerge("hello", "world", 'l');

        assertEquals("held", result);

    }
}