package com.epam.module4.test;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

/**
 * @author natalynka
 */
public class CalculatorTestTrigonometry extends BaseCalculatorTest {

    @Test(dataProvider = "dataProviderForSin", priority = 2)
    public void testSin(double a, double expectedResult) {
        double result = calculator.sin(a);
        Assert.assertEquals(result, expectedResult, "Invalid result of operation!");
    }

    @DataProvider(name = "dataProviderForSin")
    public Object[][] dataProviderSin() {
        return new Object[][]{
                {0, 0},
                {Math.PI / 2, 1},
                {-Math.PI / 2, -1},
                {Math.PI / 6, 0.5},
        };
    }

    @Test(dataProvider = "dataProviderForCos", priority = 1)
    public void testCos(double a, double expectedResult) {
        double result = calculator.cos(a);
        Assert.assertEquals(result, expectedResult, "Invalid result of operation!");
    }

    @DataProvider(name = "dataProviderForCos")
    public Object[][] dataProviderCos() {
        return new Object[][]{
                {0, 1},
                {Math.PI / 2, 0},
                {-Math.PI / 3, -0.5},
                {Math.PI, -1}
        };
    }

    @Test(dataProvider = "dataProviderForTg", priority = 3)
    public void testTg(double a, double expectedResult) {
        double result = calculator.tg(a);
        Assert.assertEquals(result, expectedResult, "Invalid result of operation!");
    }

    @DataProvider(name = "dataProviderForTg")
    public Object[][] dataProviderTg() {
        return new Object[][]{
                {0, 0},
                {Math.PI / 4, 1},
                {-Math.PI / 4, -1},
        };
    }

    @Test(dataProvider = "dataProviderForCtg", priority = 4)
    public void testCtg(double a, double expectedResult) {
        double result = calculator.ctg(a);
        Assert.assertEquals(result, expectedResult, "Invalid result of operation!");
    }

    @DataProvider(name = "dataProviderForCtg")
    public Object[][] dataProviderCtg() {
        return new Object[][]{
                {Math.PI / 4, 1},
                {Math.PI / 2, 0},
                {-Math.PI / 4, -1}
        };
    }
}