package ru.academits.jfb2018.shelestov.lesson12;

import java.util.Scanner;

public class URL {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите URL адрес: ");
        String url = scanner.nextLine();

        System.out.println(getServerName(url));
    }

    private static String getServerName(String url) {
        int startIndex = url.indexOf("://") + 3;
        int endIndex = url.indexOf("/", startIndex);

        if (endIndex == -1) {
            endIndex = url.length();
        }

        return url.substring(startIndex, endIndex);
    }
}
