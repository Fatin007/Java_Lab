package com.fatin.product_inventory;
/**
 *
 * @author MOHAMMAD FATIN NUR
 */
public class Product_Inventory {
    String ID;
    String name;
    double price;
    int quantity;

    public Product_Inventory(String ID, String name, double price, int quantity) {
        this.ID = ID;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    void setPrice(double price) {
        this.price = price;
    }

    void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    void display() {
        System.out.println("Product ID: " + ID);
        System.out.println("Product Name: " + name);
        System.out.println("Price: " + price);
        System.out.println("Quantity: " + quantity);
    }
}
