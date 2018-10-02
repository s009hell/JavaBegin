package ru.academits.jfb2018.shelestov.course;

import java.util.Scanner;

public class FibonacciNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите порядковый номер числа: ");
        int sequence = scanner.nextInt();

        int fibonacci = 0;
        int prevNumber = 1;
        int i = 1;

        while (i <= sequence) {
            fibonacci += prevNumber;
            prevNumber = fibonacci - prevNumber;
            i++;
        }

        System.out.println("Число Фибоначчи - " + fibonacci);
    }
}
