package com.playtika.automation;

import java.util.Scanner;

public class HomeWork_3_2_ReversedWords {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите фразу: ");
        String[] firstString = console.nextLine().split(" ");
        StringBuilder secondString = new StringBuilder("");
        for (int i = 0; i < firstString.length; i++) {
            StringBuilder word = new StringBuilder(firstString[i]);
            secondString.append(" ");
            secondString.append(word.reverse());
        }
        System.out.print(secondString.toString().trim());
    }
}
