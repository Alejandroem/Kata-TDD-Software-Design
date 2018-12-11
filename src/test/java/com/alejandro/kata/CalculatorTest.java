package com.alejandro.kata;

import org.testng.Assert;
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
}