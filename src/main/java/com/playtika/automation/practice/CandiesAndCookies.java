package com.playtika.automation.practice;

import java.util.Scanner;

public class CandiesAndCookies {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.printf("Введите стоимость 1 кг конфет: ");
        float candiesPrice = console.nextFloat();
        System.out.printf("Введите стоимость 1 кг печенья: ");
        float cookiesPrice = console.nextFloat();

        //  решение без дополнительного метода
        // float price = (0.3f * candiesPrice) + (0.4f * cookiesPrice);
        // System.out.printf("Цена за 300 грамм конфет и 400 грамм  печенья = %s", price);


        float finalPrice = calculatePrice(candiesPrice, cookiesPrice);
        System.out.printf("Ценаt за 300 грамм конфет и 400 грамм  печенья = %s", finalPrice);
    }

    private static float calculatePrice(float candiesKgPrice, float cookiesKgPrice) {
        float priceM = (0.3f * candiesKgPrice) + (0.4f * cookiesKgPrice);
        return priceM;
    }
}
