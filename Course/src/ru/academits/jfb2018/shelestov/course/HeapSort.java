package ru.academits.jfb2018.shelestov.course;

public class HeapSort {
    public static void main(String[] args) {
        int[] array = {9, 6, 1, 5, 4, 7, 8, 0, 2, 3};

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
        int arraySize = array.length;

        for (int i = arraySize / 2 - 1; i >= 0; i--) {
            sortElementToHeap(array, i, arraySize);
        }

        while (arraySize > 1) {
            swapElements(array, 0, arraySize - 1);
            arraySize--;
            sortElementToHeap(array, 0, arraySize);
        }
    }

    private static void sortElementToHeap(int[] array, int index, int arraySize) {
        while (index <= (arraySize - 1) / 2) {
            int biggestElement = index;
            if (getSecondChild(index) < arraySize && array[index] < array[getSecondChild(index)]) {
                biggestElement = getSecondChild(index);
            }
            if (getFirstChild(index) < arraySize && array[biggestElement] < array[getFirstChild(index)]) {
                biggestElement = getFirstChild(index);
            }
            if (array[index] < array[biggestElement]) {
                swapElements(array, index, biggestElement);
                index = biggestElement;
            } else {
                break;
            }
        }
    }


    private static int getFirstChild(int i) {
        return 2 * i + 1;
    }

    private static int getSecondChild(int i) {
        return 2 * i + 2;
    }

    private static void swapElements(int[] array, int firstElement, int secondElement) {
        int temp = array[firstElement];
        array[firstElement] = array[secondElement];
        array[secondElement] = temp;
    }

}
