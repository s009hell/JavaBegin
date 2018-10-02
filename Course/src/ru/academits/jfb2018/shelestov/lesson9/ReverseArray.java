package ru.academits.jfb2018.shelestov.lesson9;

public class ReverseArray {
    public static void main(String[] args) {
        int[] intArray = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        intArray = reverseArray(intArray);

        for (int arrayNumber : intArray) {
            System.out.print(arrayNumber + " ");
        }
    }

    private static int[] reverseArray(int[] array) {
        int lastNumber = array.length - 1;

        for (int firstNumber = 0; firstNumber < lastNumber; firstNumber++, lastNumber--) {
            int temp = array[firstNumber];
            array[firstNumber] = array[lastNumber];
            array[lastNumber] = temp;
        }

        return array;
    }
}
