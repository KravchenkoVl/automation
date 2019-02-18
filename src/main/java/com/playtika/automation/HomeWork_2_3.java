package com.playtika.automation;

import java.util.Scanner;

public class HomeWork_2_3 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Введите количество программистов в компании: ");
        int i = console.nextInt();
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
