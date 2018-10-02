package ru.academits.jfb2018.shelestov.lesson5;

import java.util.Scanner;

public class GuessLine {
    public static void main(String[] args) {
        String line = "абвгдейка";
        Scanner scanner = new Scanner(System.in);

        System.out.print("Загадана строка. Попробуй угадать ее: ");

        for (; ; ) {
            String answer = scanner.nextLine();
            if (line.equals(answer)) {
                System.out.println("Правильно!");
                break;
            }
            System.out.print("Неправильно. Попробуй еще раз: ");
        }
    }
}
