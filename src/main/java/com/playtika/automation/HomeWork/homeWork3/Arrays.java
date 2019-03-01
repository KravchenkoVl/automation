package com.playtika.automation;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Arrays {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n = 0;
        while (n < 10 || n > 100) {
            System.out.print("Введите размер массива от 10 до 100: ");
            n = console.nextInt();
        }
        int[] array = new int[n];
        randomFill(array);
        countingAndOutput(array);
    }

    public static void randomFill(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = ThreadLocalRandom.current().nextInt(0,1000000000);
        }
    }

    public static void countingAndOutput(int[] array) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 3 == 0) {
                System.out.printf("array[%d] : %d%n", i, array[i]);
                count++;
            }
        }
        System.out.printf("Количество совпадений: %d", count);
    }
}
