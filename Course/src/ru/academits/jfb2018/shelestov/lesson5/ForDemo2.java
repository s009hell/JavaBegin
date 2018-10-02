package ru.academits.jfb2018.shelestov.lesson5;

import java.util.Scanner;

public class ForDemo2 {
    public static void main(String[] args) {
        for (int i = 100; i >= 1; i--) {
            if (i % 4 == 0) {
                System.out.print(i + " ");
            }
        }

        System.out.println();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество чисел: ");
        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.print((int) Math.pow(i, 2) + " ");
        }

        System.out.println();

        System.out.print("Введите начальное число: ");
        int x = scanner.nextInt();
        System.out.print("Введите конечное число: ");
        int y = scanner.nextInt();

        int count = 0;
        int sum = 0;

        for (int i = x; i <= y; i++) {
            sum += i;
            count++;
        }

        double arithmeticMean = (double) sum / count;

        System.out.println("Среднее арифметическое диапазона чисел: " + arithmeticMean);
    }
}
