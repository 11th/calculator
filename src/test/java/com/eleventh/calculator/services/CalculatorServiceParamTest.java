package com.eleventh.calculator.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class CalculatorServiceParamTest {
    private final CalculatorService out = new CalculatorService();

    @ParameterizedTest
    @MethodSource("provideParamsForSumTest")
    public void shouldReturnCorrectSum(Double num1, Double num2, Double result){
        Assertions.assertEquals(result, out.summarize(num1, num2));
    }

    @ParameterizedTest
    @MethodSource("provideParamsForSubtractTest")
    public void shouldReturnCorrectDelta(Double num1, Double num2, Double result){
        Assertions.assertEquals(result, out.subtract(num1, num2));
    }

    @ParameterizedTest
    @MethodSource("provideParamsForMultiplyTest")
    public void shouldReturnCorrectMultiply(Double num1, Double num2, Double result){
        Assertions.assertEquals(result, out.multiply(num1, num2));
    }

    @ParameterizedTest
    @MethodSource("provideParamsForDivideTest")
    public void shouldReturnCorrectDivide(Double num1, Double num2, Double result){
        Assertions.assertEquals(result, out.divide(num1, num2));
    }

    public static Stream<Arguments> provideParamsForSumTest(){
        return Stream.of(
                Arguments.of(2.0, 2.0, 4.0),
                Arguments.of(0.0, 0.0, 0.0),
                Arguments.of(-1.0, 1.0, 0.0)
        );
    }

    public static Stream<Arguments> provideParamsForSubtractTest(){
        return Stream.of(
                Arguments.of(0.0, 0.0, 0.0),
                Arguments.of(2.0, 2.0, 0.0),
                Arguments.of(4.0, 2.0, 2.0),
                Arguments.of(0.0, 2.0, -2.0),
                Arguments.of(-1.0, 2.0, -3.0)
        );
    }

    public static Stream<Arguments> provideParamsForMultiplyTest(){
        return Stream.of(
                Arguments.of(0.0, 0.0, 0.0),
                Arguments.of(0.0, 2.0, 0.0),
                Arguments.of(2.0, 2.0, 4.0),
                Arguments.of(-1.0, 2.0, -2.0),
                Arguments.of(-1.0, -2.0, 2.0)
        );
    }

    public static Stream<Arguments> provideParamsForDivideTest(){
        return Stream.of(
                Arguments.of(0.0, 2.0, 0.0),
                Arguments.of(2.0, 2.0, 1.0),
                Arguments.of(-1.0, 2.0, -0.5),
                Arguments.of(-1.0, -2.0, 0.5)
        );
    }
}
