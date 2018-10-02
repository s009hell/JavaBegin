package ru.academits.jfb2018.shelestov.lesson14;

public class Determinant {
    public static void main(String[] args) {
        double[][] array = {
                {1.3, -2.0, 3.7},
                {5.5, 4.3, -3.1},
                {4.9, -5.8, 1.1},
        };

        System.out.println("Определитель матрицы: " + getDeterminant(array));
    }

    private static double getDeterminant(double[][] array) {
        if (array.length == 1) {
            return array[0][0];
        } else if (array.length == 2) {
            return array[0][0] * array[1][1] - array[0][1] * array[1][0];
        } else {
            double determinant = 0;

            for (int i = 0; i < array.length; i++) {
                if (i % 2 == 0) {
                    determinant += array[0][i] * getDeterminant(openMatrix(array, i));
                } else {
                    determinant -= array[0][i] * getDeterminant(openMatrix(array, i));
                }
            }

            return determinant;
        }
    }

    private static double[][] openMatrix(double[][] array, int i) {
        int arraySize = array.length - 1;
        double newArray[][] = new double[arraySize][arraySize];

        for (int j = 0; j < newArray.length; j++) {
            int deleteColumn = i;

            for (int k = 0; k < newArray.length; k++) {
                if (k == deleteColumn) {
                    newArray[j][k] = array[j + 1][k + 1];
                    deleteColumn++;
                } else {
                    newArray[j][k] = array[j + 1][k];
                }
            }
        }

        return newArray;
    }
}
