package com.fatin.vehicle_rentals;
/**
 *
 * @author MOHAMMAD FATIN NUR
 */
public class Vehicle_Rentals {
    String ID;
    String type;
    String model;
    double rate;
    boolean isAvailable=true;
    public Vehicle_Rentals(String ID, String type, String model, double rate) {
        this.ID = ID;
        this.type = type;
        this.model = model;
        this.rate = rate;
    }

    void setIsAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }

    void display() {
        System.out.println("ID: " + ID);
        System.out.println("Type: " + type);
        System.out.println("Model: " + model);
        System.out.println("Rate: " + rate);
    }
}
