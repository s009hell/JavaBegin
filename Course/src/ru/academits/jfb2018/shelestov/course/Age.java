package ru.academits.jfb2018.shelestov.course;

import java.util.Scanner;

public class Age {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age = 5;

        //добавил цикл, для выхода - ввести 0
        while (age != 0) {
            System.out.print("Введите Ваш возраст: ");
            age = scanner.nextInt();

            if (age > 112) {
                System.out.println("Вы слишком стары.");
            } else if (age < 1) {
                System.out.println("Вы слишком малы.");
            } else {
                if (age % 10 == 1 && age % 100 != 11) {
                    System.out.printf("Вам %d год.", age);
                } else if (age / 10 % 10 != 1 && age % 10 > 1 && age % 10 < 5) {
                    System.out.printf("Вам %d года.", age);
                } else {
                    System.out.printf("Вам %d лет.", age);
                }
                System.out.println();
            }
        }
    }
}