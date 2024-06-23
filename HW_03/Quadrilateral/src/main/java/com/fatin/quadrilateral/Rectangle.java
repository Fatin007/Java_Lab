package com.fatin.quadrilateral;

public class Rectangle extends Quadrilateral {
    public Rectangle(Point p1, Point p2, Point p3, Point p4) {
        super(p1, p2, p3, p4);
    }
    
    public float area() {
        float ab = getLength(getP1(), getP2());
        float bc = getLength(getP2(), getP3());
        System.out.println(ab);
        System.out.println(bc);
        return ab * bc;
    }
}
