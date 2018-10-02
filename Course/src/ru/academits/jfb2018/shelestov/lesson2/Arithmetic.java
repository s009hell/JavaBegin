package ru.academits.jfb2018.shelestov.lesson2;

public class Arithmetic {
    public static void main(String[] args) {
        System.out.println("Операции над целыми числами:");
        int x1 = 20, x2 = 6;

        int iResult = x1 + x2;
        System.out.printf("%d + %d = %d" + System.lineSeparator(), x1, x2, iResult);

        iResult = x1 - x2;
        System.out.printf("%d - %d = %d" + System.lineSeparator(), x1, x2, iResult);

        iResult = x1 * x2;
        System.out.printf("%d * %d = %d" + System.lineSeparator(), x1, x2, iResult);

        iResult = x1 / x2;
        System.out.printf("%d / %d = %d" + System.lineSeparator(), x1, x2, iResult);

        iResult = x1 % x2;
        System.out.printf("%d %% %d = %d" + System.lineSeparator(), x1, x2, iResult);

        System.out.println("Операции над вещественнми числами:");

        double y1 = 33.8, y2 = 11.2;

        double dResult = y1 + y2;
        System.out.printf("%.1f + %.1f = %.1f" + System.lineSeparator(), y1, y2, dResult);

        dResult = y1 - y2;
        System.out.printf("%.1f - %.1f = %.1f" + System.lineSeparator(), y1, y2, dResult);

        dResult = y1 * y2;
        System.out.printf("%.1f * %.1f = %.2f" + System.lineSeparator(), y1, y2, dResult);

        dResult = y1 / y2;
        System.out.printf("%.1f / %.1f = %.3f" + System.lineSeparator(), y1, y2, dResult);

        dResult = y1 % y2;
        System.out.printf("%.1f %% %.1f = %.1f" + System.lineSeparator(), y1, y2, dResult);

    }
}
