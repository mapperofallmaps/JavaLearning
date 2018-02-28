package com.Dlau;

/**
 * Created by Daniel on 19/08/2017.
 */
public class BankAccount {

    private int accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private int phoneNumber;

    public BankAccount() {
        this(56789, 2.5, "Default name", "Default address", 000);
        System.out.println("Empty constructor called");
    }

    public BankAccount(int accountNumber, double balance, String customerName,
                       String email, int phoneNumber) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public BankAccount(String customerName, String email, int phoneNumber) {
        this(99999, 100.55, customerName, email, phoneNumber);
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }
    public int getAccountNumber() {return this.accountNumber; }

    public void setBalance(double balance) {
        this.balance = balance;
    }
    public double getBalance() {return this.balance; }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
    public String getCustomerName() {return this.customerName; }

    public void setEmail(String email) {
        this.email = email;
    }
    public String getEmail() {return this.email; }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public int getPhoneNumber() {return this.phoneNumber; }

    public void depositFunds(double funds) {
        this.balance += funds;
        System.out.println(funds + " was deposited into the Bank Account, " + this.balance + " is the total balance");
    }

    public void withdrawfunds(double funds) {
        if(balance >= funds) {
            this.balance -= funds;
            System.out.println(funds + " is withdrawn from the Bank Account, " + this.balance + " is remaining");
        } else {
            System.out.println("Only " + this.balance + " available. Withdrawal no processed");
        }
    }
}
