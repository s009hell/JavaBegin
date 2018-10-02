package ru.academits.jfb2018.shelestov.lesson3;

import java.util.Scanner;

public class MinMax {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        int x = scanner.nextInt();

        System.out.print("Введите второе число: ");
        int y = scanner.nextInt();

        int min;
        int max;

        if (x > y) {
            max = x;
            min = y;
        } else {
            max = y;
            min = x;
        }

        System.out.println("*** if/else ***");
        System.out.println("Наибольшее число: " + max);
        System.out.println("Наименьшее число: " + min + System.lineSeparator());

        max = (x > y) ? x : y;
        min = (x > y) ? y : x;

        System.out.println("*** тернарный оператор ***");
        System.out.println("Наибольшее число: " + max);
        System.out.println("Наименьшее число: " + min);
    }
}
