package ru.academits.jfb2018.shelestov.lesson10;

import java.util.Scanner;

public class EuclideanAlgorithm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        int firstNumber = scanner.nextInt();

        System.out.print("Введите второе число: ");
        int secondNumber = scanner.nextInt();

        System.out.println("Наибольший общий делитель: " + gcd(firstNumber, secondNumber));
    }

    private static int gcd(int firstNumber, int secondNumber) {
        if (secondNumber == 0) {
            return firstNumber;
        }

        if (firstNumber % secondNumber == 0) {
            return secondNumber;
        } else {
            return gcd(secondNumber, firstNumber % secondNumber);
        }
    }
}
