package com.playtika.automation;

import java.util.Arrays;
import java.util.Scanner;

public class HomeWork_3_2_ReversedWords {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите фразу: ");
        String[] words = console.nextLine().split(" ");
        StringBuilder test = new StringBuilder("");
        for (int i = 0; i < words.length; i++) {
            StringBuilder rev = new StringBuilder(words[i]);
            test.append(" ");
            test.append(rev.reverse());
        }
        System.out.print(test.toString().trim());
    }
}
