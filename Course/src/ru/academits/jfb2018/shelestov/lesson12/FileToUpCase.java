package ru.academits.jfb2018.shelestov.lesson12;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FileToUpCase {
    public static void main(String[] args) {
        try (PrintWriter writer = new PrintWriter("output.txt", "windows-1251");
             Scanner scanner = new Scanner(new FileInputStream("input.txt"), "windows-1251")) {
            while (scanner.hasNextLine()) {
                writer.println(scanner.nextLine().toUpperCase());
            }
        } catch (IOException exc) {
            System.out.println("Ошибка при чтении/записи файла.");
        }
    }
}
