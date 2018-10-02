package ru.academits.jfb2018.shelestov.lesson2;

import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("*** Вычисление площади круга и длины его окружности через радиус ***");

        System.out.print("Введите радиус круга: ");
        double radius = scanner.nextDouble();

        double area = Math.PI * Math.pow(radius, 2);
        System.out.printf("Площадь круга: %.3f", area);

        double length = 2 * Math.PI * radius;
        System.out.printf(System.lineSeparator() + "Длина окружности: %.3f", length);

        System.out.println();
        System.out.println(System.lineSeparator() + "*** Вычисление радиуса круга через площадь ***");

        System.out.print("Введите площадь круга: ");
        area = scanner.nextDouble();

        radius = Math.sqrt(area / Math.PI);
        System.out.printf("Радиус круга: %.3f", radius);

        System.out.println();
        System.out.println(System.lineSeparator() + "*** Вычисление площади сектора ***");

        System.out.print("Введите радиус круга: ");
        radius = scanner.nextDouble();

        System.out.print("Введите угол сектора: ");
        double corner = scanner.nextDouble();

        double sector = Math.PI * Math.pow(radius, 2) * corner / 360;
        System.out.printf("Площадь сектора: %.3f", sector);
    }
}
