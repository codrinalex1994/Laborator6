import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PerfectNumberTest {

    @Test
    void add() {
    }

    @Test
    void multiply() {
    }

    @Test
    void testType() {
    }

    @Test
    void checkMe() {
        PerfectNumber perfectNumber = new PerfectNumber(496);

        boolean result = perfectNumber.checkMe();

        assertTrue( result, "checkMe, test passed");
        assertFalse( result, "checkMe, test failed");

    }
}