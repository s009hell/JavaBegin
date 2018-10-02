package ru.academits.jfb2018.shelestov.lesson2;

import java.util.Locale;
import java.util.Scanner;

public class Rectangle {

    /**
     * Площадь прямоугольника вычисляется путем умножение длины на ширину.
     * Периметр прямоугольника вычисляется путем умножения на 2 суммы длины и шрины.
     */

    public static void main(String[] args) {
        /* программа вычисляет площадь и периметр прямоугольника
        по заданным ширине и длине,
        которые вводятся пользователем */

        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        System.out.print("Введите длину прямоугольника: ");
        double length = scanner.nextDouble();

        System.out.print("Введите ширину прямоугольника: ");
        double width = scanner.nextDouble();

        double area = length * width; //вычисление площади прямоугольника
        double perimeter = (length + width) * 2; //вычисление периметра прямоугольника
        //TODO: реализовать вычисление диагонали прямоугольника

        System.out.printf("%n Параметры прямоугольника: %n Длина - %.1f %n Ширина - %.1f %n " +
                "Площадь - %.1f %n Периметр - %.1f %n", length, width, area, perimeter);
    }
}
