package com.fatin.bank;

/**
 *
 * @author MOHAMMAD FATIN NUR
 */
public class Main {
    public static void main(String[] args) {

        System.out.println("Bank Account Management System\n\n");
        SavingsAccount sa = new SavingsAccount("SA001", 10000, 5);
        sa.calculateInterest(5);
        System.out.println(sa);
        sa.deposit(500);
        sa.withdraw(2000);
        System.out.println(sa); 
        sa.calculateInterest(10);
        System.out.println(sa);

        CheckingAccount ca = new CheckingAccount("CA001", 10000, 1000);
        ca.deductTransectionFee(5000);
        System.out.println(ca);
        ca.deposit(500);
        ca.withdraw(2000);
        System.out.println(ca);
        ca.deductTransectionFee(5000);
        System.out.println(ca);
    }
}