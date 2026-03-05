package edu.cis5221;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CalculatorTest {

    private Calculator calculator;

    @BeforeEach
    void setUp() {
        calculator = new Calculator();
    }

    @Test
    void addsTwoPositiveNumbers() {
        assertEquals(5, calculator.add(2, 3));
    }

    @Test
    void addsPositiveAndNegativeNumber() {
        assertEquals(1, calculator.add(4, -3));
    }

    @Test
    void addsTwoNegativeNumbers() {
        assertEquals(-7, calculator.add(-3, -4));
    }

    @Test
    void addsZeroToNumber() {
        assertEquals(42, calculator.add(42, 0));
    }

    @Test
    void addsTwoZeros() {
        assertEquals(0, calculator.add(0, 0));
    }

    @Test
    void handlesIntegerOverflow() {
        assertEquals(Integer.MIN_VALUE, calculator.add(Integer.MAX_VALUE, 1));
    }
}
