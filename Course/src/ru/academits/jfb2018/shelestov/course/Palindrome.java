package ru.academits.jfb2018.shelestov.course;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите строку: ");
        String line = scanner.nextLine();

        if (isPalindrome(line)) {
            System.out.println("Введеная строка является палиндромом.");
        } else {
            System.out.println("Введеная строка не является палиндромом.");
        }
    }

    private static boolean isPalindrome(String line) {
        int lastSymbol = line.length() - 1;

        for (int firstSymbol = 0; firstSymbol <= lastSymbol; firstSymbol++) {

            while (!Character.isLetter(line.charAt(firstSymbol)) && firstSymbol < lastSymbol) {
                firstSymbol++;
            }

            while (!Character.isLetter(line.charAt(lastSymbol)) && lastSymbol > firstSymbol) {
                lastSymbol--;
            }

            if (!Character.isLetter(line.charAt(firstSymbol))) {
                return false;
            }

            if (Character.toLowerCase(line.charAt(firstSymbol)) == Character.toLowerCase(line.charAt(lastSymbol))) {
                lastSymbol--;
                continue;
            }

            return false;
        }

        return true;
    }
}
