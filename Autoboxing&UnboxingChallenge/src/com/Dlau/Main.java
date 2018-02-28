package com.Dlau;

public class Main {

    public static void main(String[] args) {
	    Bank bank = new Bank("National Australia Bank");

        bank.addBranch("Adelaide");

        bank.addCustomer("Adelaide", "Daniel", 50.05);
        bank.addCustomer("Adelaide", "Tim", 175.43);
        bank.addCustomer("Adelaide", "Mike", 34.13);

        bank.addBranch("Sydney");
        bank.addCustomer("Sydney", "Bob", 150.54);

        bank.addCustomerTransaction("Adelaide", "Daniel", 12.20);
        bank.addCustomerTransaction("Adelaide", "Tim", 34.32);
        bank.addCustomerTransaction("Adelaide", "Daniel", 322.00);

        bank.listCustomers("Adelaide", true);
    }
}
