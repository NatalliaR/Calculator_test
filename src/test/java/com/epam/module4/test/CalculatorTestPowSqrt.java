package com.epam.module4.test;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

/**
 * @author natalynka
 */
public class CalculatorTestPowSqrt extends BaseCalculatorTest {

    @Test(dataProvider = "dataProviderForPow")
    public void testPow(double a, double b, double expectedResult) {
        double result = calculator.pow(a, b);
        Assert.assertEquals(result, expectedResult, "Invalid result of operation!");
    }

    @DataProvider(name = "dataProviderForPow")
    public Object[][] dataProviderPow() {
        return new Object[][]{
                {0.5, 0.5, 0.707106781},
                {0.0, 2.5, 0},
                {-2.5, 2, -6.25},
                {1, 5.5, 1},
                {3, 2, 9}
        };

    }

    @Test(dataProvider = "dataProviderForSqrt")
    public void testSqrt(double a, double expectedResult) {
        double result = calculator.sqrt(a);
        Assert.assertEquals(result, expectedResult, "Invalid result of operation!");
    }

    @DataProvider(name = "dataProviderForSqrt")
    public Object[][] dataProviderSqrt() {
        return new Object[][]{
                {6.25, 2.5},
                {0.0, 0},
                {-25, 5}
        };

    }
}
