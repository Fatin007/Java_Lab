package com.fatin.bank;

/**
 *
 * @author MOHAMMAD FATIN NUR
 */
public class BankAccount {
    private String accNo;
    private double balance;
    public BankAccount(String accNo, double balance) {
        this.accNo = accNo;
        this.balance = balance;
    }

    public String getAccNo() {
        return accNo;
    }

    public double getBalance() {
        return balance;
    }

    public void setAccNo(String accNo) {
        this.accNo = accNo;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println(amount + " Taka deposit successful!!!");
        System.out.println("Current balance: " + balance + " Taka" + "\n");
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println(amount + " Taka withdrawal successful!!!");
            System.out.println("Current balance: " + balance + " Taka" + "\n");
        } 
        else {
            System.out.println("Insufficient balance!!!");
            System.out.println("Current balance: " + balance + " Taka" + "\n");
        }
    }

    public String toString() {
        return "Account No: " + accNo + "\nBalance: " + balance;
    }
}