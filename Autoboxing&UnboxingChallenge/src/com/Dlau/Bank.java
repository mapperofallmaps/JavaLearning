package com.Dlau;

import java.util.ArrayList;

/**
 * Created by Daniel on 25/08/2017.
 */
public class Bank {
    private String name;
    private ArrayList<Branch> branch;

    public Bank(String name) {
        this.name = name;
        this.branch = new ArrayList<Branch>();
    }

    public boolean addBranch(String branchName) {
        if(findBranch(branchName) == null) {
            this.branch.add(new Branch(branchName));
            return true;
        }
        return false;
    }

    public boolean addCustomer(String branchName, String customerName, double initialAmount) {
        Branch branch = findBranch(branchName);
        if(branch != null) {
            return branch.createNewCustomer(customerName, initialAmount);
        }
        return false;
    }

    public boolean addCustomerTransaction(String branchName, String customerName, double amount) {
        Branch branch = findBranch(branchName);
        if(branch != null) {
            return branch.addTransaction(customerName, amount);
        }
        return false;
    }

    private Branch findBranch(String branchName) {
        for(int i=0; i<this.branch.size(); i++) {
            Branch checkBranch = this.branch.get(i);
            if(checkBranch.getBranchName().equals(branchName)) {
                return checkBranch;
            }
        }
        return null;
    }

    public boolean listCustomers(String branchName, boolean showTransactions) {
        Branch branch = findBranch(branchName);
        if(branch != null) {
            System.out.println("Customer for branch " + branch.getBranchName());

            ArrayList<Customer> branchCustomers = branch.getCustomers();
            for(int i=0; i<branchCustomers.size(); i++) {
                Customer branchCustomer = branchCustomers.get(i);
                System.out.println("Customer: " + branchCustomer.getName() + "[" + (i+1) + "]");
                if(showTransactions) {
                    System.out.println("Transactions");
                    ArrayList<Double> transactions = branchCustomer.getTransactions();
                    for(int j=0; j<transactions.size(); j++) {
                        System.out.println("[" + (j+1) + "] Amount" + transactions.get(j));
                    }
                }
            }
            return true;
        } else {
            return false;
        }
    }
}
