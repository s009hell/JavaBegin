package ru.academits.jfb2018.shelestov.lesson6;

public class ResultFunc {
    public static void main(String[] args) {
        System.out.println(calc3XPlus4Y(4, 2));
        System.out.println(getArithmeticMean(1, 2));
        System.out.println(getMax(7, 12));
        System.out.println(getMin(7, 12));
    }

    private static double calc3XPlus4Y(double x, double y) {
        return 3 * x + 4 * y;
    }

    private static double getArithmeticMean(int begin, int end) {
        int sum = 0;
        int count = 0;

        for (int i = begin; i <= end; i++) {
            sum += i;
            count++;
        }

        return (double) sum / count;
    }

    private static int getMax(int number1, int number2) {
        return number1 > number2 ? number1 : number2;
    }

    private static int getMin(int number1, int number2) {
        return number1 < number2 ? number1 : number2;
    }
}
