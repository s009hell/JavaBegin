package ru.academits.jfb2018.shelestov.lesson4;

import java.util.Locale;
import java.util.Scanner;

public class SwitchCommands1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        System.out.print("Введите команду (print, sum): ");
        String command = scanner.nextLine();

        switch (command) {
            case "print":
                System.out.print("Введите строку: ");
                String line = scanner.nextLine();
                System.out.println("Вы ввели \"" + line + "\".");
                break;
            case "sum":
                System.out.print("Введите число a: ");
                double a = scanner.nextDouble();

                System.out.print("Введите число b: ");
                double b = scanner.nextDouble();

                System.out.println("Сумма чисел: " + (a + b));
                break;
            default:
                System.out.println("Неизветсная команда.");
        }
    }
}
