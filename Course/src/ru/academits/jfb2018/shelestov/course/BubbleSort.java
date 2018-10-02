package ru.academits.jfb2018.shelestov.course;

public class BubbleSort {
    public static void main(String[] args) {
        int[] array = {2, 9, 6, 1, 5, 4, 7, 8, 3, 0};

        System.out.print("Исходный массив: ");
        for (int x : array) {
            System.out.print(x + " ");
        }

        System.out.println();

        System.out.print("Отсортированный массив: ");
        for (int x : sortArray(array)) {
            System.out.print(x + " ");
        }
    }

    private static int[] sortArray(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            boolean isSorted = true;

            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    isSorted = false;
                }
            }

            if (isSorted) {
                return array;
            }
        }

        return array;
    }
}
