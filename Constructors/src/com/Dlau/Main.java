package com.Dlau;

public class Main {

    public static void main(String[] args) {

        BankAccount bobsAccount = new BankAccount();

//        BankAccount bobsAccount = new BankAccount(12345, 0, "Bob Brown",
//                "myemail@bob.com", 1234567890);

        System.out.println(bobsAccount.getAccountNumber());
        System.out.println(bobsAccount.getBalance());

        bobsAccount.withdrawfunds(100.0);

        bobsAccount.depositFunds(50.0);
        bobsAccount.withdrawfunds(100.0);

        bobsAccount.depositFunds(51.0);
        bobsAccount.withdrawfunds(100.0);

        BankAccount danielsAccount = new BankAccount("Daniel", "daniel@email.com", 12345);
        System.out.println(danielsAccount.getAccountNumber() +
                " name " +danielsAccount.getCustomerName());

        VipCustomer customer1 = new VipCustomer();
        System.out.println(customer1.getName());

        VipCustomer customer2 = new VipCustomer("BoB", 2500.00);
        System.out.println(customer2.getName());

        VipCustomer customer3 = new VipCustomer("Tim", 100.00, "tim@email.com");
        System.out.println(customer3.getName());
        System.out.println(customer3.getEmail());
    }
}
