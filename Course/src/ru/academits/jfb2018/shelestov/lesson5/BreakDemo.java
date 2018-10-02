package ru.academits.jfb2018.shelestov.lesson5;

public class BreakDemo {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            System.out.print(i + " ");
            if (i >= 30) {
                break;
            }
        }
    }
}
