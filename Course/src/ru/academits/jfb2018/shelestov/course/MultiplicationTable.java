package ru.academits.jfb2018.shelestov.course;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите конечное число таблицы умножения: ");
        int endNumber = scanner.nextInt();

        System.out.print("    |");

        for (int i = 1; i <= endNumber; i++) {
            System.out.printf("%5d",i);
        }

        System.out.println();

        for (int i = 1; i <= endNumber * 5 + 5; i++) {
            System.out.print("-");
        }

        System.out.println();

        for (int i = 1; i <= endNumber; i++) {
            System.out.printf("%4d|",i);
            for (int j = 1; j <= endNumber; j++) {
                System.out.printf("%5d",i * j);
            }
            System.out.println();
        }
    }
}
