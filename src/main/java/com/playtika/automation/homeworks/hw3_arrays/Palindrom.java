package com.playtika.automation.homeworks.hw3_arrays;

import java.util.Scanner;

public class Palindrom {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Введите слово/фразу: ");
        StringBuilder strCheck = new StringBuilder(console.next());
        if (strCheck.toString().equalsIgnoreCase(strCheck.reverse().toString())) {
            System.out.println("Палиндром");
        } else {
            System.out.println("Не палиндром");
        }
    }
}