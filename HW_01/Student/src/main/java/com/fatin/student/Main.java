package com.fatin.student;
import java.util.*;
/**
 *
 * @author MOHAMMAD FATIN NUR
 */
public class Main {
    static Student[] s = new Student[50];
    static int cnt = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("\n1. Add new student");
            System.out.println("2. Display all student records");
            System.out.println("3. Search by roll");
            System.out.println("4. Update information");
            System.out.println("5. Delete record");
            System.out.println("6. Exit");
            System.out.print("Enter option: ");
            int op = sc.nextInt();
            switch (op) {
                case 1:
                    add(sc);
                    break;
                case 2:
                    display();
                    break;
                case 3:
                    search(sc);
                    break;
                case 4:
                    update(sc);
                    break;
                case 5:
                    delete(sc);
                    break;
                case 6:
                    System.out.println("Exiting program...");
                    System.exit(0);
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }

    static void add(Scanner sc) {
        System.out.print("\nEnter name: ");
        sc.nextLine();
        String name = sc.nextLine();
        System.out.print("Enter roll: ");
        int roll = sc.nextInt();
        System.out.print("Enter age: ");
        int age = sc.nextInt();
        System.out.print("Enter grade: ");
        sc.nextLine();
        String grade = sc.nextLine();
        s[cnt] = new Student(name, roll, age, grade);
        cnt++;
        System.out.println("Student added successfully.");
        System.out.println();
    }

    static void display() {
        if (cnt == 0) {
            System.out.println("\nNo student records found.\n");
            return;
        }
        System.out.println("\nStudent Records:");
        for (int i = 0; i < cnt; i++) {
            System.out.println(s[i]);
        }
        System.out.println();
    }

    static void search(Scanner sc) {
        System.out.print("\nEnter roll number to search: ");
        int r = sc.nextInt();
        for (int i = 0; i < cnt; i++) {
            if (s[i].getRoll() == r) {
                System.out.println("Student found:");
                System.out.println(s[i]);
                System.out.println();
                return;
            }
        }
        System.out.println("Student not found.");
    }

    static void update(Scanner sc) {
        System.out.print("\nEnter roll number to update: ");
        int x = sc.nextInt();
        boolean flg = false;
        for (int i = 0; i < cnt; i++) {
            if (s[i].getRoll() == x) {
                System.out.print("Enter new grade: ");
                sc.nextLine();
                String newGrade = sc.nextLine();
                s[i].setGrade(newGrade);
                System.out.println("Student grade updated successfully.");
                flg = true;
                break;
            }
        }
        if (!flg)
            System.out.println("Student not found.");
        System.out.println();
    }

    static void delete(Scanner sc) {
        System.out.print("\nEnter roll number to delete: ");
        int x = sc.nextInt();
        boolean flg = false;
        for (int i = 0; i < cnt; i++) {
            if (s[i].getRoll() == x) {
                for (int j = i; j < cnt - 1; j++) {
                    s[j] = s[j + 1];
                }
                cnt--;
                System.out.println("Student record deleted successfully.");
                flg = true;
                break;
            }
        }
        if (!flg)
            System.out.println("Student not found.");
        System.out.println();
    }
}