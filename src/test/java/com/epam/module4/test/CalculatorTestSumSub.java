package com.epam.module4.test;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

/**
 * @author natalynka
 */
public class CalculatorTestSumSub extends BaseCalculatorTest {

    @Test(dataProvider = "dataProviderForLongSum")
    public void testSumLong(long a, long b, long expectedResult) {
        long result = calculator.sum(a, b);
        Assert.assertEquals(result, expectedResult, "Invalid result of operation!");
    }

    @DataProvider(name = "dataProviderForLongSum")
    public Object[][] dataProviderSumLong() {
        return new Object[][]{
                {2, 6, 8},
                {0, 3, 3},
                {-2, -1, -3},
                {-4, 5, 1}
        };
    }

    @Test(dataProvider = "dataProviderForDoubleSum")
    public void testSumDouble(double a, double b, double expectedResult) {
        double result = calculator.sum(a, b);
        Assert.assertEquals(result, expectedResult, "Invalid result of operation!");
    }

    @DataProvider(name = "dataProviderForDoubleSum")
    public Object[][] dataProviderSumDuoble() {
        return new Object[][]{
                {2.5, 6.2, 8.7},
                {0.0, 3.2, 3.2},
                {-2.5, -1.4, -3.9},
                {-4.0, 5.5, 1.5}
        };

    }

    @Test(dataProvider = "dataProviderForLongSub")
    public void testSubLong(long a, long b, long expectedResult) {
        long result = calculator.sub(a, b);
        Assert.assertEquals(result, expectedResult, "Invalid result of operation!");
    }

    @DataProvider(name = "dataProviderForLongSub")
    public Object[][] dataProviderSubLong() {
        return new Object[][]{
                {9, 6, 3},
                {0, 3, -3},
                {-2, -1, -1},
                {-4, 5, -9}
        };
    }

    @Test(dataProvider = "dataProviderForDoubleSub")
    public void testSubDouble(double a, double b, double expectedResult) {
        double result = calculator.sub(a, b);
        Assert.assertEquals(result, expectedResult, "Invalid result of operation!");
    }

    @DataProvider(name = "dataProviderForDoubleSub")
    public Object[][] dataProviderSubDouble() {
        return new Object[][]{
                {2.5, 1.2, 1.3},
                {0.0, 3.2, -3.2},
                {-2.5, -1.4, -1.1},
                {-4.0, 5.5, -9.5}
        };

    }
}