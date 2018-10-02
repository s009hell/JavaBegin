package ru.academits.jfb2018.shelestov.lesson3;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите год: ");
        int year = scanner.nextInt();

        if (year <= 0) {
            System.out.println("Необходимо ввести год от Рождества Христова.");
        } else {
            if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
                System.out.println("Это високосный год.");
            } else {
                System.out.println("Это не високосный год.");
            }
        }
    }
}