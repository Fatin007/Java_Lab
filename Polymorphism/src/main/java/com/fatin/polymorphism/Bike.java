package com.fatin.polymorphism;

// import main.java.com.fatin.polymorphism.Vehicle;

public class Bike extends Vehicle{
    boolean hasBell;

    public Bike(String brand, int year, boolean hasBell) {
        super(brand, year);
        this.hasBell = hasBell;
    }

    void ringBell(){
        System.out.println("Bike bell is ringing");
    }

    public String toString() {
        return super.toString() + "\nHas bell: " + hasBell;
    }
}
