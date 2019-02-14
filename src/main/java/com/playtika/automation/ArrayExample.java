package com.playtika.automation;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public class ArrayExample {
    public static void main(String[] args) {
        int[] array = new int[100];
        for (int i = 0; i < array.length; i++) {
            array[i] = ThreadLocalRandom.current().nextInt();
        }
/*      for (int i = 0; i < array.length; i++) {
            System.out.printf("array[%d] : %d%n", i, array[i]);
        }
*/
        System.out.println(Arrays.toString(array));
    }
}
