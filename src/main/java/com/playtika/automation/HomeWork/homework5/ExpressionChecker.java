package com.playtika.automation.homework.homework5;

public class ExpressionChecker {
    public static boolean checkExpression(String expression) {
        String[] parsedArray = Parser.parse(expression);
        if (parsedArray.length != 3) {
            return false;
        } else {
            return true;
        }
    }
}