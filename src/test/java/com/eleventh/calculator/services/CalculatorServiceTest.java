package com.eleventh.calculator.services;

import com.eleventh.calculator.constants.CalculatorServiceTestConstants;
import com.eleventh.calculator.exceptions.IllegalValueException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorServiceTest {
    private CalculatorService out = new CalculatorService();

    @Test
    public void shouldReturnCorrectGreet(){
        Assertions.assertEquals(CalculatorServiceTestConstants.GREETING, out.greet());
    }

    @Test
    public void shouldReturnFourBySummarizeTwoAndTwo(){
        Assertions.assertEquals(4.0, out.summarize(2.0, 2.0));
    }

    @Test
    public void shouldReturnOneBySummarizeZeroAndOne(){
        Assertions.assertEquals(1.0, out.summarize(0.0, 1.0));
    }

    @Test
    public void shouldReturnZeroBySubtractOneAndOne(){
        Assertions.assertEquals(0.0, out.subtract(1.0, 1.0));
    }

    @Test
    public void shouldReturnOneBySubtractTwoAndOne(){
        Assertions.assertEquals(1.0, out.subtract(2.0, 1.0));
    }

    @Test
    public void shouldReturnZeroByMultiplyOneAndZero(){
        Assertions.assertEquals(0.0, out.multiply(1.0, 0.0));
    }

    @Test
    public void shouldReturnFourByMultiplyTwoAndTwo(){
        Assertions.assertEquals(4.0, out.multiply(2.0, 2.0));
    }

    @Test
    public void shouldReturnOneByDivideTwoAndTwo(){
        Assertions.assertEquals(1.0, out.divide(2.0, 2.0));
    }

    @Test
    public void shouldReturnZeroByDivideZeroAndTwo(){
        Assertions.assertEquals(0.0, out.divide(0.0, 2.0));
    }

    @Test
    public void shouldReturnIlligalValueExceptionByDivideOneAndZero(){
        Assertions.assertThrows(IllegalValueException.class, () -> { out.divide(1.0, 0.0); });
    }
}
