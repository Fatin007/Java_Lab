package com.fatin.bank;

public class SavingsAccount extends BankAccount{
    private double interestRate;
    public SavingsAccount(String accNo, double balance, double interestRate) {
        super(accNo, balance);
        this.interestRate = interestRate;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public void calculateInterest(int year) {
        double interest = getBalance() * interestRate * year / 100;
        deposit(interest);
        System.out.println("Interest: " + interest + " Taka");
    }

    public String toString() {
        return super.toString() + "\nInterest Rate: " + interestRate + "%\n";
    }
}