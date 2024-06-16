package com.fatin.polymorphism;

// import main.java.com.fatin.polymorphism.Vehicle;

public class Truck extends Vehicle {
    double cargoCapacity;

    public Truck(String brand, int year, double cargoCapacity) {
        super(brand, year);
        this.cargoCapacity = cargoCapacity;
    }

    void load() {
        System.out.println("Truck is loading cargo");
    }
}
