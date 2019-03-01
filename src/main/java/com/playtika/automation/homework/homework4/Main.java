package com.playtika.automation.homework.homework4;

public class Main {
    public static void main(String[] args) {
        int i = 0;
        int type1 = 0;
        int type2 = 0;
        int type3 = 0;
        int type4 = 0;
        Triangle[] triangles = new Triangle[100000];
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
            i++;
//            System.out.println("Индекс: " +  triangles[i]);
//            System.out.println(triangles[i].toString());
//            System.out.println("P: " + triangles[i].perimeter());
//            System.out.println("S: " + triangles[i].square());
//            System.out.println("Тип: " + triangles[i].type());
        }
        System.out.println("Количество равносторонних треугольников: " + type1);
        System.out.println("Количество прямоугольных  треугольников: " + type2);
        System.out.println("Количество равнобедренных треугольников: " + type3);
        System.out.println("Количество произвольных   треугольников: " + type4);
    }
}
