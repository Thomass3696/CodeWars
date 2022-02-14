package ComplementaryDNA;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DNAStrandTest {

    @Test
    void makeComplement() {

        String result = DNAStrand.makeComplement("123");
        String result2 = DNAStrand.makeComplement("");

        assertEquals("TAG", result);
        assertEquals("", result2);

        assertNotEquals("A", result);


    }

}