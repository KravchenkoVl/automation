package com.playtika.automation;

import java.lang.*;

public class HomeWork_3_1 {
    public static void main(String[] args) {
        StringBuilder str1 = new StringBuilder("dadadadadad");
        String strHelp = str1.toString();
        StringBuilder str2 = new StringBuilder(str1.reverse());
        System.out.println("строка 1     " + str1);
        System.out.println("строка Help  " + strHelp);
        System.out.println("строка 2     " + str2);
        if (strHelp.equals(str2.toString())) {
            System.out.println("Да");
        } else {
            System.out.println("Нет");
        }
    }
}