package com.playtika.automation.homeworks.hw5_calculator;

public class BaseLog implements BinaryOperation {

    @Override
    public double resultFor(double left, double right) {
        return Math.log(left) / Math.log(right);
    }
}
