package com.fatin.quadrilateral;

public class Parallelogram extends Quadrilateral{
    private int height; 
    public Parallelogram(Point p1, Point p2, Point p3, Point p4, int height) {
        super(p1, p2, p3, p4);
        this.height = height;
    }

    public float area() {
        float ab = getLength(getP1(), getP2());
        float bc = getLength(getP2(), getP3());
        if(ab>bc) return ab*height;
        else return bc*height;
    }
}
