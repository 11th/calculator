package com.eleventh.calculator.controllers;

import com.eleventh.calculator.services.CalculatorService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculate")
public class CalculatorController {
    private CalculatorService calculatorService;

    public CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    @GetMapping
    public String greet() {
        return calculatorService.greet();
    }

    @GetMapping("/summarize")
    public String summarize(@RequestParam Double num1, @RequestParam Double num2) {
        return num1 + " + " + num2 + " = " + calculatorService.summarize(num1, num2);
    }

    @GetMapping("/subtract")
    public String subtract(@RequestParam Double num1, @RequestParam Double num2) {
        return num1 + " + " + num2 + " = " + calculatorService.subtract(num1, num2);
    }

    @GetMapping("/multiply")
    public String multiply(@RequestParam Double num1, @RequestParam Double num2) {
        return num1 + " + " + num2 + " = " + calculatorService.multiply(num1, num2);
    }

    @GetMapping("/divide")
    public String divide(@RequestParam Double num1, @RequestParam Double num2) {
        try {
            return num1 + " + " + num2 + " = " + calculatorService.divide(num1, num2);
        } catch (IllegalArgumentException e) {
            return e.getMessage();
        }
    }
}
