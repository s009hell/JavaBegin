package ru.academits.jfb2018.shelestov.lesson8;

import java.util.Locale;
import java.util.Scanner;

public class CountChars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        System.out.print("Введите строку: ");
        String line = scanner.nextLine();

        int lettersCount = 0;
        int digitsCount = 0;
        int whitespacesCount = 0;
        int otherCharsCount = 0;

        for (int i = 0; i < line.length(); i++) {
            if (Character.isLetter(line.charAt(i))) {
                lettersCount++;
            } else if (Character.isDigit(line.charAt(i))) {
                digitsCount++;
            } else if (Character.isWhitespace(line.charAt(i))) {
                whitespacesCount++;
            } else {
                otherCharsCount++;
            }
        }

        System.out.println("Количество букв в строке: " + lettersCount);
        System.out.println("Количество цифр в строке: " + digitsCount);
        System.out.println("Количество пробелов в строке: " + whitespacesCount);
        System.out.println("Количество остальных символов в строке: " + otherCharsCount);
    }
}
