package org1.example1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    Calculator calc = new Calculator();

    @Test
    void testSqrt() {
        assertEquals(5.0, calc.sqrt(25.0), 0.0001);
        assertEquals(1.0, calc.sqrt(1.0), 0.0001);
    }

    @Test
    void testFactorial() {
        assertEquals(1, calc.factorial(0)); // 0! = 1
        assertEquals(1, calc.factorial(1)); // 1! = 1
        assertEquals(6, calc.factorial(3)); // 3! = 6
        assertEquals(120, calc.factorial(5)); // 5! = 120
    }

    @Test
    void testNaturalLog() {
        assertEquals(0.0, calc.natural_log(1.0), 0.0001); // ln(1) = 0
        assertEquals(1.0, calc.natural_log(Math.E), 0.0001);
    }

    @Test
    void testPower() {
        assertEquals(8.0, calc.power(2, 3), 0.0001);
        assertEquals(1.0, calc.power(5, 0), 0.0001);
        assertEquals(0.25, calc.power(2, -2), 0.0001);
    }
}
