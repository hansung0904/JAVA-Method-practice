package com.nhnacademy.chs.java;

public class Calculator implements CalculatorService{

    @Override
    public double add(double a, double b) {
        return a+b;
    }

    @Override
    public double subtract(double a, double b) {
        return a-b;
    }
}
