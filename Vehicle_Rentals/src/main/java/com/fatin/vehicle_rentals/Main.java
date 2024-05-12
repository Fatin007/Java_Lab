package com.fatin.vehicle_rentals;

import java.util.Scanner;

/**
 *
 * @author MOHAMMAD FATIN NUR
 */
public class Main {
    static Vehicle_Rentals a[] = new Vehicle_Rentals[50]; 
    static int cnt = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        while (true) {
            System.out.println("\n1. Add new vehicle (Admin only)");
            System.out.println("2. Rent vehicle");
            System.out.println("3. Display available vehicles");
            System.out.println("4. Display rented vehicles");
            System.out.println("5. Calculate total rental earnings");
            System.out.println("6. Exit");
            System.out.print("Enter option: ");
            char op = sc.next().charAt(0);
            Main m = new Main();
            sc.nextLine();
            switch (op) {
                case '1':
                    m.create(sc);
                    break;
                case '2':
                    m.rent(sc);
                    break;
                case '3':
                    m.showAvailable(sc);
                    break;
                case '4':
                    m.showRented(sc);
                    break;
                case '5':
                    m.Calculate(sc);
                    break;
                case '6':
                    System.out.println("Exiting program...");
                    System.exit(0);
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }

    void create(Scanner sc) {
        System.out.println("Enter admin password: ");
        String pass = sc.nextLine();
        if(!pass.equals("admin")) {
            System.out.println("Invalid password. Access denied.");
            return;
        }
        System.out.print("Enter ID: ");
        String ID = sc.nextLine();
        System.out.print("Enter type: ");
        String type = sc.nextLine();
        System.out.print("Enter model: ");
        String model = sc.nextLine();
        System.out.print("Enter rate: ");
        double rate = sc.nextDouble();
        a[cnt] = new Vehicle_Rentals(ID, type, model, rate);
        cnt++;
    }

    void rent(Scanner sc) {
        System.out.println("Enter vehicle type: ");
        String type = sc.nextLine();
        System.out.print("Enter your budget: ");
        double budget = sc.nextDouble();
        for (int i = 0; i < cnt; i++) {
            if (a[i].type.equals(type) && a[i].rate <= budget && a[i].isAvailable) {
                System.out.println();
                a[i].display();
            }
        }
        System.out.println("Enter ID of vehicle to rent: ");
        sc.nextLine();
        String ID = sc.nextLine();
        for (int i = 0; i < cnt; i++) {
            if (a[i].ID.equals(ID)) {
                a[i].setIsAvailable(false);
                System.out.println("Vehicle rented successfully.");
                return;
            }
        }
    }

    void showAvailable(Scanner sc) {
        System.out.println("Available vehicles: ");
        for (int i = 0; i < cnt; i++) {
            if (a[i].isAvailable) {
                System.out.println();
                a[i].display();
            }
        }
    }

    void showRented(Scanner sc) {
        System.out.println("Rented vehicles: ");
        for (int i = 0; i < cnt; i++) {
            if (!a[i].isAvailable) {
                System.out.println();
                a[i].display();
            }
        }
    }

    void Calculate(Scanner sc) {
        double total = 0;
        for (int i = 0; i < cnt; i++) {
            if (!a[i].isAvailable) {
                total += a[i].rate;
            }
        }
        System.out.println("Total rental earnings: " + total);
    }
}