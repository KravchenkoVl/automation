package com.playtika.automation.homeworks.hw5_calculator;

public class Division implements BinaryOperation {

    @Override
    public double resultFor(double left, double right) {
        if (right != 0) {
            return left / right;
        }
        throw new ArithmeticException("Division by zero");
    }
}
