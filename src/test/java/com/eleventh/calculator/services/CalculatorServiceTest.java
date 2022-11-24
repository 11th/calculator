package com.eleventh.calculator.services;

import com.eleventh.calculator.constants.CalculatorServiceTestConstants;
import com.eleventh.calculator.exceptions.IllegalValueException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorServiceTest {
    private CalculatorService out = new CalculatorService();

    @Test
    public void correctGreet(){
        Assertions.assertEquals(CalculatorServiceTestConstants.GREETING, out.greet());
    }

    @Test
    public void correctSummarize(){
        Assertions.assertEquals(4.0, out.summarize(2.0, 2.0));
    }

    @Test
    public void incorrectSummarize(){
        Assertions.assertNotEquals(4.0, out.summarize(1.0, 2.0));
    }

    @Test
    public void correctSubtract(){
        Assertions.assertEquals(1.0, out.subtract(2.0, 1.0));
    }

    @Test
    public void incorrectSubtract(){
        Assertions.assertNotEquals(1.0, out.subtract(1.0, 1.0));
    }

    @Test
    public void correctMultiply(){
        Assertions.assertEquals(9.0, out.multiply(3.0, 3.0));
    }

    @Test
    public void incorrectMultiply(){
        Assertions.assertNotEquals(99.0, out.multiply(3.0, 3.0));
    }

    @Test
    public void correctDivide(){
        Assertions.assertEquals(3.0, out.divide(9.0, 3.0));
    }

    @Test
    public void incorrectDivide(){
        Assertions.assertNotEquals(33.0, out.divide(9.0, 3.0));
    }

    @Test
    public void divideByZero(){
        Assertions.assertThrows(IllegalValueException.class, () -> { out.divide(3.0, 0.0); });
    }
}
