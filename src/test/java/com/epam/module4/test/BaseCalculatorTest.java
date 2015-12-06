package com.epam.module4.test;

import com.epam.tat.module4.Calculator;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;

/**
 * @author natalynka
 */
public class BaseCalculatorTest {

    protected Calculator calculator;

    @BeforeClass
    protected void beforeClass() {
        calculator = new Calculator();
        Assert.assertNotNull(calculator);
    }
}
