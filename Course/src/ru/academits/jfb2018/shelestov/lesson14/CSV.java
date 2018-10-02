package ru.academits.jfb2018.shelestov.lesson14;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class CSV {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Ошибка запуска программы.");
            System.out.println("Запуск программы: java CVS.class <путь к исходному файлу> <путь к выходному файлу>");
            return;
        }

        try (Scanner scanner = new Scanner(new FileInputStream(args[0]), "windows-1251"); PrintWriter writer = new PrintWriter(args[1], "windows-1251")) {
            writer.println("<!DOCTYPE HTML>");
            writer.println("<html>");
            writer.println("\t<head>");
            writer.println("\t\t<title>Разбор формата CSV</title>");
            writer.println("\t</head>");
            writer.println("\t<body>");
            writer.println("\t\t<table>");

            while (scanner.hasNextLine()) {
                writer.println("\t\t\t<tr>");

                String line = scanner.nextLine();
                StringBuilder detailText = new StringBuilder();
                boolean isFullDetail = true;

                for (int i = 0; i < line.length(); i++) {
                    if (line.charAt(i) == '"') {
                        if (isFullDetail) {
                            isFullDetail = false;
                            continue;
                        } else if (i != line.length() - 1 && line.charAt(i + 1) == '"') {
                            i++;
                        } else {
                            isFullDetail = true;

                            if (i == line.length() - 1) {
                                writer.println("\t\t\t\t<td>" + detailText + "</td>");
                            }

                            continue;
                        }
                    } else if (line.charAt(i) == '<') {
                        detailText.append("&lt;");
                        continue;
                    } else if (line.charAt(i) == '>') {
                        detailText.append("&gt;");
                        continue;
                    } else if (line.charAt(i) == '&') {
                        detailText.append("&amp;");
                        continue;
                    }

                    if (isFullDetail) {
                        if (i == line.length() - 1 && line.charAt(i) != ',') {
                            detailText.append(line.charAt(i));
                            writer.println("\t\t\t\t<td>" + detailText + "</td>");
                            continue;
                        } else if (line.charAt(i) == ',') {
                            writer.println("\t\t\t\t<td>" + detailText + "</td>");
                            detailText = new StringBuilder();

                            if (i == line.length() - 1) {
                                writer.println("\t\t\t\t<td></td>");
                            }

                            continue;
                        }
                    } else if (i == line.length() - 1) {
                        detailText.append(line.charAt(i));
                        detailText.append("<br>");

                        if (scanner.hasNextLine()) {
                            line = scanner.nextLine();
                            i = -1;
                        }

                        continue;
                    }

                    detailText.append(line.charAt(i));
                }

                writer.println("\t\t\t</tr>");
            }

            writer.println("\t\t</table>");
            writer.println("\t</body>");
            writer.println("</html>");

            System.out.println("Готово!");
        } catch (IOException exc) {
            System.out.println("Ошибка при чтении/записи файла.");
            System.out.println("Запуск программы: java CVS.class <путь к исходному файлу> <путь к выходному файлу>");
        }
    }
}
