package ru.academits.jfb2018.shelestov.lesson3;

import java.util.Scanner;

public class If {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите целое число: ");
        int x = scanner.nextInt();

        if (x >= 0) {
            System.out.println("Данное число положительное");
        }

        if (x % 2 == 0) {
            System.out.println("Число четное");
        }

        if (x % 5 == 0) {
            System.out.println("Число кратно 5");
        }
    }
}
