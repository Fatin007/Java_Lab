package com.fatin.polymorphism;

public class Polymorphism {

    public static void main(String[] args) {
        Car c1=new Car("Toyota", 2069, 4);
        c1.toPrintModel();
        c1.toPrintModel(69);
    }
}
