package ru.academits.jfb2018.shelestov.lesson6;

import java.util.Scanner;

public class PrintAndRead {
    public static void main(String[] args) {
        int firstNumber = printAndRead("Ввеите первое число: ");
        int secondNumber = printAndRead("Введите второе число: ");

        System.out.println("Сумма чисел: " + (firstNumber + secondNumber));
    }

    private static int printAndRead(String request) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(request);
        return scanner.nextInt();
    }
}
