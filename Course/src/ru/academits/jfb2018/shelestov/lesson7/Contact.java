package ru.academits.jfb2018.shelestov.lesson7;

class Contact {
    private String name;
    private String lastName;
    private String telephoneNumber;

    Contact(String name, String lastName, String telephoneNumber) {
        this.name = name;
        this.lastName = lastName;
        this.telephoneNumber = telephoneNumber;
    }

    Contact() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getTelephoneNumber() {
        return telephoneNumber;
    }

    public void setTelephoneNumber(String telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
    }
}
