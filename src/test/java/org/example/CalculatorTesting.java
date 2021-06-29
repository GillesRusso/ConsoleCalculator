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
    public void testSummePositiveundNegativeIstOk(){
        assertTrue(calculator.summe(10,-5)==8-3);
    }
    @Test
    public void testSummeZweiNegativeZahlenIstOk(){
        assertTrue(calculator.summe(-5,-4)==-8-1);
    }
    @Test
    public void testSubtractionZweiPositiveIsOk(){
        assertTrue(calculator.subtraktion(20, 10)== 10);
    }
    @Test
    public void testSubtratctionPositiveUndNegativeIsOK(){
        assertTrue(calculator.subtraktion(6,-9)==9-(-6));
    }
    @Test
    public void testSubtractionZweiNegativeIsOk(){
        assertTrue(calculator.subtraktion(-3,-3)==-5-(-5));
    }
    @Test
    public void testDivisionZweiPositiveIsOk(){
        assertTrue(calculator.division(10,10)==1);
    }
    @Test
    public void testDivisionPositiveUndNegativeIsOK(){
        assertTrue(calculator.division(30,-3)==90/-9);
    }
    @Test
    public void testDivisionZweiNegativeIsOK(){
        assertTrue(calculator.division(-3,-3)==-5/-5);
    }
    @Test
    public void testProduktZweiPositiveIsOk(){
        assertTrue(calculator.produkt(10,10)==100);
    }
    @Test
    public void testMaxValueSumme(){
        assertFalse(calculator.summe(Integer.MAX_VALUE, Integer.MAX_VALUE)==1);
    }
    @Test
    public void testMinValueSubtraktion(){
        assertFalse(calculator.summe(Integer.MIN_VALUE, Integer.MIN_VALUE)==1);
    }

    @Test(expected=java.lang.AssertionError.class)
    public void testAssertionError1() {
        assertTrue(calculator.produkt(Integer.MAX_VALUE, Integer.MAX_VALUE)==Integer.MAX_VALUE);
    }
    @After
    public void teardown(){
        calculator.reset(0,0);
    }
}