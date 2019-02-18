package com.playtika.automation;

import java.util.Scanner;

public class HomeWork_2_2_DigitsSum {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Введите число: ");
        long n = console.nextLong();
        long dig = n;
        long sum = 0;
        while (n > 0) {
            long residue = n % 10;
            sum = sum + residue;
            n = n / 10;
        }
        System.out.printf("Сумма цифр числа %d равна %d", dig, sum);
    }
}
