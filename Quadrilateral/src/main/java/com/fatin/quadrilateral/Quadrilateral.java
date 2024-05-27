package com.fatin.quadrilateral;

/**
 *
 * @author MOHAMMAD FATIN NUR
 */
public class Quadrilateral {
    private Point p1,p2,p3,p4;
    public Quadrilateral(Point p1,Point p2,Point p3,Point p4){
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
        this.p4 = p4;
    }

    public Point getP1() {
        return p1;
    }

    public Point getP2() {
        return p2;
    }

    public Point getP3() {
        return p3;
    }

    public Point getP4() {
        return p4;
    }

    public float getLength(Point p1,Point p2){
        int x1 = p1.getX();
        int y1 = p1.getY();
        int x2 = p2.getX();
        int y2 = p2.getY();
        float length = (float) Math.sqrt(Math.pow(x2-x1,2)+Math.pow(y2-y1,2));
        return length;
    }
}
