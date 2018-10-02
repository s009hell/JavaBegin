package ru.academits.jfb2018.shelestov.lesson4;

import java.util.Locale;
import java.util.Scanner;

public class SwitchCommands2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        System.out.print("Введите число a: ");
        double a = scanner.nextDouble();

        System.out.print("Введите число b: ");
        double b = scanner.nextDouble();

        System.out.print("Введите код команды (1 - 4): ");
        int command = scanner.nextInt();

        switch (command) {
            case 1:
                System.out.printf("%.2f + %.2f = %.2f", a, b, a + b);
                break;
            case 2:
                System.out.printf("%.2f - %.2f = %.2f", a, b, a - b);
                break;
            case 3:
                System.out.printf("%.2f * %.2f = %.2f", a, b, a * b);
                break;
            case 4:
                System.out.printf("%.2f / %.2f = %.2f", a, b, a / b);
                break;
            default:
                System.out.println("Неизветсная команда.");
        }
    }
}
