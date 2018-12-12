package com.alejandro.kata;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CalculatorTest {

    @Test
    public void addNumbersInString__withEmptyString__returnsZero(){
        // expected value for the assert
        final int expected = 0;

        // the object to test
        Calculator sut = new Calculator();

        // params for the function
        String params = "";

        // the operation to be tested
        final int actual = sut.addNumbersInString(params);

        // the assert of the values
        Assert.assertEquals(actual, expected);
    }

    @DataProvider
    public static Object[][] values(){
        return new Object[][] {
            {"1", 1 },
            {"1,1", 2},
            {"1,1,2",4}
        };
    }

    @Test (dataProvider = "values")
    public void addNumbersInString__withMultipleNumbers__returnsSum(String params, int expected){
        Calculator sut = new Calculator();
        final int actual = sut.addNumbersInString(params);
        Assert.assertEquals(actual, expected);
    }
}