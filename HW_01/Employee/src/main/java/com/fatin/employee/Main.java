package com.fatin.employee;
import java.util.*;

public class Main {
    static Employee a[] = new Employee[50]; 
    static int cnt = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        while (true) {
            System.out.println("\n1. Add new employee");
            System.out.println("2. Calculate monthly salary");
            System.out.println("3. Give salary increment");
            System.out.println("4. Search employee by ID");
            System.out.println("5. Exit");
            System.out.print("Enter option: ");
            char op = sc.next().charAt(0);
            Main m = new Main();
            sc.nextLine();
            switch (op) {
                case '1':
                    m.create(sc);
                    break;
                case '2':
                    m.monthlySalary(sc);
                    break;
                case '3':
                    m.giveIncrement(sc);
                    break;
                case '4':
                    m.display(sc);
                    break;
                case '5':
                    System.out.println("Exiting program...");
                    System.exit(0);
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }

    void create(Scanner sc) {
        System.out.print("\nEnter employee ID: ");
        String ID = sc.nextLine();
        System.out.print("Enter employee name: ");
        String name = sc.nextLine();
        System.out.print("Enter employee post: ");
        String post = sc.nextLine();
        System.out.print("Enter employee salary: ");
        double salary = sc.nextDouble();
        a[cnt] = new Employee(ID, name, post, salary);
        System.out.println("Employee added successfully.\n");
        cnt++;
        System.out.println("Total employees: " + cnt);
    }

    void monthlySalary(Scanner sc) {
        Employee e = search(sc);
        if (e != null) {
            e.calculateMonthlySalary();
        }
    }

    void giveIncrement(Scanner sc) {
        Employee e = search(sc);
        if (e != null) {
            System.out.print("Enter increment amount: ");
            double amount = sc.nextDouble();
            e.incrementSalary(amount);
            System.out.println("Increment successful.");
        }
    }

    void display(Scanner sc) {
        Employee e = search(sc);
        if (e != null) {
            e.display();
        }
    }

    Employee search(Scanner sc) {
        System.out.print("\nEnter employee ID: ");
        String ID = sc.nextLine();
        for (int i = 0; i < cnt; i++) {
            if (a[i].getID().equals(ID)) {
                return a[i];
            }
        }
        System.out.println("Employee not found.");
        return null;
    }
}