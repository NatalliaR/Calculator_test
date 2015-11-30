package com.epam.module4.test;

import com.epam.tat.module4.Calculator;
import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

/**
 * @author natalynka
 */
@Test
public class CalculatorTest {

    private Calculator calculator;

    @BeforeSuite
    private void beforeSuite() {
        calculator = new Calculator();
        Assert.assertNotNull(calculator);
    }

    @Test
    public void testSum() {
        long sum = calculator.sum(1, 6);
        Assert.assertEquals(sum, 7);

        long sum1 = calculator.sum(-1, -5);
        Assert.assertEquals(sum1, -6);

        long sum2 = calculator.sum(-3, 8);
        Assert.assertEquals(sum2, 5);
    }

    @Test
    public void testSub() {
        long sub = calculator.sub(9, 6);
        Assert.assertEquals(sub, 3);

        long sub1 = calculator.sub(3, 7);
        Assert.assertEquals(sub1, -4);

        long sub2 = calculator.sub(-3, 8);
        Assert.assertEquals(sub2, -11);

        long sub3 = calculator.sub(-3, -4);
        Assert.assertEquals(sub2, -7);
    }

    @Test
    public void testMult() {
        long mult = calculator.mult(3, 4);
        Assert.assertEquals(mult, 12);

        long mult1 = calculator.mult(-3, 7);
        Assert.assertEquals(mult1, -21);

        long mult2 = calculator.mult(3, 0);
        Assert.assertEquals(mult2, 0);

        long mult3 = calculator.mult(-3, -5);
        Assert.assertEquals(mult2, -15);
    }

    @Test
    public void testDiv() {
        long div = calculator.div(20, 4);
        Assert.assertEquals(div, 5);

        long div1 = calculator.div(-15, 5);
        Assert.assertEquals(div1, -3);

        long div2 = calculator.div(-3, -5);
        Assert.assertEquals(div2, -15);
    }

    @Test(expectedExceptions = NumberFormatException.class)
    public void testDivByZero() {
        long div1 = calculator.div(3, 0);

        long div2 = calculator.div(0, 0);

        long div3 = calculator.div(-4, 0);
    }

}
