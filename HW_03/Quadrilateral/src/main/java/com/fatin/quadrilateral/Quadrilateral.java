package com.fatin.quadrilateral;

public class Quadrilateral {
    private Point A,B,C,D;
    public Quadrilateral(Point A,Point B,Point C,Point D){
        this.A = A;
        this.B = B;
        this.C = C;
        this.D = D;
    }

    public Point getA() {
        return A;
    }

    public Point getB() {
        return B;
    }

    public Point getC() {
        return C;
    }

    public Point getD() {
        return D;
    }

    public float getLength(Point p, Point q){
        return (float) Math.sqrt(Math.pow(q.getX()-p.getX(),2)+Math.pow(q.getY()-p.getY(),2));
    }
}
