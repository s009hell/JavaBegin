package ru.academits.jfb2018.shelestov.lesson9;

public class FindArrayElement {
    public static void main(String[] args) {
        int[] intArray = {56, 83, 87, 12, 44, 98, 55, 87, 54, 21};

        if(findElement(intArray, 44) >= 0) {
            System.out.println("элемент найден, его индекс " + findElement(intArray, 44));
        } else {
            System.out.println("Искомый элемент не найден.");
        }

        if(findElement(intArray, 33) >= 0) {
            System.out.println("элемент найден, его индекс " + findElement(intArray, 44));
        } else {
            System.out.println("Искомый элемент не найден.");
        }
    }

    private static int findElement(int[] array, int number){
        for (int i = 0; i < array.length; i++) {
            if (array[i] == number) {
                return i;
            }
        }

        return -1;
    }
}
