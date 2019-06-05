package com.playtika.automation.homeworks.hw5_calculator;

public class Expression {
    private double val1;
    private double val2;
    private String operator;

    public Expression() {
    }

    public Expression(String string) {
        String[] check = Parser.parse(string);
        if (check.length != 3) {
            throw new IllegalArgumentException("Incorrect expression");
        }
        val1 = Double.parseDouble(check[0]);
        operator = check[1];
        val2 = Double.parseDouble(check[2]);
    }

    public double getVal1(){
        return val1;
    }

    public double getVal2(){
        return val2;
    }

    public String getOperator(){
        return operator;
    }
}
