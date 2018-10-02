package ru.academits.jfb2018.shelestov.lesson4;

import java.util.Locale;
import java.util.Scanner;

public class Equality {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        System.out.print("Введите число a: ");
        double a = scanner.nextDouble();

        System.out.print("Введите число b: ");
        double b = scanner.nextDouble();

        double epsilon = 1.0e-10;

        if (Math.abs(a - b) <= epsilon) {
            System.out.println("Числа равны.");
        } else {
            System.out.println("Числа не равны.");
        }
    }
}
