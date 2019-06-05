package com.playtika.automation.homeworks.hw8_filereader;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Please input file path (e.g. 'C:\\Users\\vkravchenko\\IdeaProjects\\Test.txt'):");
        String filePath = console.nextLine();
        Reader file = new Reader();
        file.read(filePath);
    }
}
