package ru.academits.jfb2018.shelestov.lesson9;

public class MaxArrayNumber {
    public static void main(String[] args) {
        double[] doubleArray = new double[]{123.76, 8.0, 282.01, 123.45, 876.22, 534.21, 999.0, 123.321, 876.756};

        System.out.println("Максимальное число в массиве: " + findMaxElement(doubleArray));
    }

    private static double findMaxElement(double[] array) {
        double maxNumber = array[0];

        for (double arrayElement : array) {
            if (arrayElement > maxNumber) {
                maxNumber = arrayElement;
            }
        }

        return maxNumber;
    }
}
