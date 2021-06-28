package org.example;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTesting {
    Calculator calculator;

    @Before
    public void setup(){
        calculator = new Calculator();
    }

    @Test
    public void testSummeZweiPositiveIstOk(){
        assertTrue(calculator.summe(10,20)== 30);
    }
    @Test
    public void testSubtractionZweiPositiveIsOk(){
        assertTrue(calculator.subtraktion(20, 10)== 10);
    }
    @Test
    public void testMaxValueSumme(){
        assertFalse(calculator.summe(Integer.MAX_VALUE, Integer.MAX_VALUE)==1);
    }
    @Test
    public void testMinValueSubtraktion(){
        assertFalse(calculator.summe(Integer.MIN_VALUE, Integer.MIN_VALUE)==1);
    }

    @After
    public void teardown(){
        calculator.reset(0,0);
    }
}