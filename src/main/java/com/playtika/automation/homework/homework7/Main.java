package com.playtika.automation.homework.homework7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner consoleFilePath = new Scanner(System.in);
        System.out.println("Please input file path (e.g. 'C:\\Users\\vkravchenko\\IdeaProjects\\Test.txt'): ");
        String filePath = consoleFilePath.nextLine();

        Scanner consolePattern = new Scanner(System.in);
        System.out.println("Please input pattern which you would like to check (e.g. ([a-z]{10,10}) or 'slot'): ");
        String pattern = consolePattern.nextLine();

        Reader fileFromConsole = new Reader();
        fileFromConsole.read(filePath, pattern.toLowerCase());
    }
}
