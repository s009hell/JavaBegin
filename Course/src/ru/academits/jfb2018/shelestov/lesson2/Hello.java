package ru.academits.jfb2018.shelestov.lesson2;

import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Как тебя зовут?");
        String name = scanner.nextLine();
        System.out.println("Привет, " + name + "!");
    }
}
