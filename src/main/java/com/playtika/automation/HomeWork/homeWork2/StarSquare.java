package com.playtika.automation;

import java.util.Scanner;

public class StarSquare {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n = 0;
        while (n != 3 && n != 6 && n != 9) {
            System.out.print("Введите N, доступные значения: 3, 6, 9.  Ваш выбор: ");
            n = console.nextInt();
        }
        int m = calculateM(n);  // расчет высоты сетки (m)
        writeFullString(n);  // первая строка
        for (int i = 1; i <= 4; i++){
            for (int j = 1; j <= m; j++) {  // m раз с пробелами
                writeStringWithSpace(n);
            }
            writeFullString(n); // полная
        }
    }

    // расчет колечества строк с пробелами
    public static int calculateM(int n) {
        return n/3;
    }

    // вывод полной строки
    public static void writeFullString(int n) {
        int count = 5 + (4 * n);
        for (int i = 1; i <= count; i++) {
            System.out.print("*");
        }
        System.out.println();
    }

    // вывод строки с пробелами
    public static void writeStringWithSpace(int n) {
        for (int i = 1; i <= 4; i++) {
            System.out.print("*");
            for (int j = 1; j <= n; j++){
                System.out.print(" ");
            }
        }
        System.out.println("*");
    }
}