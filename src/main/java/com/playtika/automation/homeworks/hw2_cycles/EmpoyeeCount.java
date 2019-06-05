package com.playtika.automation.homeworks.hw2_cycles;

import java.util.Scanner;

public class EmpoyeeCount {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int i = 0;
        while (i < 1) {
            System.out.print("Введите количество программистов в компании: ");
            i = console.nextInt();
        }
        System.out.printf("Для найма %d программистов было проведено %d сбеседований", i, sum(i));
    }

    public static long sum(int n) {
        if (n <= 1) {
            return 0;
        } else {
            return n - 1 + sum(n - 1);
        }
    }
}
