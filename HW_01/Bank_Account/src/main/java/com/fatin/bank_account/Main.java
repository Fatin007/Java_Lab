package com.fatin.bank_account;
import java.util.*;

public class Main {
    static Account a[] = new Account[50];
    static int cnt = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("\n1. Create a new account");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Check Balance");
            System.out.println("5. Display Account Details");
            System.out.println("6. Exit");
            System.out.print("Enter option: ");
            int op = sc.nextInt();
            sc.nextLine();
            switch (op) {
                case 1:
                    create(sc);
                    break;
                case 2:
                    deposit(sc);
                    break;
                case 3:
                    withdraw(sc);
                    break;
                case 4:
                    getBalance(sc);
                    break;
                case 5:
                    display(sc);
                    break;
                case 6:
                    System.out.println("Exiting program...");
                    System.exit(0);
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }

    static void create(Scanner sc){
        System.out.print("\nEnter account number: ");
        String accNo=sc.nextLine();
        System.out.print("Enter account holder name: ");
        String name=sc.nextLine();
        System.out.print("Enter initial balance: ");
        double balance=sc.nextDouble();
        System.out.print("Enter account type: ");
        String type=sc.nextLine();
        a[cnt]=new Account(accNo, name, balance, type);
        System.out.println("Account created successfully.\n");
        cnt++;
    }

    static void deposit(Scanner sc) {
        System.out.print("\nEnter account number: ");
        String accNo = sc.nextLine();
        Account account = find(accNo);
        if (account != null) {
            System.out.print("Enter amount: ");
            double amount = sc.nextDouble();
            account.deposit(amount);
        } else {
            System.out.println("Account not found.");
        }
        System.out.println();
    }

    static void withdraw(Scanner sc) {
        System.out.print("\nEnter account number: ");
        String accNo = sc.nextLine();
        Account account = find(accNo);
        if (account != null) {
            System.out.print("Enter amount: ");
            double amount = sc.nextDouble();
            account.withdraw(amount);
        } else {
            System.out.println("Account not found.");
        }
        System.out.println();
    }

    static void getBalance(Scanner sc) {
        System.out.print("\nEnter account number: ");
        String accNo = sc.nextLine();
        Account account = find(accNo);
        if (account != null) {
            double balance = account.getBalance();
            System.out.println("Current Balance: " + balance);
        } else {
            System.out.println("Account not found.");
        }
        System.out.println();
    }

    static void display(Scanner sc) {
        System.out.print("\nEnter account number: ");
        String accNo = sc.nextLine();
        Account account = find(accNo);
        if (account != null) {
            System.out.println("Account Details:");
            account.display();
        } else {
            System.out.println("Account not found.");
        }
        System.out.println();
    }

    static Account find(String accNo) {
        for (int i = 0; i < cnt; i++) {
            if (a[i].getAccNo().equals(accNo)) {
                return a[i];
            }
        }
        return null;
    }
}
