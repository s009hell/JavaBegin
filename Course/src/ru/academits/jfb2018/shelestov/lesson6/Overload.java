package ru.academits.jfb2018.shelestov.lesson6;

public class Overload {
    public static void main(String[] args) {
        System.out.println("byte: " + getTypeSize((byte) 2));
        System.out.println("short: " + getTypeSize((short) 333));
        System.out.println("int: " + getTypeSize(1231412));
        System.out.println("long: " + getTypeSize(312312L));
        System.out.println("float: " + getTypeSize(123.456F));
        System.out.println("double: " + getTypeSize(1.2));
    }

    private static int getTypeSize(byte type) {
        return 1;
    }

    private static int getTypeSize(short type) {
        return 2;
    }

    private static int getTypeSize(int type) {
        return 4;
    }

    private static int getTypeSize(long type) {
        return 8;
    }

    private static int getTypeSize(float type) {
        return 4;
    }

    private static int getTypeSize(double type) {
        return 8;
    }
}
