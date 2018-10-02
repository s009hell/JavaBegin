package ru.academits.jfb2018.shelestov.course;

import java.util.Scanner;

public class MaxSubstring {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите строку: ");
        String line = scanner.nextLine();

        System.out.println("Максимальная длина подстроки: " + maxSubstring(line));
    }

    private static int  maxSubstring(String line) {
        if (line.length() == 0) {
            return 0;
        }

        int symbolCount = 1;
        int maxSubstring = 1;

        for (int i = 1; i < line.length(); i++) {
            if (Character.toLowerCase(line.charAt(i)) == Character.toLowerCase(line.charAt(i - 1))) {
                symbolCount++;
            } else {
                symbolCount = 1;
            }

            if (symbolCount > maxSubstring) {
                maxSubstring = symbolCount;
            }
        }

        return maxSubstring;
    }
}
