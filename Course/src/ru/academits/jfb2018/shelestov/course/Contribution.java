package ru.academits.jfb2018.shelestov.course;

import java.util.Scanner;

public class Contribution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите начальный взнос: ");
        double contribution = scanner.nextDouble();

        System.out.print("Введите годовую процентную ставку: ");
        double percentProfit = scanner.nextDouble();

        System.out.print("Введите срок вклада (месяцев): ");
        int months = scanner.nextInt();

        double profit = 0;
        int monthsInYear = 12;
        int percent = 100;
        double totalContribution = contribution;

        for (int i = 1; i <= months; i++) {
            profit += (contribution + profit) * (percentProfit / monthsInYear / percent);
        }

        totalContribution += profit;

        System.out.printf("Прибыль от вклада составит %.1f. Сумма вклада составит %.1f.", profit, totalContribution);
    }
}
