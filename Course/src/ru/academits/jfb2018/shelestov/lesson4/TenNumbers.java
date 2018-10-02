package ru.academits.jfb2018.shelestov.lesson4;

import java.util.Scanner;

public class TenNumbers {
    public static void main(String[] args) {
        int i = 1;
        int count = 0;

        while (i <= 100) {
            System.out.printf("%4d", i);
            count++;
            i++;
            if (count == 10) {
                System.out.println();
                count = 0;
            }
        }

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите начальное число: ");
        int x = scanner.nextInt();

        System.out.print("Введите конечное число: ");
        int y = scanner.nextInt();

        System.out.print("Введите количество чисел в строке: ");
        int n = scanner.nextInt();

        while (x <= y) {
            System.out.printf("%5d", x);
            count++;
            x++;
            if (count == n) {
                System.out.println();
                count = 0;
            }
        }
    }
}
