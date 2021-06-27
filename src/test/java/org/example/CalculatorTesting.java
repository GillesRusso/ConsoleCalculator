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
}