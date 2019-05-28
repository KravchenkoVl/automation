package com.playtika.automation.homework.homework1;

import java.util.Scanner;

public class UnitVector {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.printf("Введите координату X: ");
        float x = console.nextFloat();
        System.out.printf("Введите координату Y: ");
        float y = console.nextFloat();
        System.out.printf("Введите координату Z: ");
        float z = console.nextFloat();
        calculate(x, y, z);
    }

    public static void calculate(double x, double y, double z){
        double length = Math.sqrt(x * x + y * y + z * z);
        double calcX = x / length;
        double calcY = y / length;
        double calcZ = z / length;
        System.out.printf("Единичный вектор для вектора с координатами (%.0f, %.0f, %.0f) => (%.3f, %.3f, %.3f)", x, y, z, calcX, calcY, calcZ);
    }
}
