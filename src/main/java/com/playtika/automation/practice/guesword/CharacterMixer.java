package com.playtika.automation.practice.guesword;

import java.util.concurrent.ThreadLocalRandom;

public class CharacterMixer {
    public String mix(String word) {
        char[] characters =  word.toCharArray();
        for (int i = 0; i < characters.length; i++) {
            int j = ThreadLocalRandom.current().nextInt(characters.length);
            char temp = characters[i];
            characters[i] = characters[j];
            characters[j] = temp;
        }
        return new String(characters);
    }
}
