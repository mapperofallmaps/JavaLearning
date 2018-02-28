package com.Dlau;

/**
 * Created by Daniel on 25/08/2017.
 */
public class Contacts {
    private String phoneNumber;
    private String name;

    public Contacts(String name, String phoneNumber) {
        this.phoneNumber = phoneNumber;
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getName() {
        return name;
    }

    public static Contacts createContact(String name, String phoneNumber) {
        return new Contacts(name, phoneNumber);
    }
}
