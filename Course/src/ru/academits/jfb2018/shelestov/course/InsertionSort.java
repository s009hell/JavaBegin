package ru.academits.jfb2018.shelestov.course;

public class InsertionSort {
    public static void main(String[] args) {
        int[] array = {2, 9, 6, 1, 5, 4, 7, 8, 3, 0, 2, 3};

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
        for (int i = 1; i < array.length; i++) {
            int temp = array[i];

            for (int j = i - 1; ; j--) {
                if (j < 0 || temp >= array[j]) {
                    array[j + 1] = temp;
                    break;
                } else {
                    array[j + 1] = array[j];
                }
            }
        }

        return array;
    }
}
