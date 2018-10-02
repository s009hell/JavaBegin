package ru.academits.jfb2018.shelestov.course;

public class QuickSort {
    public static void main(String[] args) {
        int[] array = {12, 66, 43, 23, 98, 123, 512, 17, 76, 34};

        System.out.print("Исходный массив: ");
        for (int x : array) {
            System.out.print(x + " ");
        }

        System.out.println();
        sortArray(array, 0, array.length - 1);

        System.out.print("Отсортированный массив: ");
        for (int x : array) {
            System.out.print(x + " ");
        }
    }

    private static void sortArray(int[] array, int left, int right) {
        if (left == right) {
            return;
        }

        if (right - left == 1) {
            if (array[left] > array[right]) {
                int temp = array[left];
                array[left] = array[right];
                array[right] = temp;
            }
        }

        int supportElement = (array[left] + array[right]) / 2;

        int i = left;
        int j = right;

        while (i <= j) {
            while (array[i] < supportElement) {
                i++;
            }

            while (array[j] > supportElement) {
                j--;
            }

            if (i <= j) {
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                i++;
                j--;
            }
        }

        if (i < right) {
            sortArray(array, i, right);
        }

        if (j > left) {
            sortArray(array, left, j);
        }
    }
}
