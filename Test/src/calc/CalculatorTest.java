package calc;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculatorTest {

    @Test
    void testAdd() {
        Calculator calculator = new Calculator();
        assertEquals(5, calculator.add(2, 3));
    }

    @Test
    void testSubstruct() {
        Calculator calculator = new Calculator();
        assertEquals(-1, calculator.substruct(2, 3));
    }

}
