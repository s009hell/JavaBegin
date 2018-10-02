package ru.academits.jfb2018.shelestov.course;

public class SelectionSort {
    public static void main(String[] args) {
        int[] array = {2, 9, 6, 1, 5, 4, 7, 8, 3, 0, 2, 3};

        System.out.print("Исходный массив: ");
        for (int x : array) {
            System.out.print(x + " ");
        }

        System.out.println();
        sortArray(array);

        System.out.print("Отсортированный массив: ");
        for (int x : array) {
            System.out.print(x + " ");
        }
    }

    private static void sortArray(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int min = array[i];
            int minIndex = i;

            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < min) {
                    min = array[j];
                    minIndex = j;
                }
            }

            array[minIndex] = array[i];
            array[i] = min;
        }
    }
}
