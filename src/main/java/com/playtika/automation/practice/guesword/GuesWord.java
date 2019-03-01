package com.playtika.automation.practice.guesword;

import java.util.Scanner;

public class GuesWord {
    private CharacterMixer characterMixer;
    private final WordSource wordSource;

    public GuesWord() {
        this.characterMixer = new CharacterMixer();
        this.wordSource = new WordSource();
    }

    public void playGame() {
        Scanner console = new Scanner(System.in);
        String word = wordSource.getWord();
        System.out.printf("Угадайте слово: %s%n", characterMixer.mix(word));
        String toCheck = console.nextLine();
        if (toCheck.equalsIgnoreCase(word)) {
            System.out.println("Молодец");
        } else {
            System.out.println("Не молодец");
        }
    }

    public static void main(String[] args) {
        GuesWord word = new GuesWord();
        word.playGame();
    }
}
