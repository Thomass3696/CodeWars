package ThinkfulNumberDrillsCongoWarehouses;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CongoWarehousesTest {

    @Test
    void boxCapacity() {

        int result = CongoWarehouses.boxCapacity(32, 64, 16);

        assertEquals(13824, result);

    }
}