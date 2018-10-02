package ru.academits.jfb2018.shelestov.lesson9;

public class CheckSortArray {
    public static void main(String[] args) {
        int[] intArray1 = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        if (isUpSort(intArray1)) {
            System.out.println("Массив отсортирован по возрастанию.");
        } else if (isDownSort(intArray1)) {
            System.out.println("Массив отсортирован по убыванию.");
        } else {
            System.out.println("Массив не отсортирован.");
        }

        int[] intArray2 = {9, 8, 7, 6, 5, 4, 3, 2, 1};

        if (isUpSort(intArray2)) {
            System.out.println("Массив отсортирован по возрастанию.");
        } else if (isDownSort(intArray2)) {
            System.out.println("Массив отсортирован по убыванию.");
        } else {
            System.out.println("Массив не отсортирован.");
        }
    }

    private static boolean isUpSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                return false;
            }
        }

        return true;
    }

    private static boolean isDownSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] < array[i + 1]) {
                return false;
            }
        }

        return true;
    }
}
