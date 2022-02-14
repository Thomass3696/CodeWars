package PrizeDraw;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PrizeDrawTest {

    @Test
    void nthRankTest() {

        String result1 = PrizeDraw.nthRank("COLIN,AMANDBA,AMANDAB,CAROL,PauL,JOSEPH", new Integer[]{1, 4, 4, 5, 2, 1}, 4);
        String result2 = PrizeDraw.nthRank("Elijah,Chloe,Elizabeth,Matthew,Natalie,Jayden", new Integer[]{1, 3, 5, 5, 3, 6}, 2);

        assertEquals("PauL", result1);
        assertEquals("Matthew", result2);

    }

    @Test
    void nthRankNotEnoughParticipantsTest() {

        String result = PrizeDraw.nthRank("Addison,Jayden,Sofia,Michael,Andrew,Lily,Benjamin", new Integer[]{4, 2, 1, 4, 3, 1, 2}, 8);

        assertEquals("Not enough participants", result);

    }

    @Test
    void nthRankNoParticipantsTest() {

        String result = PrizeDraw.nthRank("", new Integer[] {4, 2, 1, 4, 3, 1, 2}, 4);

        assertEquals("No participants", result);

    }
}