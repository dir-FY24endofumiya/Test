package calc;

import static org.junit.jupiter.api.Assertions.*;

import javax.naming.spi.DirStateFactory.Result;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CalculatorServiceTest {
    private Calculator calculator;
    private CalculatorService service;
    
    @BeforeEach
    public void setup() {
        calculator = new Calculator();
        service = new CalculatorService(calculator);
    }

    @Test
    void testAddAndReport() {
        assertEquals("Result : 5", service.addAndReport(2, 3));
    }

    @Test
    void testSubstructAndReport() {
        assertEquals("Result : 1", service.substructAndReport(3, 2));
    }

}
