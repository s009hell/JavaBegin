package ru.academits.jfb2018.shelestov.lesson10;

public class Pow {
    public static void main(String[] args) {
        System.out.println(powRecursion(2,9));
        System.out.println(powCycle(2, 9));
        System.out.println(Math.pow(2, 9));
    }

    private static int powRecursion(int base, int  exponent) {
        if (exponent == 0) {
            return 1;
        }

        return  base * powRecursion(base, exponent - 1);
    }

    private static int powCycle(int base, int  exponent) {
        if (exponent == 0) {
            return 1;
        }

        int result = base;

        for (int i = 1; i < exponent; i++) {
            result *= base;
        }

        return result;
    }
}
