package ru.academits.jfb2018.shelestov.lesson6;

import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите температуру в градусах Цельсия: ");
        double celsius = scanner.nextDouble();

        System.out.println("Данная температура в градусах Кельвина: " + getKelvin(celsius));
        System.out.println("Данная температура в градусах Фаренгейта: " + getFahrenheit(celsius));
    }

    private static double getKelvin(double celsius) {
        return celsius + 273.15;
    }

    private static double getFahrenheit(double celsius) {
        return celsius * 1.8 + 32;
    }


}
