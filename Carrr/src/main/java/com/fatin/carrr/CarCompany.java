package com.fatin.carrr;

import javax.swing.JLabel;

public class CarCompany {
    private String make, model,color;
    private int year;
    private double price;
    // public CarCompany(){}
    public String addCar(String make, String model, int year){
        this.make = make;
        this.model = model;
        this.year = year;
        
        // System.out.println("Car added successfully");
        // System.out.println("Make: "+make+"\nModel: "+model+"\nYear: "+year+"\n");
        return "Make: "+make+"  Model: "+model+"  Year: "+year+"  ";
        
    }
    public String addCar(String make, String model, int year, String color){
        this.make = make;
        this.model = model;
        this.color = color;
        this.year = year;
        // System.out.println("Car added successfully");
        // System.out.println("Make: "+make+"\nModel: "+model+"\nYear: "+year+"\nColor: "+color+"\n");
        return "Make: "+make+"  Model: "+model+"  Year: "+year+"  Color: "+color+"  ";

    }
    public String addCar(String make, String model, int year, double price){
        this.make = make;
        this.model = model;
        this.year = year;
        this.price = price;
        // System.out.println("Car added successfully");
        // System.out.println("Make: "+make+"\nModel: "+model+"\nYear: "+year+"\nPrice: "+(long)price+"\n");
        return "Make: "+make+" Model: "+model+"  Year: "+year+"  Price: "+(long)price+"  ";
    }
    public String addCar(String make, String model, int year, String color, double price){
        this.make = make;
        this.model = model;
        this.color = color;
        this.year = year;
        this.price = price;
        // System.out.println("Car added successfully");
        // System.out.println("Make: "+make+"\nModel: "+model+"\nYear: "+year+"\nColor: "+color+"\nPrice: "+(long)price+"\n");
        return "Make: "+make+"  Model: "+model+"  Year: "+year+"  Color: "+color+"  Price: "+(long)price+"  ";
    }
}
