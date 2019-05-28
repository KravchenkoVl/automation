package com.playtika.automation.homework.homework7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner consoleFilePath = new Scanner(System.in);
        System.out.println("Please input file path (e.g. 'C:\\Users\\vkravchenko\\IdeaProjects\\Test.txt'): ");
        String filePath = consoleFilePath.nextLine();

        Scanner consolePattern = new Scanner(System.in);
        System.out.printf("Please input pattern which you would like to check (e.g. ([a-z]{10,10}) or 'slot'): \n" +
                                  "or ^(([A-Z][a-z]{0,20})([-][A-Z][a-z]{0,20})?)\\s(([A-Z][a-z]{0,20})([-][A-Z][a-z]{0,20})?)\\s(([A-Z][a-z]{0,20})" +
                                  "([-][A-Z][a-z]{0,20})?)$ \n");
        String pattern = consolePattern.nextLine();
        Reader fileFromConsole = new Reader();
        fileFromConsole.read(filePath, pattern.toLowerCase());
    }
}
