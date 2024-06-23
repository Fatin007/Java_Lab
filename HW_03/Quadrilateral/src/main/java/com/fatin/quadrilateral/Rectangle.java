package com.fatin.quadrilateral;

public class Rectangle extends Quadrilateral {
    public Rectangle(Point A, Point B, Point C, Point D) {
        super(A, B, C, D);
    }
    
    public double area() {
        double ab = getLength(getA(), getB());
        double bc = getLength(getB(), getC());
        // System.out.println(ab);
        // System.out.println(bc);
        return ab * bc;
    }
}