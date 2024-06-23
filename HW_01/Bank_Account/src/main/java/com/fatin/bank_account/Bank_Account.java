package com.fatin.bank_account;

class Account {
    String accNo;
    String name;
    double balance;
    String type;

    public Account(String accNo, String name, double balance, String type) {
        this.accNo = accNo;
        this.name = name;
        this.balance = balance;
        this.type = type;
    }

    void deposit(double amount) {
        balance += amount;
        System.out.println(amount + "taka deposited successfully.\nNew balance: " + balance + "taka\n");
    }

    void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println(amount + "taka withdrawn successfully.\nNew balance: " + balance + "taka\n");
        } else {
            System.out.println("Insufficient balance.\n");
        }
    }

    double getBalance() {
        return balance;
    }

    public String getAccNo() {
        return accNo;
    }

    public void display() {
        System.out.println("Account Number: " + accNo);
        System.out.println("Account Holder Name: " + name);
        System.out.println("Balance: " + balance);
        System.out.println("Account Type: " + type);
        System.out.println();
    }
}