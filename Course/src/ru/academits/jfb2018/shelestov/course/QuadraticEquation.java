package ru.academits.jfb2018.shelestov.course;

import java.util.Scanner;

public class QuadraticEquation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("*** Решение квадратного уравнения ***");

        System.out.print("Введите коэффицент a: ");
        double a = scanner.nextDouble();

        System.out.print("Введите коэффицент b: ");
        double b = scanner.nextDouble();

        System.out.print("Введите коэффицент c: ");
        double c = scanner.nextDouble();

        double x1;
        double x2;
        double epsilon = 1.0e-10;

        if (Math.abs(a) <= epsilon) {
            if (Math.abs(b) > epsilon) {
                x1 = -c / b;
                System.out.printf("Корень один: %.3f", x1);
            } else if (Math.abs(c) <= epsilon) {
                System.out.println("Корнем может быть любое число.");
            } else {
                System.out.println("Корней нет.");
            }
        } else {
            double discriminant = Math.pow(b, 2) - 4 * a * c;

            if (discriminant < -epsilon) {
                System.out.println("Корней нет");
            } else if (Math.abs(discriminant) <= epsilon) {
                x1 = (-b / (2 * a));
                System.out.printf("Корень один: %.3f", x1);
            } else {
                x1 = (-b + Math.sqrt(discriminant)) / (2 * a);
                x2 = (-b - Math.sqrt(discriminant)) / (2 * a);
                System.out.printf("Корней два: %.3f | %.3f", x1, x2);
            }
        }
    }
}
