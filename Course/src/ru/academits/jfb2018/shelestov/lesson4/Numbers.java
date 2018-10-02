package ru.academits.jfb2018.shelestov.lesson4;

import java.util.Scanner;

public class Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число: ");
        int number = scanner.nextInt();

        int n = number;
        int sum = 0;

        while (n != 0) {
            sum += (n % 10);
            n /= 10;
        }

        System.out.println("Сумма цифр числа: " + sum);

        n = number;
        sum = 0;

        while (n != 0) {
            if (n % 10 % 2 == 1) {
                sum += (n % 10);
            }
            n /= 10;
        }

        System.out.println("Сумма нечетных цифр числа: " + sum);

        int max = 0;
        n = number;

        while (n != 0) {
            if (n % 10 > max) {
                max = n % 10;
            }
            n /= 10;
        }

        System.out.println("Максимальная цифра числа: " + max);
    }
}
