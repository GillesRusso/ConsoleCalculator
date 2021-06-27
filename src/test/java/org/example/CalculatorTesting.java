package org.example;

import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTesting {
    Calculator calculator;

    @Test
    public void testSummeZweiPositiveIstOk(){
        calculator = new Calculator();
        assertTrue(calculator.summe(10,20)== 30);
    }
    @Test
    public void testSubtractionZweiPositiveIsOk(){
        calculator = new Calculator();
        assertTrue(calculator.subtraktion(20, 10)== 10);
    }
}