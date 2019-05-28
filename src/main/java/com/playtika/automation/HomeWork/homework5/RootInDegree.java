package com.playtika.automation.homework.homework5;

public class RootInDegree implements BinaryOperation {

    @Override
    public double resultFor(double left, double right) {
        if (left != 0 && right >= 0) {
            return Math.pow(left, 1.0 / right);
        }
        throw new ArithmeticException("Degree of expression is equal to zero or radicant is negative");
    }
}
