package com.epam.module4.test;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

/**
 * @author natalynka
 */
@Test
public class CalculatorTestMultDiv extends BaseCalculatorTest {

    @Test(dataProvider = "dataProviderForLongMult")
    public void testMultLong(long a, long b, long expectedResult) {
        long result = calculator.mult(a, b);
        Assert.assertEquals(result, expectedResult, "Invalid result of operation!");
    }

    @DataProvider(name = "dataProviderForLongMult")
    public Object[][] dataProviderMultLong() {
        return new Object[][]{
                {2, 3, 6},
                {0, 3, 0},
                {-2, -1, 2},
                {-4, 5, -20}
        };
    }

    @Test(dataProvider = "dataProviderForDoubleMult")
    public void testMultDouble(double a, double b, double expectedResult) {
        double result = calculator.mult(a, b);
        Assert.assertEquals(result, expectedResult, "Invalid result of operation!");
    }

    @DataProvider(name = "dataProviderForDoubleMult")
    public Object[][] dataProviderMultDouble() {
        return new Object[][]{
                {2.5, 1.1, 2.75},
                {0.0, 3.2, 0},
                {-2.5, -1.1, 2.75},
                {-4.2, 1.0, -4.2}
        };

    }

    @Test(dataProvider = "dataProviderForLongDiv")
    public void testDivLong(long a, long b, long expectedResult) {
        long result = calculator.div(a, b);
        Assert.assertEquals(result, expectedResult, "Invalid result of operation!");
    }

    @DataProvider(name = "dataProviderForLongDiv")
    public Object[][] dataProviderDivLong() {
        return new Object[][]{
                {6, 3, 2},
                {0, 3, 0},
                {-2, -1, 2},
                {-4, 1, -4}
        };
    }

    @Test(dataProvider = "dataProviderForDoubleDiv")
    public void testMDivDouble(double a, double b, double expectedResult) {
        double result = calculator.div(a, b);
        Assert.assertEquals(result, expectedResult, "Invalid result of operation!");
    }

    @DataProvider(name = "dataProviderForDoubleDiv")
    public Object[][] dataProviderDivDouble() {
        return new Object[][]{
                {3, 1.5, 2.0},
                {0.0, 3.2, 0},
                {-4.4, -1.1, 4.0},
                {-4.8, 2.0, -2.4}
        };
    }

    @Test(dataProvider = "dataProviderForLongDivByZero", expectedExceptions = NumberFormatException.class)
    public void testLongDivByZero(long a, long b) {
        calculator.div(a, b);
    }

    @DataProvider(name = "dataProviderForLongDivByZero")
    public Object[][] dataProviderLongDivByZero() {
        return new Object[][]{
                {6, 0},
                {0, 0},
                {-2, 0}
        };
    }

}
