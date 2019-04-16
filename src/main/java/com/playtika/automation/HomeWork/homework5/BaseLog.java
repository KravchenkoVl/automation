package com.playtika.automation.homework.homework5;

public class BaseLog implements BinaryOperation {

    @Override
    public double resultFor(double left, double right) {
        return Math.log(left) / Math.log(right);
    }
}
