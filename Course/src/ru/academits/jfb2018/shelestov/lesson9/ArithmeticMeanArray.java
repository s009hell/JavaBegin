package ru.academits.jfb2018.shelestov.lesson9;

public class ArithmeticMeanArray {
    public static void main(String[] args) {
        int[] intArray = {1, 2, 3, 4, 5, 6, 7, 8, 9};


        System.out.println("Среднее арифметическое четных чисел массива: " + calculateArithmeticMean(intArray));
    }

    private static double calculateArithmeticMean(int[] array) {
        int sum = 0;
        int count = 0;

        for (int arrayNumber : array) {
            if (arrayNumber % 2 == 0) {
                sum += arrayNumber;
                count++;
            }
        }

        return (double) sum / count;
    }
}
