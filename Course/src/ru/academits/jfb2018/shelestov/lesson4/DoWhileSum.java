package ru.academits.jfb2018.shelestov.lesson4;

public class DoWhileSum {
    public static void main(String[] args) {
        int i = 0;
        int sum = 0;

        do {
            sum += i;
            i++;
        } while (i <= 9);

        System.out.println("Сумма чисел от 0 до 9: " + sum);

        i = 3;
        sum = 0;

        do {
            sum += i;
            i++;
        } while (i <= 21);

        System.out.println("Сумма чисел от 3 до 21: " + sum);

        i = 3;
        sum = 0;
        int count = 0;

        do {
            if (i % 2 == 0) {
                sum += i;
                count++;
            }
            i++;
        } while (i <= 21);

        System.out.println("Сумма четных чисел в диапазоне от 3 до 21: " + sum);
        System.out.println("Количество четных чисел: " + count);
    }
}
