package ru.academits.jfb2018.shelestov.course;

import java.util.Scanner;

public class FindBinary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = {0, 2, 5, 8, 15, 21, 24, 57, 62, 77, 81, 82, 99};

        System.out.print("Введите искомое число: ");
        int number = scanner.nextInt();

        if (findIndexBinary(array, number, 0, array.length - 1) == -1) {
            System.out.println("Искомый элемент не найден.");
        } else {
            System.out.println("Индекс искомого элемента: " + findIndexBinary(array, number, 0, array.length - 1));
        }

        System.out.print("Введите искомое число: ");
        number = scanner.nextInt();

        if (findIndexCycle(array, number) == -1) {
            System.out.println("Искомый элемент не найден.");
        } else {
            System.out.println("Индекс искомого элемента: " + findIndexCycle(array, number));
        }
    }

    private static int findIndexBinary(int[] array, int number, int left, int right) {
        if (left > right) {
            return -1;
        }

        int middle = (left + right) / 2;

        if (array[middle] == number) {
            return middle;
        } else if (number > array[middle]) {
            return findIndexBinary(array, number, middle + 1, right);
        } else {
            return findIndexBinary(array, number, left, middle - 1);
        }
    }

    private static int findIndexCycle(int[] array, int number) {
        int left = 0;
        int right = array.length - 1;

        while (left <= right) {
            int middle = (left + right) / 2;

            if (array[middle] == number) {
                return middle;
            } else if (number > array[middle]) {
                left = middle + 1;
            } else {
                right = middle - 1;
            }
        }

        return -1;
    }
}
