package com.eleventh.calculator.services;

import org.springframework.stereotype.Service;

@Service
public class CalculatorService {
    public String greet() {
        return "Добро пожаловать в калькулятор!";
    }

    public Double summarize(Double num1, Double num2) {
        return num1 + num2;
    }

    public Double subtract(Double num1, Double num2) {
        return num1 - num2;
    }

    public Double multiply(Double num1, Double num2) {
        return num1 * num2;
    }

    public Double divide(Double num1, Double num2) {
        if (num2 == 0.0) {
            throw new IllegalArgumentException("Деление на 0 запрещено");
        }
        return num1 / num2;
    }
}
