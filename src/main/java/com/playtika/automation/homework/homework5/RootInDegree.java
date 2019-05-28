package com.playtika.automation.homework.homework5;

public class RootInDegree implements BinaryOperation {

    @Override
    public double resultFor(double number, double degre) {
        if (number >= 0 && degre != 0) {
            return Math.pow(number, 1.0 / degre);
        }
        throw new ArithmeticException("Degree of expression is equal to zero or radicant is negative");
    }
}
