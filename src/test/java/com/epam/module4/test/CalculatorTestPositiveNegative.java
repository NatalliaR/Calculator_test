package com.epam.module4.test;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Factory;
import org.testng.annotations.Test;

/**
 * @author natalynka
 */
public class CalculatorTestPositiveNegative extends BaseCalculatorTest {

    private long value;
    private boolean expectedToBePositive;
    private boolean expectedToBeNegative;

    @Factory(dataProvider = "dataProviderValues")
    public CalculatorTestPositiveNegative(long value, boolean expectedToBePositive, boolean expectedToBeNegative) {
        this.value = value;
        this.expectedToBePositive = expectedToBePositive;
        this.expectedToBeNegative = expectedToBeNegative;
    }

    @Test
    public void checkValuePositive() {
        Assert.assertTrue(calculator.isPositive(value) == expectedToBePositive);
    }

    @Test
    public void checkValueNegative() {
        Assert.assertTrue(calculator.isNegative(value) == expectedToBeNegative);
    }

    @DataProvider(name = "dataProviderValues")
    public static Object[][] valueForCheck() {
        return new Object[][]{
                {1, true, false},
                {-1, false, true},
                {-1000, false, true},
                {0, false, false}
        };
    }
}
