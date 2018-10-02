package ru.academits.jfb2018.shelestov.lesson4;

import java.util.Locale;
import java.util.Scanner;

public class ArithmeticMean {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        System.out.print("Введите начало диапазона чисел: ");
        int start = scanner.nextInt();

        System.out.print("Введите конец диапазона чисел: ");
        int end = scanner.nextInt();

        int sum = 0;
        int count = 0;
        int i = start;

        while(i <= end) {
            sum += i;
            i++;
            count++;
        }

        System.out.println("Среднее арифметическое чисел: " + (double) sum / count);

        i = start;

        while(i <= end) {
            if (i % 2 == 0) {
                sum += i;
                count++;
            }
            i++;
        }

        System.out.println("Среднее арифметическое четных чисел: " + (double) sum / count);
    }
}
