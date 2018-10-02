package ru.academits.jfb2018.shelestov.course;

import java.util.Scanner;

public class EuclideanAlgorithm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        int a = scanner.nextInt();

        System.out.print("Введите второе число: ");
        int b = scanner.nextInt();

        int gcd = 0;

        while (gcd == 0) {
            if (a % b == 0) {
                gcd = b;
            } else {
                int temporaryA = a;
                a = b;
                b = temporaryA % b;
            }
        }

        System.out.println("Наибольший общий делитель: " + gcd);
    }
}
