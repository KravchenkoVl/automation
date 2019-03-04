package com.playtika.automation.homework.homework4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int i = 0;
        int type1 = 0;
        int type2 = 0;
        int type3 = 0;
        int type4 = 0;
        boolean flag = false;
        Scanner console = new Scanner(System.in);
        System.out.printf("Выберите класс треугольника для поиска:\n" +
                "1. Равносторонний\n" +
                "2. Прямоугольный\n" +
                "3. Равнобедренный\n" +
                "4. Произвольный\n");
        byte n = console.nextByte();
        while (n < 1 || n > 4) {
            System.out.print("Выберите из предложенных вариантов: ");
            n = console.nextByte();
        }
        Triangle[] triangles = new Triangle[1_000_000];
        while (i < triangles.length) {
            triangles[i] = new Triangle();
            switch (triangles[i].type()) {
                case 1:
                    type1++;
                    break; // Равносторонний
                case 2:
                    type2++;
                    break; // Прямоугольный
                case 3:
                    type3++;
                    break; // Равнобедренный
                case 4:
                    type4++;
                    break; // Произвольный
            }
            if (triangles[i].type() == n) {
                while (flag == false) {
                    System.out.println("Индекс: " + i);
                    triangles[i].getInfo();
                    flag = true;
                }
            }
            i++;
        }
        if (flag == false) {
            System.out.println("Нет ни одного треугольника с указанным типом");
        }
        System.out.println("Количество равносторонних треугольников: " + type1);
        System.out.println("Количество прямоугольных  треугольников: " + type2);
        System.out.println("Количество равнобедренных треугольников: " + type3);
        System.out.println("Количество произвольных   треугольников: " + type4);
    }
}
