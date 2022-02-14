package ListFiltering;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ListFilteringTest {

    @Test
    void filterList() {

        List result = ListFiltering.filterList(Arrays.asList(1, 2, "a", "b"));

        assertEquals(Arrays.asList(1, 2), result);

    }
}