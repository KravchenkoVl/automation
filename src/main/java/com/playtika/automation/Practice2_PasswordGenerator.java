package com.playtika.automation;

import java.util.concurrent.ThreadLocalRandom;

public class Practice2_PasswordGenerator {
    public static final String SPEC_ALPHABET = "!@#$%^&*";
    public static final String NUMBER_ALPHABET = "0123456789";
    public static final String SYMB_ALPHABET = "abcdefghigklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println(generatePassword(25));
        }
    }

    public static String generatePassword(int passwordSize) {
        StringBuilder password = new StringBuilder();
        boolean specExist = false;
        int numberCount = 0;
        while (password.length() < passwordSize) {
            int path = ThreadLocalRandom.current().nextInt(3);
            char letter = 0;
            switch (path) {
                case 0:
                    if (!specExist) {
                        letter = getRandomChar(SPEC_ALPHABET);
                        specExist = true;
                    } else {
                        continue;
                    }
                    break;
                case 1:
                    if (numberCount < 3) {
                        numberCount++;
                        letter = getRandomChar(NUMBER_ALPHABET);
                    } else {
                        continue;
                    }
                    break;
                case 2:
                    letter = getRandomChar(SYMB_ALPHABET);
                    break;
            }
            if (password.length() == 0
                    || password.charAt(password.length() - 1) != letter) {
                password.append(letter);
            } else {
                continue;
            }
        }
        return password.toString();
    }

    public static char getRandomChar(String alphabet) {
        int index = ThreadLocalRandom.current().nextInt(alphabet.length());
        return alphabet.charAt(index);
    }
}