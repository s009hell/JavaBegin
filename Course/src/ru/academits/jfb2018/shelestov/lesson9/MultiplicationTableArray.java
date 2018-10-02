package ru.academits.jfb2018.shelestov.lesson9;

import java.util.Scanner;

public class MultiplicationTableArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите размер таблицы умножения: ");
        int size = scanner.nextInt();

        int[][] multiplicationTable = createTable(size);

        for (int[] i : multiplicationTable) {
            for(int j : i) {
                System.out.print(j + "\t");
            }
            System.out.println();
        }
    }

    private static int[][] createTable(int size) {
        int[][] multiplicationTable = new int[size][size];

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                multiplicationTable[i][j] = (i + 1) * (j + 1);
            }
        }

        return multiplicationTable;
    }
}
