package com.Dlau;

import java.util.ArrayList;

/**
 * Created by Daniel on 25/08/2017.
 */
public class Branch {
    private String branchName;
    private ArrayList<Customer> customers;

    public Branch(String branchName) {
        this.branchName = branchName;
        this.customers = new ArrayList<Customer>();
    }

    public boolean createNewCustomer(String customerName, double initialAmount) {
        if(findCustomer(customerName) == null) {
            this.customers.add(new Customer(customerName, initialAmount));
            return true;
        }
        return false;
    }

    private Customer findCustomer(String customerName) {
        for(int i=0; i<this.customers.size(); i++) {
            Customer customer = this.customers.get(i);
            if(customer.getName().equals(customerName)) {
                return customer;
            }
        }
        return null;
    }

    public boolean addTransaction(String customerName, double transaction) {
        Customer existingCustomer = findCustomer(customerName);

        if(existingCustomer != null) {
            existingCustomer.addTransaction(transaction);
            return true;
        }
        return false;
    }

    public String getBranchName() {
        return branchName;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }
}
