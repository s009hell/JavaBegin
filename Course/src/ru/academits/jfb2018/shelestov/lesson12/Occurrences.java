package ru.academits.jfb2018.shelestov.lesson12;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class Occurrences {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(new FileInputStream("input.txt"), "windows-1251")) {
            StringBuilder sb = new StringBuilder();

            while (scanner.hasNextLine()) {
                sb.append(scanner.nextLine()).append(System.lineSeparator());
            }

            Scanner scanner2 = new Scanner(System.in);
            System.out.print("Введите искомую подстроку: ");
            String subLine = scanner2.nextLine();

            System.out.println("Число вхождений: " + getOccurrences(sb, subLine));
        } catch (IOException exc) {
            System.out.println("Ошибка при чтении файла.");
        }
    }

    private static int getOccurrences(StringBuilder line, String searchLine) {
        searchLine = searchLine.toUpperCase();
        String lineUpCase = line.toString().toUpperCase();

        int occurrencesIndex = 0;
        int startIndex = 0;
        int occurrencesCount = 0;

        while (occurrencesIndex != -1) {
            occurrencesIndex = lineUpCase.indexOf(searchLine, startIndex);

            if (occurrencesIndex != -1) {
                occurrencesCount++;
                startIndex = occurrencesIndex + searchLine.length();
            }
        }

        return occurrencesCount;
    }
}
