package com.playtika.automation.homework.homework5;

import java.util.Scanner;

public class Calculator {
    public double calculate(String check) {
        Expression example = new Expression(check);
        BinaryOperation operation = BinaryOperationFactory.getOperationFor(example.getOperator());
        if (operation == null) {
            System.out.println("Неизвестный оператор " + example.getOperator());
            return Double.NaN;
        }
        return operation.resultFor(example.getVal1(), example.getVal2());
    }

    public static void main(String[] args) {
        System.out.print("Введите пример бинарной операции: ");
        String check;
        Scanner console = new Scanner(System.in);
        Calculator calculator = new Calculator();
        for (int i = 0; i <= 4; i++) {
            System.out.print("Введите пример по типу \"Значение_1 Оператор Значение_2\": ");
            check = console.nextLine();
            System.out.printf("Результат: %s\n\n",calculator.calculate(check));
            if (i < 4) {
                System.out.print("Продолжим: ");
            }
        }
    }
}
