package com.fatin.polymorphism;

// import main.java.com.fatin.polymorphism.Vehicle;

public class Car extends Vehicle{
    int numberOfDoors;

    public Car(String brand, int year, int numberOfDoors) {
        super(brand, year);
        this.numberOfDoors = numberOfDoors;
    }

    void honk(){
        System.out.println("Car is honking");
    }

    public String toString() {
        return super.toString() + "\nNumber of doors: " + numberOfDoors;
    }

    public void toPrintModel(){
        System.out.println("My brand Name is "+brand);
    }
    public void toPrintModel(int engineSize){
        System.out.println("My brand Name is "+brand+" Engine Size is "+engineSize);
    }
}
