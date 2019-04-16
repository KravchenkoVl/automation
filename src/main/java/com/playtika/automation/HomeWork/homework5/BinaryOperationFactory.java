package com.playtika.automation.homework.homework5;

public class BinaryOperationFactory {
    public static BinaryOperation getOperationFor(String operator) {
        switch (operator) {
            case "+":
                return new Addition();
            case "-":
                return new Subtraction();
            case "*":
                return new Multiplication();
            case "/":
                return new Division();
            case "^":
                return new Exponentiation();
            case "log":
                return new BaseLog();
            case "sqrt":
                return new RootInDegree();
            default:return null;
        }
    }
}
