package com.playtika.automation.homework.homework5;

public class RootInDegree implements BinaryOperation {

    @Override
    public double resultFor(double left, double right) {
        return Math.pow(left, 1.0/right);
    }
}
