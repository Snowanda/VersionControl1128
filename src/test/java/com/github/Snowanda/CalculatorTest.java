package com.github.Snowanda;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CalculatorTest {
    Calculator calc;

    @BeforeEach
    void setUp() {
        calc = new Calculator();
    }

    @Test
    void add() {
        int a = 1;
        int b = 2;

        int actual = calc.add(a, b);
        assertEquals(3, actual);
    }
}
