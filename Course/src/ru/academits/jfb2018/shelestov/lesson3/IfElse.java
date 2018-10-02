package ru.academits.jfb2018.shelestov.lesson3;

import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите целое число: ");
        int x = scanner.nextInt();

        if (x > 0) {
            System.out.println("Данное число положительное");
        } else if (x == 0) {
            System.out.println("Данное число равно нулю");
        } else {
            System.out.println("Данное число отрицательное");
        }
    }
}
