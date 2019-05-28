package com.playtika.automation.examples;

public class IfElseAndCycles {
    public static void main(String[] args) {

    }

    public static void example_ifElse() {
        int x = 10;
        if (x == 10) {
            System.out.println("Hello 1");
        } else {
            System.out.println("Hello 2");
        }
    }

    public static void example_for() {
        for (int i = 0; i < 10; i++){
            System.out.printf("i равно %d%n", i);
        }
    }

    public static void example_while() {
        int i = 0;
        while (i < 10) {
            System.out.printf("i равно %d%n", i);
            i++;
        }
    }

    public static void example_doWhile() {
        int i = 0;
        do {
            System.out.printf("i равно %d%n", i);
            i++;
        } while ((i < 10));
    }

}
