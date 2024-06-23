package com.fatin.quadrilateral;

public class Trapezoid extends Quadrilateral {
    public Trapezoid(Point A,Point B,Point C,Point D){
        super(A,B,C,D);
    }

    public double area(){
        double area= 0.5 * Math.abs(getA().getX()*getB().getY()+getB().getX()*getC().getY()+getC().getX()*getD().getY()+getD().getX()*getA().getY()-getA().getY()*getB().getX()-getB().getY()*getC().getX()-getC().getY()*getD().getX()-getD().getY()*getA().getX());
        return area;
    }
}
