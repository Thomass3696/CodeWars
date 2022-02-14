package AreTheySame;

import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AreTheySameTest {

    @Test
    void comp() {

        boolean result1 = AreTheySame.comp(new int[]{3, 4}, new  int[]{9,16});
        boolean result2 = AreTheySame.comp(new int[]{1, 2}, new int[]{1, 3});

        assertTrue(result1);
        assertFalse(result2);

    }

}