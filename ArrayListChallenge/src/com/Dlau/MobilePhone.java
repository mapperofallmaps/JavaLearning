package com.Dlau;

import java.util.ArrayList;

/**
 * Created by Daniel on 25/08/2017.
 */
public class MobilePhone {

    private String myNumber;
    private ArrayList<Contacts> mobilePhone;

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        this.mobilePhone = new ArrayList<Contacts>();
    }

    public void printContacts() {
        System.out.println("You have " + mobilePhone.size() + " number of of contacts");
        for(int i=0; i<mobilePhone.size(); i++) {
            System.out.println((i+1) + ". " + mobilePhone.get(i).getName() + " - " +
            mobilePhone.get(i).getPhoneNumber());
        }
    }

    public boolean addNewContact(Contacts contact) {
        if(findContact(contact.getName()) >=0) {
            System.out.println("Contact is already on file");
            return false;
        }
        mobilePhone.add(contact);
        return true;
    }

    private int findContact(Contacts contact) {
        return this.mobilePhone.indexOf(contact);
    }

    private int findContact(String contactName) {
        for(int i=0; i<this.mobilePhone.size(); i++) {
            Contacts contact = this.mobilePhone.get(i);
            if(contact.getName().equals(contactName)) {
                return i;
            }
        }
        return -1;
    }

    public boolean updateContact(Contacts oldContact, Contacts newContact) {
        int foundPosition = findContact(oldContact);
        if(foundPosition <0) {
            System.out.println(oldContact.getName() + ", was not found.");
            return false;
        }

        this.mobilePhone.set(foundPosition, newContact);
        System.out.println(oldContact.getName() + ", was replaced with " + newContact.getName());
        return true;
    }

    public String queryContact(Contacts contact) {
        if(findContact(contact) >= 0) {
            return contact.getName();
        }
        return null;
    }

    public Contacts queryContact(String name) {
        int position = findContact(name);
        if(position >=0) {
            return this.mobilePhone.get(position);
        }
        return null;
    }

    public boolean removeContact(Contacts contact) {
        int foundPosition = findContact(contact);
        if(foundPosition <0) {
            System.out.println(contact.getName() + ", was not found.");
            return false;
        }
        this.mobilePhone.remove(foundPosition);
        System.out.println(contact.getName() + ", was deleted");
        return true;
    }


}
