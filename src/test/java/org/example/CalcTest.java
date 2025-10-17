package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalcTest {
    Calc c = new Calc();

    @Test
    void testAddition() {
        assertEquals(4, c.add(2, 2));
    }

    @Test
    void testSubtraction() {
        assertEquals(2, c.subtract(4, 2));
    }
}
