package com.playtika.automation.homeworks.hw3_arrays;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Validator {
    public static void main(String[] args) {
        validationName();
        validationPhoneNumber();
        validationEMail();
    }

    public static void validationName() {
        Pattern patternFIO = Pattern.compile("^(([A-z][a-z]{0,20})((-|\\s)[A-z][a-z]{0,20})?)\\s(([A-z][a-z]{0,20})((-|\\s)[A-z][a-z]{0,20})?)\\s(([A-z][a-z]{0,20})((-|\\s)[A-z][a-z]{0,20})?)$");
        Scanner console = new Scanner(System.in);
        System.out.print("Введите ФИО: ");
        while (console.hasNextLine()) {
            String line = console.nextLine();
            if (patternFIO.matcher(line).matches()) {
                System.out.printf("ФИО введены корректно%n%n");
                return;
            } else {
                System.out.println("ФИО введены некорректно");
                System.out.print("Повторите ввод ФИО: ");
            }
        }
    }

    public static void validationPhoneNumber() {
        Pattern patternPhoneNumber = Pattern.compile("^((\\+380)(50|66|67|97|96|98|99|68)[0-9]{7})$");
        Scanner console = new Scanner(System.in);
        System.out.print("Введите номер телефона: ");
        while (console.hasNextLine()) {
            String phoneNumber = console.nextLine();
            if (patternPhoneNumber.matcher(phoneNumber).matches()) {
                System.out.printf("Введен корректный номер телефона%n%n");
                return;
            } else {
                System.out.println("Введен невалидный номер телефона");
                System.out.print("Повторите ввод номера телефона: ");
            }
        }
    }

    public static void validationEMail() {
        Pattern patternEMail = Pattern.compile("^(([A-z][A-z0-9]{0,10})((-|_)[A-z0-9]{3,10})?)@([a-z]{2,10}\\.[a-z]{2,6})");
        Scanner console = new Scanner(System.in);
        System.out.print("Введите e-mail: ");
        while (console.hasNextLine()) {
            String eMail = console.nextLine();
            if (patternEMail.matcher(eMail).matches()) {
                System.out.printf("Введен корректный e-mail%n");
                return;
            } else {
                System.out.println("Введен невалидный e-mail");
                System.out.print("Повторите ввод e-mail: ");
            }
        }
    }
}
