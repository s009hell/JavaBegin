package ru.academits.jfb2018.shelestov.lesson3;

import java.util.Scanner;

public class Password {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String truePassword = "qwerty";

        System.out.print("Введите пароль: ");
        String password = scanner.nextLine();

        if (truePassword.equals(password)) {
            System.out.println("Пароль верный!");
        } else if (truePassword.length() > password.length()) {
            System.out.println("Пароль неверный! Строка слишком короткая.");
        } else if (truePassword.length() < password.length()) {
            System.out.println("Пароль неверный! Строка слишком длинная.");
        } else {
            System.out.println("Пароль неверный!");
        }
    }
}
