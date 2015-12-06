package com.epam.module4.test;


import org.testng.annotations.Factory;

/**
 * @author natalynka
 */
public class CalculatorTestPositiveNegativeFactory {

    @Factory
    public Object[] getTests() {
        return new Object[]{
                new CalculatorTestPositiveNegative(10, true, false),
                new CalculatorTestPositiveNegative(0, false, false)
        };
    }
}
