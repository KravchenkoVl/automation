package com.playtika.automation.homework.homework1;

public class Decomposition {
    public static void main(String[] args) {
        decomposition(65457);
    }

    public static void decomposition(int x) {
        int first = x / 10000;
        int step1 = x - (first * 10000);
        int second = step1 / 1000;
        int step2 = step1 - (second * 1000);
        int third = step2 / 100;
        int step3 = step2 - (third * 100);
        int fourth = step3 / 10;
        int fifth = step3 - (fourth * 10);
        System.out.printf("%d%n%d%n%d%n%d%n%d", first, second, third, fourth, fifth);
    }
}
