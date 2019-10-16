package com.pzombade.utils;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class UtilsTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void getRandomNumber() {
        int n1 = Utils.getRandomNumber();
        assertTrue("Number should be less than or equal to 10.",n1 <= 10);
        assertTrue("Number should be grater than or equal to 0.",n1 >= 0);
    }

    @Test
    public void testGetRandomNumber() {
        int n1 = Utils.getRandomNumber(7);
        assertTrue("Number should be less than or equal to 7.",n1 <= 7);
        assertTrue("Number should be grater than or equal to 0.",n1 >= 0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetRandomNumberException() {
        int n1 = Utils.getRandomNumber(0);
    }
}