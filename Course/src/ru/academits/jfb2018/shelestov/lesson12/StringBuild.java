package ru.academits.jfb2018.shelestov.lesson12;

public class StringBuild {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();

        for (int i = 1; i <= 100; i++) {
            sb.append(i);
            if (i < 100) {
                sb.append(", ");
            }

        }

        System.out.println(sb);
    }
}
