package ru.academits.jfb2018.shelestov.lesson7;

public class ContactDemo {
    public static void main(String[] args) {
        Contact contact1 = new Contact("Петр", "Иванов", "89996543423");

        System.out.println(contact1.getLastName());
        System.out.println(contact1.getName());
        System.out.println(contact1.getTelephoneNumber());

        System.out.println();

        Contact contact2 = new Contact();
        contact2.setLastName("Макарова");
        contact2.setName("Ирина");
        contact2.setTelephoneNumber("87776665544");

        System.out.println(contact2.getLastName());
        System.out.println(contact2.getName());
        System.out.println(contact2.getTelephoneNumber());
    }
}
