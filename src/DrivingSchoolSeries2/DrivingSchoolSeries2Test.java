package DrivingSchoolSeries2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DrivingSchoolSeries2Test {

    @Test
    void cost() {

        int result1 = DrivingSchoolSeries2.cost(80);

        assertEquals(40, result1);

    }
}