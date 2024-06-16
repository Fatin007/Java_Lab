package com.fatin.polymorphism;

public class Vehicle {
    String brand;
    int year;

    public Vehicle(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }

    void drive() {
        System.out.println("Vehicle is driven");
    }

    public String toString() {
        return "Brand: " + brand + "\nYear: " + year;
    }
}
