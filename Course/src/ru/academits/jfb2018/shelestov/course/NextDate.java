package ru.academits.jfb2018.shelestov.course;

import java.util.Scanner;

public class NextDate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число: ");
        int day = scanner.nextInt();

        System.out.print("Введите месяц: ");
        int month = scanner.nextInt();

        System.out.print("Введите год: ");
        int year = scanner.nextInt();

        boolean isCorrectDate = false;
        boolean isLeapYear = ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0);

        if ((isLeapYear && month == 2 && day == 29) || (!isLeapYear && month == 2 && day == 28)) {
            day = 1;
            month = 3;
            isCorrectDate = true;
        } else if (month == 12 && day == 31) {
            day = 1;
            month = 1;
            year++;
            isCorrectDate = true;
        } else if ((month == 4 || month == 6 || month == 9 || month == 11) && day == 30) {
            day = 1;
            month++;
            isCorrectDate = true;
        } else if (day == 31 && month < 12 && month != 2 && month != 4 && month != 6 && month != 9 && month != 11) {
            day = 1;
            month++;
            isCorrectDate = true;
        } else if (day < 31 && month <= 12 && month != 2) {
            day++;
            isCorrectDate = true;
        } else if (day < 28 && month == 2) {
            day++;
            isCorrectDate = true;
        }

        if (isCorrectDate) {
            System.out.printf("Следующая дата: %d.%d.%d", day, month, year);
        } else {
            System.out.println("Вы ввели некорректную дату.");
        }
    }
}
