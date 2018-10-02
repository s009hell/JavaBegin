package ru.academits.jfb2018.shelestov.lesson1;

import java.util.Scanner;

public class YearOfBirth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Какой сейчас год?");
        int year = scanner.nextInt();

        System.out.println(System.lineSeparator() + "Сколько Вам лет?");
        int age = scanner.nextInt();

        int yearOfBirth = year - age;
        System.out.println(System.lineSeparator() + "Вы родились в " + yearOfBirth + " году.");
    }
}
