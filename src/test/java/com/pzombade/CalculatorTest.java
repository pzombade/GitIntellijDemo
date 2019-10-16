package com.pzombade;

import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {

    @Test
    public void addition() {
        assertEquals(15,Calculator.addition(10,5));
    }

    @Test
    public void substraction() {
        assertEquals(7,Calculator.substraction(10,3));
    }
}