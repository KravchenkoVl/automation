package com.playtika.automation.homework.homework4;

import java.util.Scanner;

import static com.playtika.automation.homework.homework4.TrianglesFactory.getRandomTriangle;

public class Main {
    public static void main(String[] args) {
        Triangle[] triangles = new Triangle[100_000];
        int i = 0;
        while (i < triangles.length) {
            triangles[i] = getRandomTriangle();
            i++;
        }

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

        int type1 = 0;
        int type2 = 0;
        int type3 = 0;
        int type4 = 0;
        boolean flag = false;
        for (int j = 0; j < triangles.length; j++) {
            switch (triangles[j].type()) {
                case 1:
                    type1++;   // Равносторонний
                    break;
                case 2:
                    type2++;   // Прямоугольный
                    break;
                case 3:
                    type3++;   // Равнобедренный
                    break;
                case 4:
                    type4++;   // Произвольный
                    break;
            }
            if (triangles[j].type() == n) {
                if (flag == false) {
                    System.out.println("Индекс: " + j);
                    triangles[j].getInfo();
                    flag = true;
                }
            }
            
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
