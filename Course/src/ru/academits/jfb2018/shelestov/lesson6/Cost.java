package ru.academits.jfb2018.shelestov.lesson6;

import java.util.Scanner;

public class Cost {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите количество первого товара: ");
        int volumeProduct1 = scanner.nextInt();

        System.out.print("Введите цену первого товара: ");
        int priceProduct1 = scanner.nextInt();

        System.out.print("Введите количество второго товара: ");
        int volumeProduct2 = scanner.nextInt();

        System.out.print("Введите цену второго товара: ");
        int priceProduct2 = scanner.nextInt();

        System.out.println("Стоимость товаров составит: " + getCost(volumeProduct1, volumeProduct2, priceProduct1, priceProduct2) + " условных единиц.");
    }

    private static double getCost(int volumeProduct1, int volumeProduct2, int priceProduct1, int priceProduct2) {
        double maxDiscount = 0.9;
        double minDiscount = 0.95;
        int minVolumeDiscount = 10;
        int minPriceDiscount = 1000;

        int summaryProductVolume = volumeProduct1 + volumeProduct2;
        double summaryCost = volumeProduct1 * priceProduct1 + volumeProduct2 * priceProduct2;

        if (summaryProductVolume >= minVolumeDiscount && summaryCost >= minPriceDiscount) {
            return summaryCost * maxDiscount;
        } else if (summaryProductVolume >= minVolumeDiscount || summaryCost >= minPriceDiscount) {
            return summaryCost * minDiscount;
        } else {
            return summaryCost;
        }
    }
}
