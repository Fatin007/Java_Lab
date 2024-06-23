package com.fatin.employee;

public class Employee {
    String ID;
    String name;
    String post;
    double salary;

    public Employee(String ID, String name, String post, double salary) {
        this.ID = ID;
        this.name = name;
        this.post = post;
        this.salary = salary;
    }

    String getID() {
        return ID;
    }

    void incrementSalary(double amount) {
        salary += amount;
    }

    void calculateMonthlySalary(){
        salary /= 12;
        System.out.println("Monthly Salary: " + salary);
    }

    public void display() {
        System.out.println("\nEmployee ID: " + ID);
        System.out.println("Employee Name: " + name);
        System.out.println("Employee Post: " + post);
        System.out.println("Employee Salary: " + salary);
    }
}