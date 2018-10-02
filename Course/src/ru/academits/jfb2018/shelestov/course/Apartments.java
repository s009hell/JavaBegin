package ru.academits.jfb2018.shelestov.course;

import java.util.Scanner;

public class Apartments {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите количество подъездов: ");
        int entrancesCount = scanner.nextInt();

        System.out.print("Введите количество этажей: ");
        int floorsCount = scanner.nextInt();

        System.out.print("Введите номер искомой квартиры: ");
        int roomNumber = scanner.nextInt();

        int roomsOnFloor = 4; //количесво квартир на этаже
        int countRoomsOfHouse = entrancesCount * floorsCount * roomsOnFloor; //количество квартир в доме
        int countRoomsOfEntrance = floorsCount * roomsOnFloor; //количество квартир в подъезде

        if (roomNumber < 1 || roomNumber > countRoomsOfHouse) {
            System.out.println("Такого номера квартиры нет в доме.");
        } else {
            //поиск положения квартиры на этаже
            int location = roomNumber % roomsOnFloor;
            switch (location) {
                case 1:
                    System.out.print("Искомая квартира ближняя слева. ");
                    break;
                case 2:
                    System.out.print("Искомая квартира дальняя слева. ");
                    break;
                case 3:
                    System.out.print("Искомая квартира дальняя справа. ");
                    break;
                case 0:
                    System.out.print("Искомая квартира ближняя справа. ");
                    break;
            }

            //поиск подъезда
            int findEntrance = (int) Math.ceil((double) roomNumber / countRoomsOfEntrance);
            System.out.print("Квартира находится в " + findEntrance + " подъезде, на ");

            //поиск этажа
            int findFloor = (int) Math.ceil(((double) (roomNumber - (findEntrance - 1) * countRoomsOfEntrance)) / roomsOnFloor);
            System.out.println(findFloor + " этаже.");
        }
    }
}
