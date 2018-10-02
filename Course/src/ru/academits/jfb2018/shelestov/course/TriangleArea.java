package ru.academits.jfb2018.shelestov.course;

import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите координаты первой точки:");
        System.out.print("x1 = ");
        double x1 = scanner.nextDouble();
        System.out.print("y1 = ");
        double y1 = scanner.nextDouble();

        System.out.println("Введите координаты второй точки:");
        System.out.print("x2 = ");
        double x2 = scanner.nextDouble();
        System.out.print("y2 = ");
        double y2 = scanner.nextDouble();

        System.out.println("Введите координаты третьей точки:");
        System.out.print("x3 = ");
        double x3 = scanner.nextDouble();
        System.out.print("y3 = ");
        double y3 = scanner.nextDouble();

        Triangle triangle = new Triangle(x1, x2, x3, y1, y2, y3);

        if (triangle.isLine()) {
            System.out.println("Точки лежат на одной прямой.");
        } else {
            System.out.printf("Площадь прямоугольника %.1f кв.ед.", triangle.calculateArea());
        }
    }
}
