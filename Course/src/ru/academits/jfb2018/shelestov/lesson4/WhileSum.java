package ru.academits.jfb2018.shelestov.lesson4;

public class WhileSum {
    public static void main(String[] args) {
        int i = 0;
        int sum = 0;

        while (i <= 9) {
            sum += i;
            i++;
        }

        System.out.println("Сумма чисел от 0 до 9: " + sum);

        i = 3;
        sum = 0;

        while (i <= 21) {
            sum += i;
            i++;
        }

        System.out.println("Сумма чисел от 3 до 21: " + sum);

        i = 3;
        sum = 0;
        int count = 0;

        while (i <= 21) {
            if (i % 2 == 0) {
                sum += i;
                count++;
            }
            i++;
        }

        System.out.println("Сумма четных чисел в диапазоне от 3 до 21: " + sum);
        System.out.println("Количество четных чисел: " + count);
    }
}
