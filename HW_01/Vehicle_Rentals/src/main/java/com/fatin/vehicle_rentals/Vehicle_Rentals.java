package com.fatin.vehicle_rentals;
/**
 *
 * @author MOHAMMAD FATIN NUR
 */
public class Vehicle_Rentals {
    private String ID;
    private String type;
    private String model;
    private double rate;
    boolean isAvailable=true;
    public Vehicle_Rentals(String ID, String type, String model, double rate) {
        this.ID = ID;
        this.type = type;
        this.model = model;
        this.rate = rate;
    }

    public void setID(String ID){
        this.ID = ID;
    }

    public String getID() {
        return ID;
    }

    public void setType(String type){
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setModel(String model){
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void setRate(double rate){
        this.rate = rate;
    }

    public double getRate() {
        return rate;
    }

    public void setIsAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }

    public boolean getIsAvailable() {
        return isAvailable;
    }

    public String toString() {
        return "ID: " + ID + "\nType: " + type + "\nModel: " + model + "\nRate: " + rate;
    }
}
