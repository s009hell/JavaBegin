package ru.academits.jfb2018.shelestov.lesson7;

import java.util.Scanner;

public class RangeDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите начальное число первого диапазона: ");
        double from1 = scanner.nextDouble();

        System.out.print("Введите конечное число первого диапазона: ");
        double to1 = scanner.nextDouble();

        Range range1 = new Range(from1, to1);

        System.out.print("Введите начальное число второго диапазона: ");
        double from2 = scanner.nextDouble();

        System.out.print("Введите конечное число второго диапазона: ");
        double to2 = scanner.nextDouble();

        Range range2 = new Range();
        range2.setFrom(from2);
        range2.setTo(to2);

        System.out.println("Длина первого диапазона от " + range1.getFrom() + " до " + range1.getTo() + ": " + range1.calculateLength());
        System.out.println("Длина первого диапазона от " + range2.getFrom() + " до " + range2.getTo() + ": " + range2.calculateLength());

        System.out.print("Введите число на проверку вхождения диапазон: ");
        double numberRange = scanner.nextDouble();

        if (range1.isInside(numberRange)) {
            System.out.println("Число входит в первый диапазон.");
        } else {
            System.out.println("Число не входит в первый диапазон.");
        }

        if (range2.isInside(numberRange)) {
            System.out.println("Число входит во второй диапазон.");
        } else {
            System.out.println("Число не входит во второй диапазон.");
        }
    }
}
