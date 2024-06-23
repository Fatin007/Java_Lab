package com.fatin.quadrilateral;

public class Square extends Quadrilateral{
    public Square(Point A, Point B, Point C, Point D) {
        super(A, B, C, D);
    }
    
    public double area(){
        double ab = getLength(getA(), getB());
        return ab * ab;
    }
}
