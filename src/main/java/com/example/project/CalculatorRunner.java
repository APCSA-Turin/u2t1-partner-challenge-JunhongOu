package com.example.project;

public class CalculatorRunner {
    public static void main(String[] args) {
        Calculator calc = new Calculator("TI-84");
        int a= calc.absoluteValue(2, 3);
        System.out.println(a);
    }
}
