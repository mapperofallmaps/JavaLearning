package com.Dlau;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static MobilePhone mobilePhone = new MobilePhone("04813928978");

    public static void main(String[] args) {
	    boolean quit = false;
        startPhone();
        printActions();
        while(!quit) {
            System.out.println("\nEnter actions: (6 to show availabe actions");
            int action = scanner.nextInt();
            scanner.nextLine();

            switch (action) {
                case 0:
                    System.out.println("\nShutting down....");
                    quit = true;
                    break;

                case 1:
                    mobilePhone.printContacts();
                    break;

                case 2:
                    addNewContact();
                    break;

                case 3:
                    updateContact();
                    break;

                case 4:
                    removeContact();
                    break;

                case 5:
                    queryContact();
                    break;

                case 6:
                    printActions();
                    break;
            }

        }
    }

    private static void addNewContact() {
        System.out.println("Enter new contact name: ");
        String name = scanner.nextLine();
        System.out.println("Enter new phone number: ");
        String phone = scanner.nextLine();
        Contacts newContact = Contacts.createContact(name, phone);
        if(mobilePhone.addNewContact(newContact)) {
            System.out.println("New contact added: name = " + name + ", phone = " + phone);
        } else {
            System.out.println("Cannot add, " + name + " already is on file");
        }
    }

    private static void updateContact() {
        System.out.println("Enter existing contact name: ");
        String name = scanner.nextLine();
        Contacts existingContact = mobilePhone.queryContact(name);
        if(existingContact == null) {
            System.out.println("Contact not found");
            return;
        }

        System.out.println("Enter new contact name: ");
        String newName = scanner.nextLine();
        System.out.println("Enter new phone number: ");
        String newNumber = scanner.nextLine();
        Contacts newContact = Contacts.createContact(newName, newNumber);
        mobilePhone.updateContact(existingContact, newContact);
    }

    private static void removeContact() {
        System.out.println("Enter existing contact name: ");
        String name = scanner.nextLine();
        Contacts existingContact = mobilePhone.queryContact(name);
        if (existingContact == null) {
            System.out.println("Contact not found");
            return;
        }
        mobilePhone.removeContact(existingContact);
    }

    private static void queryContact() {
        System.out.println("Enter existing contact name: ");
        String name = scanner.nextLine();
        Contacts existingContact = mobilePhone.queryContact(name);
        if (existingContact == null) {
            System.out.println("Contact not found");
            return;
        }
        System.out.println("Name: " +existingContact.getName() + "phone number is " +
        existingContact.getPhoneNumber());
    }

    private static void startPhone() {
        System.out.println("Starting phone....");
    }

    private static void printActions() {
        System.out.println("\nAvailable actions:\npress");
        System.out.println("0 - to shutdown\n" +
                           "1 - to print contacts\n" +
                           "2 - to add a new contact\n" +
                           "3 - to update an existing contact\n" +
                           "4 - to remove an existing contact\n" +
                           "5 - query if an existing contact exists\n" +
                           "6 - to print a list of available actions." );
        System.out.println("Choose your actions: ");
    }
}
