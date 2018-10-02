package ru.academits.jfb2018.shelestov.lesson12;

public class LineSplitting {
    public static void main(String[] args) {
        String line = "1, 2, 3, 4, 5";
        String[] array = line.split(", ");

        int sum = 0;

        for (String x : array) {
            sum += Integer.parseInt(x);
        }

        System.out.println("Сумма чисел: " + sum);
    }
}
