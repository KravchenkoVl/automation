package com.playtika.automation.practice.guesword;

import java.util.concurrent.ThreadLocalRandom;

public class WordSource {
    private static final String[] WORDS = {
            "animal",
            "planet",
            "discovery",
            "earth",
            "ocean"
    };

    public String getWord() {
        int i = ThreadLocalRandom.current().nextInt(WORDS.length);
        return WORDS[i];
    }
}
