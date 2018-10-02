package ru.academits.jfb2018.shelestov.lesson9;

public class UpperCaseArray {
    public static void main(String[] args) {
        String[] stringArray = {"Андрей", "Борис", "Виталий", "Геннадий", "Дмитрий"};
        stringArray = convertToUpperCase(stringArray);

        for(String arrayElement: stringArray) {
            System.out.println(arrayElement);
        }
    }

    private static String[] convertToUpperCase(String[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = array[i].toUpperCase();
        }

        return array;
    }
}
